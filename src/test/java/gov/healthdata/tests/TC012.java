package gov.healthdata.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;
import gov.healthdata.utilities.ConfigurationReader;

public class TC012 extends TestBase {

	@Test(priority = 12, groups= {"smoke"})
	public void VerifyTheResultMatchFiltertTopic() {
		//1 Go to www.healthdata.gov URL.
		driver.get(ConfigurationReader.getProperty("url"));
		Assert.assertEquals(driver.getTitle(), "HealthData.gov");
		
		//2Input valid data in the search box.
		HealthDataMainPage healthDataMainPage = new HealthDataMainPage();
		
		String search = "group";
		healthDataMainPage.searchField.sendKeys(search);
	//3 Click "Search" button.
		healthDataMainPage.searchButton.click();
		HealthDataSearchResultPage healthDataSearchResultPage = new HealthDataSearchResultPage();
		//4Varify the filter "topic" total count match the search count result.
			System.out.println(healthDataSearchResultPage.searchResultHealth.getText().equals(search));
	
	}
}
		
		
	
	


