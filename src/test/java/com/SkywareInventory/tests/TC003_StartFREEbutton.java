package com.SkywareInventory.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.SkywareInventory.pages.HomePage;
import com.SkywareInventory.pages.RegisterPage;
import com.SkywareInventory.utility.Driver;


public class TC003_StartFREEbutton extends TestBase {
	HomePage homePage;
	RegisterPage registration;

	@Test(groups= {"smoke"})
	public void RegisterUserPositive() {
		homePage = new HomePage();
		assertEquals(Driver.getDriver().getTitle(), "Skyware Inventory | Free Web Based Inventory Tracking Software");
		homePage.startFree.click();
		registration = new RegisterPage();
		assertEquals(registration.pageTitle.getText(), "Register for your FREE single user account");
		registration.cookie.click();
		registration.RegisterUser();
		assertEquals(registration.message.getText(), "Your new profile has been created! Please check your email to activate.");
	}

}