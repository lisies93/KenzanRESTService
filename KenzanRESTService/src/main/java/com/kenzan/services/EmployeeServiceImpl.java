package com.kenzan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenzan.entities.Employee;
import com.kenzan.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

   @Autowired
   private EmployeeRepository emplRepo;
	
   
   // find employee by Id
	@Override
	public Employee findById(int id) {
		
		Employee empl = emplRepo.findById(id);
		
		if(empl.getStatus() == true) {
			return empl;
		}
		
		return null;
	}
	
	//find ALL Employees in the Database
	@Override
	public List<Employee> getAllEmployees() {
		return emplRepo.findAll();
	}

	
	// find all ACTIVE employees
	@Override
	public List<Employee> findActiveEmployees() {
		return emplRepo.findByStatusTrue();
	}

	
	// create a new employee
	@Override
	public Employee create(Employee empl) {
		
		// by default all employees are active
		empl.setStatus(true);
		
		emplRepo.saveAndFlush(empl);
		return empl;
	}

	
	// update and existing employee
	@Override
	public Employee update(int eid, Employee empl) {
		
		Employee  manageEmpl = findById(eid);
		
		if(manageEmpl != null) {
			
			if(empl.getFirstName() != null) {
				manageEmpl.setFirstName(empl.getFirstName());
			}
			
			if(empl.getMiddleInitial() != null) {
			manageEmpl.setMiddleInitial(empl.getMiddleInitial());
			}
			
			if(empl.getLastName() != null) {
			manageEmpl.setLastName(empl.getLastName());
			}
			
			if(empl.getDateOfBirth() != null) {
			manageEmpl.setDateOfBirth(empl.getDateOfBirth());
			}
			
			if(empl.getDateOfEmployment() != null) {
			manageEmpl.setDateOfEmployment(empl.getDateOfEmployment());
			}
			
			emplRepo.saveAndFlush(manageEmpl);
			return manageEmpl;
			
		}
		
		
		return null;
	}

	
	// delete an existing employee (from active to inactive)
	@Override
	public boolean destroy(int eid) {
		
		
			Employee e = findById(eid);
			if(e != null) {
				e.setStatus(false);
				emplRepo.saveAndFlush(e);
				if (e.getStatus() == false) {
					return true;
				}
			}
		
		
		return false;
	}

	
	

}
