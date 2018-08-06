package gov.healthdata.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import gov.healthdata.utilities.Driver;



public class TC006 extends TestBase{
	
	@Test
	public void canNotAutomateTest6() {
		assertTrue(Driver.getDriver().getCurrentUrl().contains("www.healthdata.gov"));
	}
	  
}
