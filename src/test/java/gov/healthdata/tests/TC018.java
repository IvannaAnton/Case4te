package gov.healthdata.tests;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;

public class TC018 extends TestBase {
	HealthDataMainPage mainPage;
	HealthDataSearchResultPage resultPage;
	@Test
	public void VerifyOptionRightToLeftTypingInSearchBoxFromContextMenu() {
		extentLogger = report.createTest("Verify funtionality for context menu");
		 mainPage =  new HealthDataMainPage();
		 resultPage = new HealthDataSearchResultPage();
		actions.contextClick(mainPage.searchField).build().perform();
		
	}
}
