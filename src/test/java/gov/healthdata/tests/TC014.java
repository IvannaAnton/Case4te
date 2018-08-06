package gov.healthdata.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;
import gov.healthdata.utilities.ConfigurationReader;
import gov.healthdata.utilities.Driver;

public class TC014 extends TestBase {
	
	HealthDataMainPage hdMainPage;
	HealthDataSearchResultPage searchPage;
	@Test
	public void verifySearchFunyionalityTest() {
		
		
		
		assertTrue(Driver.getDriver().getCurrentUrl().contains("www.healthdata.gov"));
	    hdMainPage = new HealthDataMainPage();
		hdMainPage.searchField.sendKeys("zxcvbnsdfghj");
		hdMainPage.searchButton.click();
		searchPage = new HealthDataSearchResultPage();
		actual = searchPage.noResults.getText();
		expected = "No results were found. Please try another keyword.";
		assertEquals(expected, actual);
		
	}

}
