package com.example.testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestA {

	public String str;
	
	@BeforeClass
	public void setUp() {
		str = "setUp";
		System.out.println(str);
	}
	
	@Test
	public void testPageTitleSampleA() {
		str = "testPageTitleSampleA()";
		System.out.println(str);
	}
	
	@Test
	public void testSampleTwo() {
		str = "testSampleTwo()";
		System.out.println(str);
	}
	
	@Test
	public void testSampleThree() {
		str = "testSampleThree()";
		System.out.println(str);
	}

	@AfterClass
	public void tearDown() {
		str = "tearDown";
		System.out.println(str);
	}
}
