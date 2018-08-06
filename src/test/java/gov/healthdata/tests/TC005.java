package gov.healthdata.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import gov.healthdata.utilities.Driver;

public class TC005 extends TestBase{
//Moti
	@Test
	public void canNotAutomateTest5() {
		assertTrue(Driver.getDriver().getCurrentUrl().contains("www.healthdata.gov"));
	}
}
