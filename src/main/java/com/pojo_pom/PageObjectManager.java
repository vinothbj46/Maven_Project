package com.pojo_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
	
	//collection of objects
	
			public static WebDriver driver;
			
			private  LoginPage lp;
			private SearchHotel sh;
			
			public PageObjectManager(WebDriver driver2) {
			this .driver=driver2;
			PageFactory.initElements(driver2, this);
			}
			
			public LoginPage getInstanceLp() {
			      lp=new LoginPage(driver); 					//Loginpage
			      return lp;

			
			}
			public SearchHotel getInstancesh() {
			      sh = new SearchHotel(driver);			 //Search page
			      return sh;

			

			}
				



}
