package com.SkywareInventory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SkywareInventory.utility.Driver;



public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	@FindBy(linkText="Start FREE")
	public WebElement startFree ;
	
	@FindBy(linkText="Register")
	public WebElement register;
	
	@FindBy(linkText="Login")
	public WebElement login;
	
}
