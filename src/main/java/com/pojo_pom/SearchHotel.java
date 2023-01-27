package com.pojo_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(name="room_type")
	private WebElement roomType;
	
	@FindBy(name="room_nos")
	private WebElement RoomNos;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement dateIn;
	
	@FindBy(xpath="input[@id='datepick_out']")
	private WebElement dateOut;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adultroom;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childRoom;
	
	@FindBy(xpath="//input[@class='reg_button']")
	private WebElement Regbutton;

	public SearchHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return RoomNos;
	}

	public WebElement getDateIn() {
		return dateIn;
	}

	public WebElement getDateOut() {
		return dateOut;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getRegbutton() {
		return Regbutton;
	}


}
