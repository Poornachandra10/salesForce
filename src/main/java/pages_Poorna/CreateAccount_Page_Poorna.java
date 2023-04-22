package pages_Poorna;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import file_utiles_Poorna.Common_Utils_Poorna;

public class CreateAccount_Page_Poorna {
	protected static Logger logger = LogManager.getLogger("");

	public CreateAccount_Page_Poorna(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\\\"Account_Tab\\\"]/a")
	public WebElement Accounts_Tab;

	@FindBy(xpath = "//*[@id=\\\"hotlist\\\"]/table/tbody/tr/td[2]/input")
	public WebElement newButtonCreateNewAcc;

	@FindBy(id = "acc2")
	public WebElement AccountName;

	@FindBy(xpath = "//select[@id='acc6")
	public WebElement selecttype;
	
	@FindBy (xpath="//select[@id='00N0o00000Fy3l4']")
	public WebElement coustomerpriority;
	
	@FindBy (xpath="//span[@data-uidsfdc='46']")
	public WebElement checkUserName;

	public void isAccTabVisible(WebDriver driver) {
		Common_Utils_Poorna.waitForElement(driver, Accounts_Tab);
		if(Accounts_Tab.isDisplayed()) {
			Accounts_Tab.click();
		}else {
			System.out.println("Account tab is not visible");
		}
	}
	
	
	// New Account edit page is displayed. Enter <Account name> select type as
	// Technology partner from drop down,
	// set coustomer priority as high
	// Opening Accounts page
	/*
	 * WebElement Accounts_Tab =
	 * driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
	 * Accounts_Tab.click(); System.out.println("Clicked on Accounts Ta..");
	 * 
	 * //Creating New Account
	 *  WebElement New =
	 * driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"
	 * )); New.click(); System.out.println("Clicked on New tab.."); WebElement
	 * AccountName = driver.findElement(By.id("acc2")); AccountName.clear();
	 * AccountName.sendKeys("Accountss"); WebElement selecttype =
	 * driver.findElement(By.xpath("//select[@id='acc6']")); Select select = new
	 * Select(selecttype); select.selectByVisibleText("Technology Partner");
	 * WebElement coustomerpriority =
	 * driver.findElement(By.xpath("//select[@id='00N0o00000Fy3l4']")); Select
	 * select1 = new Select(coustomerpriority); select1.selectByVisibleText("High");
	 * WebElement Save = driver.findElement(By.name("save")); Save.click();
	 */

}
