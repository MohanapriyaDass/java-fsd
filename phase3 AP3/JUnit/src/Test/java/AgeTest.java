package com.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AgeTest {
	@BeforeClass
	public static void before() {
		System.out.println("before");
	}
//	@Before
//	public void before() {
//		System.out.println("before");
//	}
	@Test
	public void test1() {
		System.out.println("in test case -1");
	}

	@Test
	public void test2() {
		System.out.println("in test case -2");
	}
	@AfterClass
	public static void after() {
		System.out.println("after");
	}
//	@After
//	public void after() {
//		System.out.println("after");
//	}

}