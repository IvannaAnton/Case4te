package gov.healthdata.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import gov.healthdata.utilities.Driver;

public class TC020 extends TestBase{
	
	@Test
	public void canNotAutomateTest20() {
		assertTrue(Driver.getDriver().getCurrentUrl().contains("www.healthdata.gov"));
	}
	

}
