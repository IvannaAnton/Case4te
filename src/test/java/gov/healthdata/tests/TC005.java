package gov.healthdata.tests;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;
import gov.healthdata.utilities.ConfigurationReader;
import gov.healthdata.utilities.Driver;

public class TC005 extends TestBase {
	HealthDataMainPage mainPage;

	@Test
	public void clickTheSearchButtonWithEmptySearchBox() {

		mainPage = new HealthDataMainPage();
		actual = Driver.getDriver().getCurrentUrl();
		expected = "www.healthdata.gov";
		assertTrue(actual.contains(expected));

		mainPage.searchField.sendKeys("");
		mainPage.searchButton.click();
		actual = driver.getTitle();
		expected = "HealthData.gov";
		assertEquals(expected, actual);
	}
}
