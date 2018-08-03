package gov.healthdata.tests;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.utilities.ConfigurationReader;

public class TC002 extends TestBase {
	
	@Test(priority = 2, groups= {"smoke"})
	public void verifySearchBoxInHomePageTest() {
		
		driver.get(ConfigurationReader.getProperty("url"));
		actual =driver.getTitle();
		expected = "HealthData.gov";
		assertEquals(expected, actual);
		HealthDataMainPage mainPage =  new HealthDataMainPage();
		assertTrue(mainPage.searchField.isDisplayed());
	
	}
}
