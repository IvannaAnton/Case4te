package gov.healthdata.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;
import gov.healthdata.utilities.Driver;

public class TC004  extends TestBase{
	HealthDataMainPage mainPage;
	HealthDataSearchResultPage searchPage;
	
	@Test(groups="Regretion test")
	public void searchFanctionalityNegative() {
		
		extentLogger = report.createTest("Verify search funtionality negative test");
		mainPage= new HealthDataMainPage();
		assertTrue(Driver.getDriver().getCurrentUrl().contains("www.healthdata.gov"));
		mainPage.searchField.sendKeys("sausage");
		mainPage.searchButton.click();
		searchPage = new HealthDataSearchResultPage();
		assertEquals(searchPage.notFoundMessage.getText(),"No results were found. Please try another keyword.");
		
	}

}
