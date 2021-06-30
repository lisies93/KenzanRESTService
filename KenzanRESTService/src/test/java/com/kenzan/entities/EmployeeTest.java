package com.kenzan.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.kenzan.repositories.EmployeeRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
class EmployeeTest {

	@Autowired
	private EmployeeRepository repo;
	
	@Test
	@DisplayName("testing employee entity")
    public void test() {
		
		Employee empl2 = repo.findById(1);
		assertEquals("Lois", empl2.getFirstName());	
		
    }
	
	
	@Test
	@DisplayName("testing create employee")
	public void test1() {
		
		Employee empl = new Employee();
		empl.setFirstName("Test");
		empl.setMiddleInitial("I");
		empl.setLastName("working");
		empl.setStatus(true);
		repo.saveAndFlush(empl);
		
		assertNotNull(empl);
		assertTrue(empl.getId() > 0);
		
	}
	

}
