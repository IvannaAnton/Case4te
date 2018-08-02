package gov.healthdata.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gov.healthdata.utilities.Driver;
/* This class extends HealthDataMainPage
 * all the WebElements of main page are accessible from this class
 * Example: HealthDataSearchResultPage.searchField
 *     HealthDataSearchResultPage.searchButton will work on second page
 */

public class HealthDataSearchResultPage extends HealthDataMainPage {
	public HealthDataSearchResultPage() {
	PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy (xpath="//div[@class='view-header']") //by Khaliunaa
	public WebElement searchResultNumber;
	
	@FindBy (xpath="(//h2[@class='pane-title ctools-collapsible-handle'])[3]") //by Khaliunaa
	public WebElement tags;
	
	@FindBy (xpath="//a[@id='facetapi-link--80']") //Khaliunaa
	public WebElement medicaidLink;
	@FindBy(xpath="//a[@id='anch_20']")
	public WebElement homepage;
	
	
	
	
	@FindBy(id="edit-query")
	public WebElement searchResultHealth;  // by KimyaNur
	
	@FindBy(xpath="//*[@id=\"facetapi-link\"]")
	public WebElement beforeresultFiltreHealthOfHealth;    // by KimyaNur
	
	@FindBy(id="facetapi-link")
	public WebElement healthClick;  // by KimyaNur
	
	@FindBy(xpath="//div[@class='view-header']")
	public WebElement resultFiltreHealthOfHealth;  // by KimyaNur
	
	@FindBy(xpath="//a[@id='facetapi-link--6']")
	public WebElement hospitalClick;  // by KimyaNur
	
	@FindBy(xpath="//div[@class='view-header']")
	public WebElement resultfiltrehospital;  // by KimyaNur
	
	
	
	
	
	
	
}