package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	//JPQL 
	@Query("select employee from Employee employee where employee.empname=?1")
	public List<Employee> findByname(String name);
	//JPQL
}
