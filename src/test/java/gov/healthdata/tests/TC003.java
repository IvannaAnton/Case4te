package gov.healthdata.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;
import gov.healthdata.utilities.Driver;

public class TC003 extends TestBase {
	HealthDataMainPage mainPage;
	HealthDataSearchResultPage searchPage;
	
	@Test
	public void searchFanctionality() {
		mainPage= new HealthDataMainPage();
		assertTrue(Driver.getDriver().getCurrentUrl().contains("www.healthdata.gov"));
	}

}