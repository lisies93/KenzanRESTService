package com.kenzan.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenzan.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findById(int id);
	List<Employee> findByStatusTrue();
	
}
