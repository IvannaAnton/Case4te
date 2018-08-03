package gov.healthdata.tests;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.utilities.ConfigurationReader;
import gov.healthdata.utilities.Driver;

public class TC002 extends TestBase {
	
	@Test(priority = 2, groups= {"smoke"})
	public void verifySearchBoxInHomePageTest() {
		
		
		assertTrue(Driver.getDriver().getCurrentUrl().contains("www.healthdata.gov"));
		HealthDataMainPage mainPage =  new HealthDataMainPage();
		assertTrue(mainPage.searchField.isDisplayed());
	
	}
}
