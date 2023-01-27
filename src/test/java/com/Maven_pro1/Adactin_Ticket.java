package com.Maven_pro1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass_1.BaseClass;
import com.helperFile.FileReadManager;
import com.pojo_pom.LoginPage;
import com.pojo_pom.PageObjectManager;
import com.pojo_pom.SearchHotel;

public class Adactin_Ticket extends BaseClass { 
	 public static void main(String[] arg) throws IOException {
	             
		 
		    driver= getBrowser("CHROME");
		     getUrl("https://adactinhotelapp.com/");
		     
		    // LoginPage lp=new LoginPage(driver); 					//Loginpage
		     
		     PageObjectManager pom= new PageObjectManager(driver);
		     
		     inputText(pom.getInstanceLp().getUsername(), FileReadManager.instanceFRM().instanceCR().getUsername());
		     inputText(pom.getInstanceLp().getPassword(), FileReadManager.instanceFRM().instanceCR().getPassword());
		     ClickButton(pom.getInstanceLp().getSubmit());
			
			
		     //SearchHotel sh = new SearchHotel(driver);			 //Search page
		     
		    dropDown(pom.getInstancesh().getLocation(), "index", "2");
			dropDown(pom.getInstancesh().getHotels(), "index", "3");
			dropDown(pom.getInstancesh().getRoomType(), "index", "2");
			dropDown(pom.getInstancesh().getRoomType(), "index", "2");
			
			
			WebElement dateIn = driver.findElement(By.xpath("//input[@id='datepick_in']"));
			dateIn.clear();
			dateIn.sendKeys("07/06/2022");	
			
			WebElement dateOut=driver.findElement(By.xpath("//input[@id='datepick_out']"));
			//inputText(sh.getDateOut()."07/07/2022");
			dateOut.clear();
			dateOut.sendKeys("07/07/2022");
			
			dropDown(pom.getInstancesh().getAdultroom(), "index","2");
			dropDown(pom.getInstancesh().getChildRoom(), "index", "3");
			
		 	ClickregButton(pom.getInstancesh().getRegbutton());
		 	
			
		
			WebElement point=driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
			point.click();
			
			WebElement cont=driver.findElement(By.xpath("//input[@id='continue']"));
			cont.click();
			
			WebElement Fname=driver.findElement(By.name("first_name"));
			Fname.sendKeys("vinoth");
			
			WebElement lname=driver.findElement(By.name("last_name"));
			lname.sendKeys("BJ");
			
			WebElement address=driver.findElement(By.className("txtarea"));
			address.sendKeys("vinoth,tiruvannamalai.tamilnadu");
			
			WebElement cnumber=driver.findElement(By.xpath("//input[@id='cc_num']"));
			cnumber.sendKeys("1234567890123456");
			
			WebElement ctype=driver.findElement(By.xpath("//select[@class='select_combobox']"));
			Select v1=new Select(ctype);
			v1.selectByIndex(3);
			
			WebElement  edate1=driver.findElement(By.xpath("//select[@class='select_combobox2']"));
			Select v2=new Select(edate1);
			v2.selectByIndex(3);
			
			
			WebElement edate2=driver.findElement(By.xpath("//select[@class='select_combobox2'][2]"));
			Select v3=new Select(edate2)	;
			v3.selectByIndex(2);
			
			WebElement ccvnum=driver.findElement(By.xpath("//input[@id='cc_cvv']"));
			ccvnum.sendKeys("4622");
			
			WebElement booknow=driver.findElement(By.xpath("//input[@class='reg_button']")) ;
				booknow.click();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
	
	 
	 
	 }

}
