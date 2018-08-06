package gov.healthdata.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;
import gov.healthdata.utilities.ConfigurationReader;
import gov.healthdata.utilities.Driver;

public class TC019 extends TestBase {
	
	@Test
	public void verifySearchBoxTest() {
		
	
		assertTrue(Driver.getDriver().getCurrentUrl().contains("www.healthdata.gov"));
		HealthDataMainPage hdMainPage = new HealthDataMainPage();
		hdMainPage.searchField.sendKeys("halth");
		hdMainPage.searchButton.click();
		HealthDataSearchResultPage searchPage = new HealthDataSearchResultPage();
		actual = searchPage.searchResultHealth.getAttribute("value");
		expected = "health";
		assertNotEquals(expected,actual);
		
		
		
		
	}

}
