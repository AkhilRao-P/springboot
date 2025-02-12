package com.flm;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flm.entity.Employee;
import com.flm.repository.EmployeeRepository;

@SpringBootTest
class SpringbootWebDataJan18ApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	//@Test
	void testSaveEmployee(){
		Employee emp = new Employee("Shaziya", "Eluru", 192000d);
		emp = employeeRepository.save(emp);
		System.out.println(emp);
		Assertions.assertNotNull(emp.getId());
	}

	@Test
	void testFindByName(){
		List<Employee> emps = employeeRepository.getAllEmployeesBasedOnSalariesUsingSQL(15000D);
		emps.forEach(emp -> System.out.println(emp));
	}
}
