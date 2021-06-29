package com.kenzan.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kenzan.entities.Employee;
import com.kenzan.services.EmployeeService;

@RequestMapping("api")
@RestController
public class EmployeeController {

	@Autowired 
	private EmployeeService emplService;
	
	
	@GetMapping("ping")
	public String ping() {
		return "working";
	}
	
	
	@GetMapping(path = "employees/{id}")
	public Employee show(@PathVariable int id, HttpServletResponse resp) {

		Employee emp = emplService.findById(id);

		if (emp == null) {
			resp.setStatus(404);
		}

		return emp;
	}
	
	
	@GetMapping(path = "employees")
	public List<Employee> index(){
		return emplService.findActiveEmployees();
	}
	
	
	@PostMapping("employees")
	public Employee create(HttpServletRequest req, HttpServletResponse res, @RequestBody Employee empl) {
		try {
			empl = emplService.create(empl);
			res.setStatus(201);
		} catch (Exception e) {
			System.err.println(e);
			res.setStatus(400);
			empl = null;
		}
		return empl;
	}


	@PutMapping("employees/{eid}")
	public Employee update(HttpServletRequest req, HttpServletResponse res, @PathVariable int eid, @RequestBody Employee empl) {
		
		try {
			empl = emplService.update(eid,empl);
			if (empl == null) {
				res.setStatus(404);
			}
		} catch (Exception e) {
			System.err.println(e);
			res.setStatus(400);
			empl = null;
		}
		return empl;
	}

	
	@DeleteMapping("employees/{eid}")
	public void destroy(HttpServletRequest req, HttpServletResponse res, @PathVariable int eid) {
		
			
			try {
				if (emplService.destroy(eid)) {
					res.setStatus(204);
				} else {
					res.setStatus(404);
				}
			} catch (Exception e) {
				System.err.println(e);
				res.setStatus(400);
			}
			
		
	
	}
}
