package gov.healthdata.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import gov.healthdata.pages.HealthDataMainPage;
import gov.healthdata.pages.HealthDataSearchResultPage;

public class TC007 extends TestBase {
    
    @Test 
    public void VerifyThatSearchBoxAcceptsCopyPasteCharacters(){
        HealthDataMainPage mainPage =  new HealthDataMainPage();
        HealthDataSearchResultPage resultPage = new HealthDataSearchResultPage();
        String expected = "health";
        mainPage.searchField.sendKeys(expected+Keys.ENTER);
        String actual = resultPage.searchResultHealth.getAttribute("value");
        assertEquals(expected, actual);
    }
}
