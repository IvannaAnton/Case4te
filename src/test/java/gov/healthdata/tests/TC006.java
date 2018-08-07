package gov.healthdata.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;

public class TC006 extends TestBase {
	HealthDataMainPage mainPage;

	@Test
	public void verifyingTheMaximumCapacityOfTheCharactersInTheSearchBox() {
		
		extentLogger = report.createTest("Verify the maximun capacity of the character in the searchbox");
		mainPage = new HealthDataMainPage();
		
		int maxLetters=128;
		String maxLengthCharacters = faker.lorem().characters(maxLetters);
		
		mainPage.searchField.sendKeys(maxLengthCharacters);
    assertTrue(mainPage.searchField.getAttribute("value").length()==maxLetters);


	}
}
