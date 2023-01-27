package com.pojo_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;    //null driver
	
	
	//WebElement Username = driver.findElement(By.id("username"));
	
				@FindBy(id="username")
				private WebElement Username;
				
				//	WebElement Password = driver.findElement(By.id("password"));
	
	
				@FindBy(id="password")
				private WebElement Password;
				
				//WebElement value = driver.findElement(By.id("location"));
				
				@FindBy(xpath="//input[@name='login']")
				private WebElement submit;
				
				public LoginPage(WebDriver driver2) {
					this.driver=driver2;
					PageFactory.initElements(driver2, this);
				}

				public WebElement getUsername() {
					return Username;
				}

				public WebElement getPassword() {
					return Password;
				}

				public WebElement getSubmit() {
					return submit;
				}



				}
			
				

				
	
	

