package com.SkywareInventory.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.SkywareInventory.pages.HomePage;
import com.SkywareInventory.pages.RegisterPage;



public class TC004_RegisterButton  extends TestBase{
	HomePage homePage = new HomePage();
	RegisterPage registration = new RegisterPage();

	@Test
	public void RegisterUserPositive() {
		assertEquals(driver.getTitle(), "Skyware Inventory | Free Web Based Inventory Tracking Software");
		homePage.register.click();
		assertEquals(registration.pageTitle.getText(), "Register for your FREE single user account");
		registration.cookie.click();
		registration.RegisterUser();
        assertEquals(registration.message.getText(), "Your new profile has been created! Please check your email to activate.");
	}

}
