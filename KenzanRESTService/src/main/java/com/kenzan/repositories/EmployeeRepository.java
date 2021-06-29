package com.kenzan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenzan.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findById(int id);
	
}
