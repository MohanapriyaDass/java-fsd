package com.example;

import org.junit.Test;

public class AssertionTest {
	@Test
 public void asserttest() {
	 assertTrue(4>0);
	 assertFalse(4>3);
	 
	 String s1=null;
	 String s2="kalvi";
	 assertNull(s1);
	 assertNotNull(s2);
	 
	 assertSame(s2, s2);
     assertNotSame(s1, s2);
     
     assertEquals(5, 5);
     assertNotEquals(5, 6);

     String[] a1 = { "A", "B" };
     String[] a2 = { "A", "B" };
     assertArrayEquals(a1, a2);
 }
}
