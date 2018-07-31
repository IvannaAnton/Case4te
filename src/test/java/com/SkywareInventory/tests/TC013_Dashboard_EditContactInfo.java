package com.SkywareInventory.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.SkywareInventory.pages.HomePage;
import com.SkywareInventory.pages.LoginPage;
import com.SkywareInventory.pages.MainPage;
import com.SkywareInventory.pages.MyProfilePage;
import com.SkywareInventory.utility.ConfigurationReader;
import com.SkywareInventory.utility.Driver;

public class TC013_Dashboard_EditContactInfo extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	MainPage mainPage;
	MyProfilePage myProfilePage;
	

	@Test(groups= {"smoke"})
   public void Dashboard() {
		homePage = new HomePage();
		assertEquals(Driver.getDriver().getTitle(), "Skyware Inventory | Free Web Based Inventory Tracking Software");
		homePage.login.click();
		loginPage= new LoginPage();
		loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.submit.click();
		mainPage= new MainPage();
		assertEquals(Driver.getDriver().getTitle(), "Skyware Inventory | Dashboard");
		assertEquals(mainPage.pageTitle.getText(),"Dashboard");
		mainPage.myProfile.click();
		myProfilePage = new MyProfilePage();
		assertEquals(Driver.getDriver().getTitle(), "Skyware Inventory | My Profile");
		myProfilePage .cookie.click();
		assertTrue(myProfilePage .editButton.isEnabled());
		myProfilePage .editButton.click();
		myProfilePage .country().selectByVisibleText("Belgium");
		myProfilePage .accountName.sendKeys("Cybertek");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",myProfilePage .saveButton);
		myProfilePage .saveButton.click();
		assertTrue(myProfilePage .success.isDisplayed());;
	
		
	
}
}
