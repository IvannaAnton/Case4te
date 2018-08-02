package gov.healthdata.tests;

import org.openqa.selenium.Keys;

import org.testng.Assert;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.utilities.ConfigurationReader;

public class TC015 extends TestBase{

	public void TryPressingEnterKkeyInsteadOfClickingSearchButton() {
		
		driver.get(ConfigurationReader.getProperty("url"));
		Assert.assertEquals(driver.getTitle(), "HealthData.gov");
		
		
		HealthDataMainPage healthDataMainPage = new HealthDataMainPage();
		String search = "Health";
		healthDataMainPage.searchField.sendKeys(search);
		healthDataMainPage.searchButton.click();
		String getTitle = driver.getTitle();
		driver.navigate().back();
		
		
	
		healthDataMainPage.searchField.sendKeys(search);
		healthDataMainPage.searchField.sendKeys(Keys.ENTER);
		String KeyTitle = driver.getTitle();
		
		Assert.assertEquals(getTitle, KeyTitle);
		
	}
}
