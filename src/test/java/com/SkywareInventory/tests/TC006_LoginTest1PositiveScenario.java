package com.SkywareInventory.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.SkywareInventory.pages.HomePage;
import com.SkywareInventory.pages.LoginPage;
import com.SkywareInventory.pages.MainPage;
import com.SkywareInventory.utility.ConfigurationReader;
import com.SkywareInventory.utility.Driver;

public class TC006_LoginTest1PositiveScenario  extends TestBase{
	    HomePage homePage;
	    LoginPage loginPage;
	   MainPage dashboard;
	    @Test(groups= {"smoke"})
	public void loginTest1PositiveScenario(){
	    	homePage=new HomePage();
	        assertEquals(Driver.getDriver().getTitle(),"Skyware Inventory | Free Web Based Inventory Tracking Software", "titles are NOT matching");
	        assertTrue(homePage.login.isEnabled(),"loginButton is NOT clickable");
	        homePage.login.click();
	        loginPage=new LoginPage();
	        assertEquals(Driver.getDriver().getTitle(),"Skyware Inventory | Log in");
	        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
	        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
	        assertTrue(loginPage.submit.isEnabled(), "loginSubmit button is Not clickable");
	        loginPage.submit.click();
	        assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.skywareinventory.com/secure/dashboard");
	        dashboard= new MainPage();
	        assertTrue(dashboard.greetingEmail.getText().contains(ConfigurationReader.getProperty("username")));
	        
	        
	}
}
