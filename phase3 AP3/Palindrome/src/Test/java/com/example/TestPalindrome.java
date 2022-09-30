package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPalindrome {
	
 static Palindrome p;
@BeforeClass
public static void create() {
	p=new Palindrome();
	System.out.println("object created");
}

@Test
public void test1() {
	assertEquals("It is a palindrome number",p.checkPalindrome(12521));
	System.out.println("test case 1 success 'It is a palindrome' ");
}

@Test
public void test2() {
	assertEquals("Not a palindrome number",p.checkPalindrome(123));
	System.out.println("test case 2 executed 'Not a palindrome' ");
}

@AfterClass
public static void destroy() {
	p=null;
	System.out.println("object destroyed");
}
}
