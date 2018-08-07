package gov.healthdata.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;
import gov.healthdata.utilities.Driver;


public class TC013 extends TestBase {
	HealthDataMainPage mainPage;
	HealthDataSearchResultPage searchPage;
	
	@Test
	public void searchFanctionalityPositive() {
		
		extentLogger = report.createTest("Verify search funtionality positive test");
		mainPage= new HealthDataMainPage();
		mainPage.searchField.sendKeys("Health");
		mainPage.searchButton.click();
		searchPage = new HealthDataSearchResultPage();
		assertTrue(searchPage.searchResultHealth.isDisplayed());
		searchPage.tags.click();
		assertTrue(searchPage.tagsOptions.size()>0);
		searchPage.tags.click();
		assertTrue(searchPage.tagsOptions.size()>0);
		
		
	}
}
