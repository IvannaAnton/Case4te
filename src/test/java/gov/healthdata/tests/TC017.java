package gov.healthdata.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import gov.healthdata.utilities.Driver;

public class TC017 extends TestBase {
//Test Case 17 is not automatable, due to the fact that Emoji is part of my MAC OS system
	
	@Test
	public void canNotAutomateTest17() {
		extentLogger = report.createTest("Funtionality cannot be automated test case 17");
		assertTrue(Driver.getDriver().getCurrentUrl().contains("www.healthdata.gov"));
	}
}
