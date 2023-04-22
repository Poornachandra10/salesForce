package pages_Poorna;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import file_utiles_Poorna.Common_Utils_Poorna;
import test_Poorna.Base_Test_Poorna;

public class Contacts_Page_Poorna extends Base_Test_Poorna {

	protected static Logger logger = LogManager.getLogger("");

	public Contacts_Page_Poorna(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//a[@title='Contacts Tab']")
	public WebElement contacts;

	@FindBy(xpath = "//input[contains(@title,'New')]")
	public WebElement createNew;

	@FindBy(xpath = "//input[@id='name_firstcon2']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@id='name_lastcon2']")
	public WebElement lastName;

	@FindBy(xpath = "//input[@id='con4']")
	public WebElement accountName;

	@FindBy(xpath = " //td[@id='bottomButtonRow']//input[@title='Save']")
	public WebElement saveButton;
	
	////td[@id='bottomButtonRow']//input[@title='Save & New']
	@FindBy(xpath="//td[@id='bottomButtonRow']//input[@title='Save & New']")
	public WebElement ClickSaveNew;
	
	// to check the entered name is visible //*[@class='title']
	@FindBy(xpath= "//*[@class='title']")
	public WebElement toCheckTheViewName;

	
	@FindBy  (xpath="//a[contains(text(),'Create New View')]")
	public WebElement Contactnewview;
	

	@FindBy  (xpath="//input[@id='fname']")
	public WebElement ViewName;
	

	@FindBy  (xpath="//input[@id='devname']")
	public WebElement View_UniqueName;
	

	@FindBy  (xpath="//div[@class='pbBottomButtons']//input[@title='Save']")
	public WebElement newCondactViewSaveButton;
	
	////*[@id='hotlist_mode']
	@FindBy (xpath="//*[@id='hotlist_mode']")
	public WebElement RecentlyCreatedContacts;
	
	//my contacts //*[@id='fcf']
	@FindBy(xpath="//*[@id='fcf']")
	public WebElement MyContactsContactsPage;
	
	//*[@title='View:']
	@FindBy (xpath="//*[@selected='selected']")
			//"//*[@title='View:']")
			public WebElement viewTestbox;
	
	////*[@class='pageDescription']
	@FindBy (xpath="//*[@class='pageDescription']")
			//"//*[@class='pageType']")
	public WebElement contactsaPageVisibleChecking;
	
	@FindBy (xpath="//*[contains(text(),'Error:')]")
	public WebElement errorMessage;
	
	//cancel button :xpath("//div[@class='pbBottomButtons']//input[@title='Cancel']"
	@FindBy (xpath="//div[@class='pbBottomButtons']//input[@title='Cancel']")
	public WebElement cancelDontSave_31;
	
	
	//To check the Launch app
	public boolean lanchAppOwnMethod(WebDriver driver, String sUrl) {
		driver.get(sUrl);// opens browser with the sURL 
		String checkWithExpectedURL=driver.getCurrentUrl();
		if(sUrl.equals(checkWithExpectedURL)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void clickCancelButton(WebDriver driver) {
		if(cancelDontSave_31.isDisplayed()) {
			cancelDontSave_31.click();
		}else {
			System.out.println("cancel button is not visible");
		}
	}
		
	public void isClickSaveNewButton(WebDriver driver) {
		Common_Utils_Poorna.waitForElement(driver, ClickSaveNew);
		if(ClickSaveNew.isDisplayed()) {
			ClickSaveNew.click();
		}else {
			System.out.println("ClickSaveNew button is not visible");
		}
	}
	
	public boolean launchApp(WebDriver driver, String sURL) {
		boolean isAppLaunched=false;
		driver.get(sURL);
		String actualURL=driver.getCurrentUrl();
		if(actualURL.equals(sURL)) {
			isAppLaunched=true;
		}else {
			System.out.println("URL is different");
		}
		return isAppLaunched;
	}
	public boolean isContactsMenuBarButtonVisible(WebDriver driver) {
		Common_Utils_Poorna.waitForElement(driver, contacts);
		if (contacts.isDisplayed()) {
			contacts.click();
			return true;
		} else {
			System.out.println("Contacts Menu Bar Button is not Visible");
		return false;
		}

	}

	public boolean isCreateNewIconVisible(WebDriver driver) {
		Common_Utils_Poorna.waitForElement(driver, createNew);
		if (createNew.isDisplayed()) {
			createNew.click();
			return true;
		} else {
			System.out.println("Create new icon is not visible");
		
		return false;}
	}

	public void enterLastName(WebDriver driver, String fName, String lName) {
		Common_Utils_Poorna.waitForElement(driver, firstName);
		Common_Utils_Poorna.waitForElement(driver, lastName);
		if (firstName.isDisplayed()&&
				lastName.isDisplayed()) {
			firstName.sendKeys(fName);
			lastName.sendKeys(lName);
			
			
		} else {
			System.out.println("lastname text box is not visible");
		}
	
	}

	
	public void enterAccName(WebDriver driver, String AccName) {
		Common_Utils_Poorna.waitForElement(driver, accountName);
		if(accountName.isDisplayed()) {
			accountName.clear();
			
			accountName.sendKeys(AccName);
			saveButton.click();
		}else {
			System.out.println("Accname Text box is not visible");
		}
	}
	
	//Contact Home page should be displayed

	
	  public void isContactnewviewTab(WebDriver driver) {
	  Common_Utils_Poorna.waitForElement(driver, Contactnewview);
	  if(Contactnewview.isDisplayed()) { Contactnewview.click(); }
	  else {
	  System.out.println("Contactnewview is not visible"); } 
	  }
	 
	
	//Click on Create New View link
	public void enterViewName(WebDriver driver, String NewViewName) {
		 Common_Utils_Poorna.waitForElement(driver, ViewName );	
		 if(ViewName.isDisplayed()) {
			 ViewName.clear();
			 ViewName.sendKeys(NewViewName);
		 }else {
			 System.out.println("NewViewName not visible");
		 }
	}

	
	public void enter_Unique_Name(WebDriver driver, String uniqueName) {
		if(View_UniqueName.isDisplayed()) {
			View_UniqueName.clear();
			View_UniqueName.sendKeys(uniqueName);
		}else {
			System.out.println(" unique name text box is not visible");
		}
	}
	
	public void clickNewCondactViewSaveButton(WebDriver driver) {
		if (newCondactViewSaveButton.isDisplayed()){
			newCondactViewSaveButton.click();			
		}else {
			System.out.println("New Condact View Save Button is not available");
		}
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void checkEnteredName(WebDriver driver) {
		String name=toCheckTheViewName.getText();
		if(ViewName.equals(name)) {
			System.out.println("The entered Acc name and viwe name are same");
		}else {
			System.out.println("The entered Acc name and viwe name are not  same");
		}
	}
	
	public void isRecentlyCreatedContacts(WebDriver driver) {
	Common_Utils_Poorna.waitForElement(driver, RecentlyCreatedContacts);
		if(RecentlyCreatedContacts.isDisplayed()) {
		RecentlyCreatedContacts.click();
		Select drop = new Select(RecentlyCreatedContacts);
		drop.selectByVisibleText("Recently Created");
	}else {
		System.out.println("RecentlyCreatedContacts is not visible");
	}
	}
	
	public void isMyContactsContactsPage(WebDriver driver) {
		Common_Utils_Poorna.waitForElement(driver, MyContactsContactsPage);
		if(MyContactsContactsPage.isDisplayed()) {
			MyContactsContactsPage.click();
			Select select=new Select(MyContactsContactsPage);
			select.selectByVisibleText("All Contacts");
		}
		}
		
	//Click on Contacts on the menu bar
//Click on the New button
//Enter the last name and Account Name(Last Name - Indian, Account Name-Global Media)
//New contact is created. Contact Edit: New Contact Page is dispalyed
	//my test case passed, but i see error in salesforce contact page. the msg is enter correct value like that;

	


}
