package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTest {

	@Autowired
	EmployeeRepo repo;
	
	@Test
	public void test() {
		System.out.println("inside the test");
		Employee e=new Employee();
		e.setEmpname("kk");
		e.setAge(34);
		e.setPhono("898989");
		assertNotNull(repo.save(e));
	}

}
