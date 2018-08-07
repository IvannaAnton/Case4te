package gov.healthdata.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import gov.healthdata.utilities.Driver;

public class TC001 extends TestBase { 

	@Test( groups= {"smoke"})
	public void verifyHomePageTitle() {
		
		extentLogger = report.createTest("Verify home title");
		assertTrue(Driver.getDriver().getTitle().contains("HealthData.gov"));
	}
}