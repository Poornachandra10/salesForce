package pages_Poorna;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import file_utiles_Poorna.Common_Utils_Poorna;
import file_utiles_Poorna.Properties_Files_Utils_Poorna;

public class Leads_Page_Poorna extends Base_Page_Poorna{
	protected static Logger logger = LogManager.getLogger("");

	
	public Leads_Page_Poorna(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//a[@title='Leads Tab']")
	public WebElement LeadsPage;
	
	@FindBy (xpath="//*[@class='pageType']")
	public WebElement CheckLeadsPageVisible;
	
	@FindBy (xpath="//*[@title='View:']")
	public WebElement clickDropDownLeads;
	
	// Select view = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));

	@FindBy (xpath="//select[@id='fcf']")
			 public WebElement dropDown;
	
	////*[@title='Go!']
	@FindBy (xpath="//*[@title='Go!']")
	public WebElement clickGo;
	
	public boolean isLedsPageVisible(WebDriver driver) {
		if(LeadsPage.isDisplayed()) {
			LeadsPage.click();
			return true;
		}else {
			System.out.println("Leads page is not visible");
		return false;
		}
	}
	public boolean isLedsPageVisibleBoolean(WebDriver driver) {
		
		if(LeadsPage.isDisplayed()) {
			LeadsPage.click();
			return true;
		}else {
			System.out.println("Leads page is not visible");
			return false;
		}
	}
	
	public void isclickDropDownLeads(WebDriver driver) {
		Common_Utils_Poorna.waitForElement(driver, clickDropDownLeads);
		if(clickDropDownLeads.isDisplayed()) {
			clickDropDownLeads.click();
			
		}else {
			System.out.println("Leads drop down button is not visible");
		}
	}
	
	
	  public boolean verifyLeadsDropDown(WebDriver driver) throws IOException {
	  String[] expectedUserMenuItems=Properties_Files_Utils_Poorna.readLeads_testdata("leads.items").split(","); 
	  boolean isOptionverified = true;
	  for (int i =0; i<expectedUserMenuItems.length; i++){
		  
		  String actualUserMenuItems =clickDropDownLeads.getText(); 
		  if(actualUserMenuItems.equals(expectedUserMenuItems.toString())) {
			  System.out.println("The option" + expectedUserMenuItems[i] + "passed");
		  } else {	  
			  System.out.println( "Actual option : " + actualUserMenuItems +
			  "Expected option" + expectedUserMenuItems[i]); 
			  isOptionverified= false; 
		  }  
	  }
	  return isOptionverified;
	  }
	  
	 	//not working
	public void dropDownClickToday_Leads(WebDriver driver) {
		// Select view = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		Common_Utils_Poorna.waitForElement(driver, dropDown);
		if(dropDown.isDisplayed()) {
			dropDown.click();
		Select select = new Select(dropDown);
		select.deselectByVisibleText("Today's Leads");
		}
	}
	
	public boolean isclickGoVisible(WebDriver driver) {
		if(clickGo.isDisplayed()) {
			clickGo.click();
			return true;
		}else
		{
			System.out.println(" go button is not visible");
			return false;
		}
	}
	
	
	
	
	
		
	
	
	
	//TC24
//Link should navigate to Leads Home page
//click on the new button displayed in the Recent Leads frame
//enter "ABCD" in the last name na company name field 
	//new lead should be saved and the newly created lead view page should be opened

	
	/*20
	 * //WebElement Leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
	 * //21
	 *  //WebElement LeadSelect =
	 * driver.findElement(By.xpath("//select[@id='fcf']"));
	 *  
	 * Select view = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
	 * 
	 * //Get all options List<WebElement> vew = view.getOptions();
	 
	 *22
	 *
		WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNav']"));
		selectDropdown(UserMenu, "UserMenu");
		WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		clickObj(logout, "logout");
		
	 *23
	 *Select view = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		view.selectByIndex(3);
		WebElement gobutton = driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
        gobutton.click()
	 *
	 *24
	 * String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
		System.out.println("User is on home page");
		}
		else {
			System.out.println("home page is not Lunched");
		} 
		
		WebElement Leads = driver.findElement(By.xpath("//a[@title='Leads Tab']"));
		clickObj(Leads, "Leads"); 
		WebElement LeadSelect = driver.findElement(By.xpath("//select[@id='fcf']"));
		clickObj(LeadSelect, "LeadSelect");
		Thread.sleep(3000);
		WebElement New = driver.findElement(By.xpath("//input[@title='New']"));
		clickObj(New, "New");
		
		WebElement LeadStatus = driver.findElement(By.xpath("//select[@id='lea13']"));
		clickObj(LeadStatus, "LeadStatus");
		
		//Select dropdown  = new Select(driver.findElement(By.xpath("//select[@id='lea13']")));
		SelectByValue(LeadStatus, "Open - Not Contacted");
		
		
		WebElement LastName = driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
		enterText(LastName, "mithun", "LastName");
		
	
		WebElement Company = driver.findElement(By.xpath("//input[@id='lea3']"));
		enterText(Company, "welsfargo", "companyname");
		
		WebElement SaveButton = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']"));
		clickObj(SaveButton, "SaveButton");
		Thread.sleep(2000);
		driver.close();
		System.out.println(" TC24_NewLeads is completed");
	 *
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
