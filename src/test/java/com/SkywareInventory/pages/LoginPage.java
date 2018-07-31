package com.SkywareInventory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SkywareInventory.utility.Driver;



public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	@FindBy(id="username")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submit;
	
	
}
