package com.flm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flm.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	//DSL
	List<Employee> findByName(String c);
	List<Employee> findByAddress(String a);
	List<Employee> findByNameAndAddress(String name, String address);
	List<Employee> findByNameOrAddress(String name, String address);
	List<Employee> findByNameLike(String name);
	List<Employee> findByNameStartingWith(String name);
	
	//JPQL
	@Query(value = "from Employee")
	List<Employee> getAllEmployees();
	@Query(value = "from Employee where salary <= :murty")
	List<Employee> getAllEmployeesOnSalaries(@Param("murty") Double salary);

	//SQL
	@Query(value = "select * from employee", nativeQuery = true)
	List<Employee> getAllEmployeesUsingSQL();	
	@Query(value = "select * from employee where salary <= :murty" , nativeQuery = true)
	List<Employee> getAllEmployeesBasedOnSalariesUsingSQL(@Param("murty") Double salary);
	
	
	
}
