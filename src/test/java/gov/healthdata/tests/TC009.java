package gov.healthdata.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import gov.healthdata.utilities.Driver;

public class TC009 extends TestBase{
	@Test
	public void verifySearchBoxHistory() {
		
		assertTrue(Driver.getDriver().getCurrentUrl().contains("www.healthdata.gov"));
		//Next step is not automatable because of Search Box history items (that I typed in) are cannot be inspected
	}
	
}
