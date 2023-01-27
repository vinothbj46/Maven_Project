package com.TestNG_Aug;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority_Annotation {

	@BeforeSuite
	private void setproperty() {
	System.out.println("Set property");

	}

	@BeforeTest
	private void Browser_launchin() {
		System.out.println("launching Browser");

	}
	
	@BeforeClass
	
	private void Url_lanching() {
		System.out.println("https://www.facebook.com/");
		
	}
	
	@BeforeMethod
	private void Login_page() {
		System.out.println("LooginPage");
	}
	
	@Test(priority = 5)
	private void selecteOfDress() {
		System.out.println("SelectOfDress");
	}
	
	@Test(priority = -1,invocationCount = 2)
	
	private void selectSari() {
		System.out.println("Select Sari");

	}
	
	
	@Test(invocationCount = 3)
	
	private void T_shirt() {
		System.out.println("T Shirt");
	}
	
	@Test(enabled=false)
	private void coton_Shirt() {
	System.out.println("Cotton Shirt");
	}
	
	@Test(priority = -3,invocationCount =   2)
	private void shoe() {
		System.out.println("shoe");

	}
	
	@AfterClass
	private void homePage() {
		System.out.println("Home Page");
	}
	
	@AfterTest
	private void Browserclose() {
		System.out.println("Close Browser");
	}
	
	@AfterSuite
	private void Delete_cookies() {
		System.out.println("Cookies Delete");
	}
}
