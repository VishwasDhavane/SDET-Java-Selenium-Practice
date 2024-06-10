package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	
	
	@Test//5
	public void TestCase()
	{
		System.out.println("Test case 1");
	}
	
	
	@Test(dependsOnMethods = "TestCase")
	public void TestCase2()
	{
		System.out.println("Test case 2 ");
	}
	
	
	@Test(invocationCount = 5)
	public void TestCase3()
	{
		System.out.println("Test case 3 ");
	}
	
	
	@Test
	@Parameters({"url","email"})
	public void TestCase4(String url , String email)
	{
		System.out.println("Test case 4 ");
	}
	 

}
