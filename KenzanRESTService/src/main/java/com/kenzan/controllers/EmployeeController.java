package com.kenzan.controllers;

import java.util.List;

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
	
		
	// retrieves 1 record by ID
	@GetMapping(path = "employees/{id}")
	public Employee show(@PathVariable int id, HttpServletResponse resp) {

		Employee emp = emplService.findById(id);

		if (emp == null) {
			resp.setStatus(404);
		}

		return emp;
	}
	
	// retrieves all Active employees
	@GetMapping(path = "employees")
	public List<Employee> index(){
		return emplService.findActiveEmployees();
	}
	
	// retrieves all employees in the database
	@GetMapping(path = "employees/all")
	public List<Employee> getAllEmployees(){
		return emplService.getAllEmployees();
	}
	
	// creates a new employee
	@PostMapping("employees")
	public Employee create(HttpServletResponse res, @RequestBody Employee empl) {
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

// updates an existing record
	@PutMapping("employees/{eid}")
	public Employee update(HttpServletResponse res, @PathVariable int eid, @RequestBody Employee empl) {
		
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

	//deletes a record (it makes it inactive)
	@DeleteMapping("employees/{eid}")
	public void destroy(HttpServletResponse res, @PathVariable int eid) {
		
			
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
