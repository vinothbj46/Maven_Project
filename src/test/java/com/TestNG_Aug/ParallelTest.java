package com.TestNG_Aug;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
			@Test
			private void amezonSite() throws InterruptedException {
				 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\Chromedriver.exe");
				WebDriver driver=new  ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				Thread.sleep(3000);
				driver.close();
	}
			@Test 
			private void FlipkartSite() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\Chromedriver.exe");
				WebDriver driver=new  ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				Thread.sleep(3000);
				driver.close();

			}
}
