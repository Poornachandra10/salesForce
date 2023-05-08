package pages_Poorna;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import file_utiles_Poorna.Common_Utils_Poorna;
import file_utiles_Poorna.Properties_Files_Utils_Poorna;

public class create_Opp_Page_Poorna {

	protected static Logger logger = LogManager.getLogger("");

	public create_Opp_Page_Poorna(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@id='Opportunity_Tab']")
	public WebElement Opportunities;

	@FindBy(xpath = "//select[@id='fcf']")
	public WebElement OpportunitiesDropDown;

	@FindBy(xpath = "//input[contains(@title,'New')]")
	public WebElement New_button;

	@FindBy(id = "opp3")
	public WebElement Oppname;

	@FindBy(xpath = "//img[@title='Account Name Lookup (New Window)']")
	public WebElement LookupWindow;

	@FindBy(id = "lksrch")
	public WebElement Iframe1;

	@FindBy(xpath = "//input[@name='go']")
	public WebElement goButton;

	//// *[@id="toolsContent"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a
	@FindBy(xpath = "//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a")
	public WebElement OppPipeLine;

	@FindBy(xpath = "//*[@id='userNavButton']")
	public WebElement userMenu;

	//// *[@class='noSecondHeader pageType']
	@FindBy(xpath = "//*[@class='noSecondHeader pageType']")
	public WebElement verify_Opp_Pipe_linePage;

	@FindBy(xpath = "//input[contains(@title,'New')]")
	public WebElement createNewButton;

	@FindBy (id="opp3")
	public WebElement oppName;
	
	@FindBy (xpath="//*[@id='opp4']")
	//(xpath="//img[@title='Account Name Lookup (New Window)']")
	public WebElement oppAccType ;
	
	@FindBy (id="opp9")
	public WebElement date;
	
	@FindBy (xpath="//*[@class='calToday']")
	public WebElement calenderSelectToday;
	
	@FindBy( xpath= "//*[@id='topButtonRow']/input[2]")
	public WebElement saveButton;
	
	@FindBy (xpath="//*[@id='opp11']")
	public WebElement stageValSelect;
	
	
	@FindBy (xpath="//*[@id='opp12']")
	public WebElement probablityOpp;
	
	@FindBy (xpath="//*[@id='opp6']")
	public WebElement leadSource;
	
	@FindBy (xpath="//*[@id='opp17']")
	public WebElement primaryCamp;
	
	
	
	
	 
	public void sendingVal(WebDriver driver) {
		Common_Utils_Poorna.waitForElement(driver, oppName);
		oppName.sendKeys("ABCD");
		System.out.println("entered oppName");
		
		Common_Utils_Poorna.waitForElement(driver, oppAccType);
		oppAccType.sendKeys("1a23");
		System.out.println("entered oppAccType");
		
		Common_Utils_Poorna.waitForElement(driver, date);
		date.click();
		System.out.println("entered date");
		
		Common_Utils_Poorna.waitForElement(driver, calenderSelectToday);
		calenderSelectToday.click();
		System.out.println("entered calenderSelectToday");
		
		//Prospecting
		Select select= new Select(stageValSelect);
		select.selectByVisibleText("Prospecting");
		System.out.println("Selected prospecting");
		
		
		Common_Utils_Poorna.waitForElement(driver, saveButton);
		saveButton.click();
		System.out.println("click saveButton");
		
		Common_Utils_Poorna.waitForElement(driver, probablityOpp);
		probablityOpp.clear();
		probablityOpp.sendKeys("10");
		System.out.println("entered probablityOpp");
		
		Select sl=new Select(leadSource);
		sl.selectByVisibleText("Web");
		System.out.println("entered leadSource");
		
		primaryCamp.sendKeys("All");
		System.out.println("entered primaryCamp");
	}
	
	
	/*
	 *
	  String oldWindow = driver.getWindowHandle();
	 * //Switching driver control to new window. Set<String> getAllWindows =
	 * driver.getWindowHandles(); String[] getWindow = getAllWindows.toArray(new
	 * String[getAllWindows.size()]); driver.switchTo().window(getWindow[1]);
	 *
	 *
	 * 
	 * driver.switchTo().frame("searchFrame");
	 * driver.findElement(By.id("lksrch")).sendKeys("abc456");
	 * driver.findElement(By.xpath("//input[@name='go']")).click();
	 * 
	 * //Switching to Lookup Window driver.switchTo().defaultContent();
	 * 
	 * //Switching to Insideframe(result)
	 * 
	 * driver.switchTo().frame("resultsFrame"); Thread.sleep(5000);
	 * driver.findElement(By.xpath("//tr[@class='dataRow even last first']/th/a")).
	 * click();
	 * 
	 * driver.switchTo().window(getWindow[0]);
	 *
	 * 
	 * driver.findElement(By.xpath("//input[@id='opp9']")).click(); WebElement
	 * today=driver.findElement(By.xpath("//a[@class='calToday']")); today.click();
	 * Actions action = new Actions(driver);
	 * action.sendKeys(Keys.ESCAPE).build().perform(); WebElement Stage =
	 * driver.findElement(By.xpath("//select[@id='opp11']")); Stage.click();
	 * 
	 * Select dropdown = new Select(Stage); dropdown.selectByValue("Qualification");
	 * driver.findElement(By.xpath("//input[@id='opp12']")).sendKeys("80");
	 * driver.close(); System.out.println("TC16_CreatenewOpp is completed");
	 *
	 *
	 *
	 *
	 *
	 *
	 * 
	 * 
	 */

