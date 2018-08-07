package gov.healthdata.tests;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

import gov.healthdata.utilities.Driver;

public class TC016 extends TestBase {
	
	@Test
	public void canNotAutomateTest16() {
		
		extentLogger = report.createTest("Funtionality cannot be automated test case 16");
		assertTrue(Driver.getDriver().getCurrentUrl().contains("www.healthdata.gov"));
	}
	
}
