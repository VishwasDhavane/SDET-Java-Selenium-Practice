package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics {
	
	
	//before suite
	//before test
	//before class
	//before method
	//Test case 
	//After method
	//After class
	//After test
	
	@BeforeSuite//1
	public void startsuite()
	{
		System.out.println("before suite");
	}
	
	@BeforeClass//3
	public void startclass()
	{
		System.out.println("before class");
	}
	
	
	@BeforeTest//2
	public void starttest()
	{
		System.out.println("before test");
	}
	
	@BeforeMethod//4
	public void startmethod()
	{
		System.out.println("before method");
	}
	
	
	@Test//5
	public void TestCase()
	{
		System.out.println("Test case 1");
	}
	
	
	@Test
	public void TestCase2()
	{
		System.out.println("Test case 2 ");
	}
	
	
	@Test
	public void TestCase3()
	{
		System.out.println("Test case 3 ");
	}
	
	
	@Test
	public void TestCase4()
	{
		System.out.println("Test case 4 ");
	}
	 
	
	@AfterSuite//9
	public void Endsuite()
	{
		System.out.println("After suite");
	}
	
	@AfterClass//7
	public void Endclass()
	{
		System.out.println("After class");
	}
	
	
	@AfterTest//8
	public void Endtest()
	{
		System.out.println("After test");
	}
	
	@AfterMethod//6
	public void Endmethod()
	{
		System.out.println("After method");
	}
	
	
	
	

}
