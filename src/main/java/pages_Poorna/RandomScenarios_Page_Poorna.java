package pages_Poorna;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import file_utiles_Poorna.Common_Utils_Poorna;
import file_utiles_Poorna.Properties_Files_Utils_Poorna;

public class RandomScenarios_Page_Poorna {

	public RandomScenarios_Page_Poorna(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	protected static Logger logger = LogManager.getLogger("");
	
	@FindBy(xpath="//*[@id='userNav' and @title='User menu for poorna ABCD']")
	public WebElement checkPageProfileName;
	
	@FindBy(xpath="//*[@id='tailBreadcrumbNode' and @class='tailNode cxTailNode']")
	public WebElement currentName;

	@FindBy(xpath="//*[@id='userNav']")
	public WebElement usermenuButton;
	
	@FindBy(xpath="//*[@title='My Profile']")
	public WebElement myProfile;
		
    @FindBy(xpath="//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")
	public WebElement edit;

    
	@FindBy(xpath="//li[@id='aboutTab']")
	public WebElement aboutTab;
	
	@FindBy(xpath="//*[@id='lastName']")
	public WebElement lastName;
	
	@FindBy(xpath="//*[@class='zen-btn zen-primaryBtn zen-pas']")
	public WebElement saveAll;
	
	
	@FindBy (xpath="//*[@id='contactInfoContentId']")
	public WebElement iframe;
	
	public boolean printProfileNameAndCheck(WebDriver driver) {
	
	String str1=checkPageProfileName.getText();
	System.out.println(str1);
	Common_Utils_Poorna.waitForElement(driver, usermenuButton);
	usermenuButton.click();
	Common_Utils_Poorna.waitForElement(driver, myProfile);
	myProfile.click();
	Common_Utils_Poorna.waitForElement(driver, currentName);
	String str=	currentName.getText();
	
	System.out.println(str);
	
		if(str.contains(str1))
			return true;
		else
			return false;
}
	
public void updateLastName_thenCheckChangedItOrNot(WebDriver driver) throws IOException, InterruptedException {
	Common_Utils_Poorna.waitForElement(driver, usermenuButton);
	usermenuButton.click();
	logger.debug("clicking usermenu");
	Common_Utils_Poorna.waitForElement(driver, myProfile);
	myProfile.click();
	logger.debug("clicking my profile");
	Common_Utils_Poorna.waitForElement(driver, edit);
	edit.click();
	logger.debug("clicking edit arrow");
	Thread.sleep(3000);
	Common_Utils_Poorna.waitForElement(driver, iframe);
	driver.switchTo().frame(iframe);
	logger.debug("entering in new iframe");
	Common_Utils_Poorna.waitForElement(driver, aboutTab);
	aboutTab.click();
	logger.debug("clicking about tab");
	Common_Utils_Poorna.waitForElement(driver, lastName);
	lastName.sendKeys("abcd");
	logger.debug("adding the last name");
	Common_Utils_Poorna.waitForElement(driver, saveAll);
	saveAll.click();
	logger.debug("saving all");
}
	
//	@FindBy()
//	public WebElement 
//	
//	@FindBy()
//	public WebElement 
//	
//	@FindBy()
//	public WebElement 
//	
//	@FindBy()
//	public WebElement 
//	//	@FindBy()
//	public WebElement 
//	
//	@FindBy()
//	public WebElement 
//	
//	@FindBy()
//	public WebElement 
//	
//	@FindBy()
//	public WebElement 
//	
//	@FindBy()
//	public WebElement 
//	
//	@FindBy()
//	public WebElement 
//	
//	@FindBy()
//	public WebElement 
//	
	

	//Test case 34
	//SalesForce application should be Launced
//The 'Edit Profile' popup should be displayed with the 'Contact' tab selected.
//Focus shoud be in the First Name field.
//1. The 'Edit Profile' popup should be closed.            
	//2. Verify that the updated LastName of the account holder is
	//displayed at the top left hand side of the page.    
	//3. Verify that the 'User menu for FirstName LastName' 
	//menu button shows the updated Last Name, at the top right hand 
	//side of the page.          
	//4. Verify that the 'User:FirstName LastName' page has the updated LastName.


	//Test case 35
	//SalesForce application should be Launced
//The 'All Tabs' page should be displayed.
//The 'Customize My Tabs' page should be displayed.
//The selected tab should be removed from the 'Selected Tabs' section and should be moved to the 'Available Tabs' section.
//1. The 'All Tabs' page should be displayed.            2. The tab removed at step 3 should not be displayed in the tab bar.
//Salesfore login page should be displayed.       
//1. SalesForce application should be Launced.                                                                     2. The tab removed at step 3 should not be displayed in the tab bar.

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
