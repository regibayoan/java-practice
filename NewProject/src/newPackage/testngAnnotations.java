package newPackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testngAnnotations {
	
	// All the Annotations in TestNG 
	// Even though all these are in different order. Once the program runs, the execution flow will be 
	// still be hierarchal
	
	@Test
	public void testCase1(){
		System.out.println("In Test Case 1");
	}
	
	@Test
	public void testCase2(){
		System.out.println("In Test Case 2");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("In Before Method");
	}
	@AfterMethod
	public void AfterMethod(){
		System.out.println("In After Method");
	}
	@BeforeTest
	public void BeforeTest(){
		System.out.println("In Before Test");
	}
	@AfterTest
	public void AfterTest(){
		System.out.println("In After Test");
	}
	@BeforeClass
	public void BeforeClass(){
		System.out.println("In Before Class");
	}
	@AfterClass
	public void AfterClass(){
		System.out.println("In After Class");
	}
	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("In Before Suite");
	}
	@AfterSuite
	public void AfterSuite(){
		System.out.println("In After Suite");
	}
}