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
	
	
	@FindBy (xpath="//div[@class='view-header']") 
	public WebElement searchResultNumber;
	
	@FindBy (xpath="(//h2[@class='pane-title ctools-collapsible-handle'])[3]") 
	public WebElement tags;
	
	@FindBy (xpath="//a[@id='facetapi-link--80']") 
	public WebElement medicaidLink;
	@FindBy(xpath="//a[@id='anch_20']")
	public WebElement homepage;
	
	
	
	
	@FindBy(id="edit-query")
	public WebElement searchResultHealth; 
	
	@FindBy(xpath="//*[@id=\"facetapi-link\"]")
	public WebElement beforeresultFiltreHealthOfHealth;  
	
	@FindBy(id="facetapi-link")
	public WebElement healthClick;  
	
	@FindBy(xpath="//div[@class='view-header']")
	public WebElement resultFiltreHealthOfHealth;  
	
	@FindBy(xpath="//a[@id='facetapi-link--6']")
	public WebElement hospitalClick;  
	
	@FindBy(xpath="//div[@class='view-header']")
	public WebElement resultfiltrehospital;  
	
	@FindBy(xpath="//div[@class='view-empty']/p")
	public WebElement noResults;  
	
	
	
	
	
	
	
}