	public boolean isoppPageIsOpened(WebDriver driver) {

		if (Opportunities.isDisplayed()) {
			Common_Utils_Poorna.waitForElement(driver, Opportunities);
			Opportunities.click();
			return true;

		} else
			return false;
	}

	public void verify_Opp_Page_DropDown(WebDriver driver) throws IOException {
		Common_Utils_Poorna.waitForElement(driver, OpportunitiesDropDown);
		Select dropdown = new Select(OpportunitiesDropDown);
		// ArrayList<Object> arr = new ArrayList<Object>();
		// arr.add(Properties_Files_Utils_Poorna.readUserMenuTestData("opp_Drop_Down"));//.split(","));
		List<WebElement> elementCount = dropdown.getOptions();
		int itemSize = elementCount.size();
		for (int i = 0; i < itemSize; i++) {

			String optionsValue = elementCount.get(i).getText();
			// if(arr.get(i).equals(optionsValue)) {
			// System.out.println(arr.get(i)+" "+optionsValue);

			System.out.println(optionsValue);
		}

	}

	// this method is wrong
	// have to check with deekshith
	public boolean verifyItems(WebDriver driver) throws IOException {
		String[] expectedDropDown = Properties_Files_Utils_Poorna.readUserMenuTestData("opp_Drop_Down").split(",");
		for (int i = 0; i < expectedDropDown.length; i++) {
			String actualDropDown = OpportunitiesDropDown.getText();
			if (actualDropDown.equals(expectedDropDown[i])) {
				return true;
			}
		}

		return false;
	}

	/*
	 * def is_dropdown_selected_from_advanced_cleaning_output_tab(self, field):
	 * selected_dropdown_option =
	 * Select(self.get_element(*MainPageLocators.mappings_paf_output_dropdown))
	 * selected_dropdown_option.select_by_visible_text(field) selected_text =
	 * selected_dropdown_option.text if(selected_text == field): return True else:
	 * return False
	 */

	// Click on opportunities link from the main menu
//Click on Opportunity Pipeline link  under Reports.

	// Report Page with the Opportunities that are pipelined will be displayed.

	public void Click_OppPipeLine(WebDriver driver) {
		Common_Utils_Poorna.waitForElement(driver, OppPipeLine);
		OppPipeLine.click();
	}

	public void iscreateNewButtonAval(WebDriver driver) {
		Common_Utils_Poorna.waitForElement(driver, createNewButton);
		createNewButton.click();
	}
}
