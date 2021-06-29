package com.kenzan.services;

import java.util.List;

import com.kenzan.entities.Employee;

public interface EmployeeService {

	public Employee findById(int id);
	public List<Employee> findActiveEmployees();
	public Employee create(Employee empl);
    public Employee update(int eid, Employee empl);
    public boolean destroy(int eid);
	
}
