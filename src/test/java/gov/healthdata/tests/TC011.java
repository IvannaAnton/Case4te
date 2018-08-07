package gov.healthdata.tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;

public class TC011 extends TestBase {
	HealthDataMainPage mainPage;
	HealthDataSearchResultPage resultPage;
	@Test 
	public void VerifyTheResultMatchFilterTopicResult(){
		extentLogger = report.createTest("Verify the result match filter topic result ");
	    mainPage =  new HealthDataMainPage();
	    resultPage = new HealthDataSearchResultPage();
		mainPage.searchField.sendKeys("health"+Keys.ENTER);
		resultPage.healthClick.click();
		int healthResult = Integer.parseInt(resultPage.resultFiltreHealthOfHealth.getText().replaceAll("[^0-9]+", ""));
		resultPage.hospitalClick.click();
		int hospitalResult = Integer.parseInt(resultPage.resultFiltreHealthOfHealth.getText().replaceAll("[^0-9]+", ""));
		assertTrue(healthResult>hospitalResult);
	}

}