package gov.healthdata.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.utilities.Driver;

public class TC008 extends TestBase{
	
	HealthDataMainPage healthDataMainPage =  new HealthDataMainPage();
	@Test
	public void canNotAutomateTest8() {
		
		extentLogger = report.createTest("Can not be verify");
		assertTrue(Driver.getDriver().getCurrentUrl().contains("www.healthdata.gov"));
		
		//nothing to verify
		//auto suggestion does not exist
	}
}
