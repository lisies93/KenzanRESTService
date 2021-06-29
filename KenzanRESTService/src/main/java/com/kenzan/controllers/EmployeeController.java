package com.kenzan.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
}
