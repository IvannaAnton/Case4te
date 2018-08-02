package gov.healthdata.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;
import gov.healthdata.utilities.ConfigurationReader;

public class TC019 extends TestBase {
	
	@Test(priority = 19)
	public void verifySearchBoxTest() {
		
		extentLogger = report.createTest("Verify is the search box offer typo corrections for the search query...Fail");
		driver.get(ConfigurationReader.getProperty("url"));
		actual =driver.getTitle();
		expected = "HealthData.gov";
		assertEquals(expected, actual);
		HealthDataMainPage hdMainPage = new HealthDataMainPage();
		hdMainPage.searchField.sendKeys("halth");
		hdMainPage.searchButton.click();
		HealthDataSearchResultPage searchPage = new HealthDataSearchResultPage();
		actual = searchPage.searchResultHealth.getAttribute("value");
		expected = "health";
		assertNotEquals(expected,actual);
		
		
		
		
	}

}
