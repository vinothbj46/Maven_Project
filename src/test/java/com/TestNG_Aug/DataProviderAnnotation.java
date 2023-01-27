package com.TestNG_Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	@org.testng.annotations.DataProvider(name="login")
			private Object[][] credentialData() {
			 Object[][] data= {
					{"admin","admin123"},
					{"root","root123"},
					{"vinoth4620","0FCB20"}
					
			};
				return data;
			}
	
			@Test(dataProvider = "login")
			private void loginScenario(String Uname,String Pass) {
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\Chromedriver.exe");
				WebDriver driver=new  ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://adactinhotelapp.com/");
				
				WebElement Username = driver.findElement(By.id("username"));
				Username.sendKeys("vinoth4620");
				
				WebElement Password = driver.findElement(By.id("password"));
				Password.sendKeys("0FCB20");
				
				WebElement login =driver.findElement(By.id("login"));
				login.click();
				
				driver.close();
			}
}
