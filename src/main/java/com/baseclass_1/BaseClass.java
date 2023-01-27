package com.baseclass_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver; //null driver
	
	public static WebDriver getBrowser(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\Chromedriver.exe");
			 driver=new  ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			
			 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			 driver=new  FirefoxDriver();
			 
			
		}
		
		driver.manage().window().maximize();
		return driver;
		
		
	}
	//driver.get("https://adactinhotelapp.com/");
	public static void getUrl(String url) {
		driver.get(url);

	}
	
	
	
	//username password
	public static void inputText(WebElement element, String value) {
		element.sendKeys(value);
		
	}
	
		//submit.click();
	public static void ClickButton(WebElement element) {
		element.click();

	}				
	//WebElement value = driver.findElement(By.id("location"));
	//Select a = new Select(value);
	//a.selectByIndex(5);
	
	public static void dropDown(WebElement element, String type,String value) {
		Select s= new Select(element);
		if (type.equalsIgnoreCase("selectbyvalue")) {
			s.selectByValue(value);
			
		}
		else if (type.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
			
		}
		else if(type.equalsIgnoreCase("index")) {
		int index_value =	Integer.parseInt(value);
		s.selectByIndex(index_value);
		}
				}
	//sh reg button
	public static void ClickregButton(WebElement element1) {
		element1.click();		
}
	//clear ()
		
}

