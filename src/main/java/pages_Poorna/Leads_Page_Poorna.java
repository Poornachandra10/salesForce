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

public class Leads_Page_Poorna extends Base_Page_Poorna {
	protected static Logger logger = LogManager.getLogger("");

	public Leads_Page_Poorna(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Leads Tab']")
	public WebElement LeadsPage;

	@FindBy(xpath = "//*[@class='pageType']")
	public WebElement CheckLeadsPageVisible;

	@FindBy(xpath = "//*[@id='fcf']")
	// (xpath="//*[@title='View:']")
	public WebElement clickDropDownLeads;

	// Select view = new
	// Select(driver.findElement(By.xpath("//select[@id='fcf']")));

	@FindBy(xpath = "//select[@id='fcf']")
	public WebElement dropDown;

	@FindBy(xpath = "//a[@title='Logout']")
	// (id = "userNav-menuItems/a[4]")
	public WebElement Logout;

	//// *[@title='Go!']
	@FindBy(xpath = "//*[@title='Go!']")
	public WebElement clickGo;

	//// *[@id="userNavButton"]
	@FindBy(xpath = "//div[@id='userNavButton']")
	public WebElement usermenuforLogout;

	@FindBy(xpath = "//*[@title='New']")
	public WebElement newBtn;

	@FindBy(xpath = "//*[@id='name_lastlea2']")
	public WebElement lastName;

	@FindBy(xpath = "//*[@id='lea3']")
	public WebElement companyName;

	@FindBy(xpath = "//td[@id='bottomButtonRow']//input[@title='Save']")
	public WebElement clickSave;

	@FindBy(xpath = "//*[@class='textBlock']")
	public WebElement checkingTestBlock;

	

	public void sendKeysLastAndCompanyName(WebDriver driver, String string1, String string2) {
		Common_Utils_Poorna.waitForElement(driver, lastName);
		if (lastName.isDisplayed()) {
			lastName.sendKeys(string1);
		}
		Common_Utils_Poorna.waitForElement(driver, companyName);
		if (companyName.isDisplayed()) {
			companyName.sendKeys(string2);
			Common_Utils_Poorna.waitForElement(driver, clickSave);
			clickSave.click();
		}
	}

	public boolean isLedsPageVisible(WebDriver driver) {
		if (LeadsPage.isDisplayed()) {
			LeadsPage.click();
			return true;
		} else {
			System.out.println("Leads page is not visible");
			return false;
		}
	}

	public boolean isLedsPageVisibleBoolean(WebDriver driver) {

		if (LeadsPage.isDisplayed()) {
			LeadsPage.click();
			return true;
		} else {
			System.out.println("Leads page is not visible");
			return false;
		}
	}

	public void isclickDropDownLeads(WebDriver driver) {
		Common_Utils_Poorna.waitForElement(driver, clickDropDownLeads);
		if (clickDropDownLeads.isDisplayed()) {
			clickDropDownLeads.click();

		} else {
			System.out.println("Leads drop down button is not visible");
		}
	}

	/*
	 * public boolean verifyLeadsDropDown(WebDriver driver) throws IOException {
	 * String[] expectedUserMenuItems =
	 * Properties_Files_Utils_Poorna.readLeads_testdata("leads.items").split(",");
	 * boolean isOptionverified = true; for (int i = 0; i <
	 * clickDropDownLeads.getSize(); i++) {
	 * 
	 * String actualUserMenuItems = clickDropDownLeads.getText(); if
	 * (actualUserMenuItems.equals(expectedUserMenuItems.toString())) {
	 * System.out.println("The option" + expectedUserMenuItems[i] + "passed"); }
	 * else { System.out.println( "Actual option : " + actualUserMenuItems +
	 * "Expected option" + expectedUserMenuItems[i]); isOptionverified = false; } }
	 * return isOptionverified; }
	 */
	/*
	 * Select dropDown = new Select(driver.findElement(By.id("ddlTablePay")));
	 * List<WebElement> elementCount = dropDown.getOptions();
	 * System.out.println("Number of items: " + elementCount.size());
	 * 
	 * 
	 *  Select dropDown = new Select(driver.findElement(By.id("ddlTablePay"))); List
	 * <WebElement> elementCount = dropDown.getOptions(); 
	 * int itemSize =
	 * elementCount.size(); for(int i = 0; i < itemSize ; i++){ String optionsValue
	 * = elementCount.get(i).getText(); System.out.println(optionsValue);
	 */
    //}
	
	
	public void verifyLeadsDropDown(WebDriver driver) {
		Select dropDown=new Select(clickDropDownLeads);
		List<WebElement> elementCount =dropDown.getOptions();
		int itemSize=elementCount.size();
		for(int i=0; i<itemSize; i++) {
			String optionsValue=elementCount.get(i).getText();
			System.out.println(optionsValue);
		}
		
		
	}
	
	// not working
	public void dropDownClickToday_Leads(WebDriver driver) {
		// Select view = new
		// Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		Common_Utils_Poorna.waitForElement(driver, dropDown);
		if (dropDown.isDisplayed()) {
			dropDown.click();
			Select select = new Select(dropDown);
			select.selectByVisibleText("Today's Leads");

		}
	}

	public void click_userMenu_logout(WebDriver driver) {
		Common_Utils_Poorna.waitForElement(driver, usermenuforLogout);
		if (usermenuforLogout.isDisplayed()) {
			usermenuforLogout.click();
			if (Logout.isDisplayed()) {
				Logout.click();
			}
		}
	}

	public boolean isclickGoVisible(WebDriver driver) {
		Common_Utils_Poorna.waitForElement(driver, clickGo);
		if (clickGo.isDisplayed()) {
			clickGo.click();
			return true;
		} else {
			System.out.println(" go button is not visible");
			return false;
		}
	}

	public boolean launchLeadsPage(WebDriver driver, String sUrl) {
		driver.getCurrentUrl();
		String actualURL = driver.getCurrentUrl();
		if (actualURL.equals(sUrl)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean ischeckingTestBlock(WebDriver driver, String str1) {
		Common_Utils_Poorna.waitForElement(driver, checkingTestBlock);
		String chk = checkingTestBlock.getText();
		
			if (str1.equals(chk)) {
				return true;	
			}else
				return false;
				
		}
		

	public void isnewBtn(WebDriver driver) {
		Common_Utils_Poorna.waitForElement(driver, newBtn);
		if (newBtn.isDisplayed()) {
			newBtn.click();
		} else {
			System.out.println("new button is not visible ");
		}
	}

}
