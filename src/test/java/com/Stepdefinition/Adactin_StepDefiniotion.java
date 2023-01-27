package com.Stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Maven_pro1.Adactin_Ticket;
import com.helperFile.FileReadManager;
import com.pojo_pom.PageObjectManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;



public class Adactin_StepDefiniotion extends Adactin_Ticket {
	
	public static WebDriver driver= getBrowser("chrome");
	PageObjectManager pom = new PageObjectManager(driver);
	
	
	@Given("^User is Launch the application$")
	public void user_is_Launch_the_application() throws Throwable {
		getUrl("https://adactinhotelapp.com/");
		
	   
	}
	@When("^User is enter the Username in username field$")
	public void user_is_enter_the_Username_in_username_field() throws Throwable {
		inputText(pom.getInstanceLp().getUsername(), FileReadManager.instanceFRM().instanceCR().getUsername());
	     
	}
	@And("^User is enter the Password in password field$")
	public void user_is_enter_the_Password_in_password_field() throws Throwable {
		inputText(pom.getInstanceLp().getPassword(), FileReadManager.instanceFRM().instanceCR().getPassword());
	     
	}

	@Then("^User is click on submit Button$")
	public void user_is_click_on_submit_Button() throws Throwable {
		ClickButton(pom.getInstanceLp().getSubmit());
	    
	}

	
		}


	


