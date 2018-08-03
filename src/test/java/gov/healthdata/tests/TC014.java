package gov.healthdata.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;
import gov.healthdata.utilities.ConfigurationReader;

public class TC014 extends TestBase {
	
	
	@Test(priority = 14)
	public void verifySearchFunyionalityTest() {
		
		
		
		driver.get(ConfigurationReader.getProperty("url"));
		actual =driver.getTitle();
		expected = "HealthData.gov";
		assertEquals(expected, actual);
		HealthDataMainPage hdMainPage = new HealthDataMainPage();
		hdMainPage.searchField.sendKeys("zxcvbnsdfghj");
		hdMainPage.searchButton.click();
		HealthDataSearchResultPage searchPage = new HealthDataSearchResultPage();
		actual = searchPage.noResults.getText();
		expected = "No results were found. Please try another keyword.";
		assertEquals(expected, actual);
		
	}

}
