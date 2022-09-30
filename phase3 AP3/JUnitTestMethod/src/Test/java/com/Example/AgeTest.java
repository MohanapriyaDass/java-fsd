package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AgeTest {
	AgeValidator agevalid;
	@Before
	public void objectcreate() {
		agevalid=new AgeValidator();
		System.out.println("agevalid object created");
	}
	@Test
	public void test1() {
		/*if the expected output==actual output- pass
		 * if the expected output!=actual output-fail-bugs
		 *  */
		assertEquals("not eligible", agevalid.ageValid(2));
		System.out.println("test case 1");
	}
	
	
	@Test
	public void test2() {
		/*if the expected output==actual output- pass
		 * if the expected output!=actual output-fail-bugs
		 *  */
		assertEquals("right to vote", agevalid.ageValid(20));
		System.out.println("test case 2");
	}
	
	@After
	public void objectremove() {
		agevalid=null;
		System.out.println("object is removed");
	}




}
