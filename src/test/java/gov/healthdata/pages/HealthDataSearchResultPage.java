package gov.healthdata.pages;

import java.util.List;

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
	
	
	@FindBy (className="view-header") 
	public WebElement searchResultNumber;
	
	@FindBy (className="view-empty") 
	public WebElement notFoundMessage;
	
	@FindBy (xpath="(//h2[@class='pane-title ctools-collapsible-handle'])[3]") 
	public WebElement tags;
	
	@FindBy (xpath="//ul[@id='facetapi-facet-search-apidatasets-block-field-tags']/li") 
	public List<WebElement> tagsOptions;
	
	
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
	
	@FindBy(xpath="//a[@id='facetapi-link--6']")
	public WebElement hospitalClick;  
	
	@FindBy(xpath="//div[@class='view-header']")
	public WebElement resultfiltrehospital; 
	
	
	
	
	
	
	
}