package gov.healthdata.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;
import gov.healthdata.utilities.Driver;

public class TC003 extends TestBase {
	HealthDataMainPage mainPage;
	HealthDataSearchResultPage searchPage;
	
	@Test( groups= {"smoke"})
	public void searchFanctionalityPositive() {
		
		extentLogger = report.createTest("Verify search funtionality");
		mainPage= new HealthDataMainPage();
		assertTrue(Driver.getDriver().getCurrentUrl().contains("www.healthdata.gov"));
		mainPage.searchField.sendKeys("Health");
		mainPage.searchButton.click();
		searchPage = new HealthDataSearchResultPage();
		WebDriverWait wait= new WebDriverWait(Driver.getDriver(),5);
		//is starts waiting 
		wait.until(ExpectedConditions.visibilityOf(searchPage.searchResultHealth));
	//  "   4301 results    "
		Integer result=Integer.parseInt(searchPage.searchResultNumber.getText().replace(" results", "").trim());
		assertTrue(result>1);
	}

}