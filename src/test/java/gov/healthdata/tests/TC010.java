package gov.healthdata.tests;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;

public class TC010 extends TestBase {
	HealthDataMainPage mainPage;

	@Test
	public void maximumVisibilityOfTheCharactersInTheSearchBox() {

		mainPage = new HealthDataMainPage();
		
		int fourteenLetter=14;
		String maxLengthCharacters = faker.lorem().characters(fourteenLetter);
		
		mainPage.searchField.sendKeys(maxLengthCharacters);

		assertTrue(mainPage.searchField.getAttribute("value").length()==fourteenLetter);
		assertEquals(maxLengthCharacters, mainPage.searchField.getAttribute("value"));



	}

}
