package com.kenzan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenzan.entities.Employee;
import com.kenzan.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

   @Autowired
   private EmployeeRepository emplRepo;
	
	@Override
	public Employee findById(int id) {
		return emplRepo.findById(id);
	}

}
