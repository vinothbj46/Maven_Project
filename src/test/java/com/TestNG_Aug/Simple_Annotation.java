package com.TestNG_Aug;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	@BeforeSuite
	private void Setproperty() {
		System.out.println("Set Property");
	}
	@BeforeTest
	private void Launching() {
		System.out.println("Browser_Launching");
	}
	@BeforeClass
	private void Url_Launching() {
		System.out.println("https://www.flipkart.com/");	
	}
	@BeforeMethod
	private void Login_Page() {
		System.out.println("Loginpage");
	}
	@Test
	private void Select_Dress() {
		System.out.println("Dress_Select");
	}
	@Test
	private void T_Shirt() {
		System.out.println("Selected T_Shirt");
	}
	@Test
	private void FormalShirt() {
		System.out.println("Selected F_Shirt");
	}
	@Test
	private void CasualShirt() {
		System.out.println("Selected C_Shirt");
	}
	@AfterMethod
	private void Logout() {
		System.out.println("Logout_page");
	}
	@AfterClass
	private void HomePage() {
	System.out.println("Home_Page");
	}
	@AfterTest
	private void ClosePage() {
		System.out.println("Close_page");
	}
	@AfterSuite
	private void DeleteAllCookies() {
		System.out.println("Cookies_Deleted");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
