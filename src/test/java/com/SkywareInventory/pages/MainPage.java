package com.SkywareInventory.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SkywareInventory.utility.Driver;



public class MainPage {
	public MainPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(id = "pageTitle")
	public WebElement pageTitle;
	
	@FindBy(linkText = "My Profile")
	public WebElement myProfile;
	
	@FindBy(xpath="//div[@id='login']/a")
    public WebElement greetingEmail;  
    
    @FindBy(xpath="//a[@id='subtabLink']")
    public WebElement logoutButton;
	
	
}
