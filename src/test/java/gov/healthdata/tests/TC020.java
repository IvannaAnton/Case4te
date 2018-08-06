package gov.healthdata.tests;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;
import gov.healthdata.utilities.Driver;

public class TC020 extends TestBase {

	HealthDataMainPage healthDataMainPage = new HealthDataMainPage();
	HealthDataSearchResultPage healthDataSearchResultPage = new HealthDataSearchResultPage();

	@Test
	public void incorrectDataSearch() {
		assertTrue(Driver.getDriver().getTitle().contains("HealthData.gov"));
		healthDataMainPage.searchField.sendKeys("halth");
		healthDataMainPage.searchButton.click();
		assertEquals((healthDataSearchResultPage.notFoundMessage.getText()),
				"No results were found. Please try another keyword.");

	}


}
