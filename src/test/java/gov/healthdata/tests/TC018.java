package gov.healthdata.tests;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;

public class TC018 extends TestBase {
	
	@Test
	public void VerifyOptionRightToLeftTypingInSearchBoxFromContextMenu() {
		HealthDataMainPage mainPage =  new HealthDataMainPage();
		HealthDataSearchResultPage resultPage = new HealthDataSearchResultPage();
		actions.contextClick(mainPage.searchField).build().perform();
		
	}
}
