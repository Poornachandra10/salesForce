package pages_Poorna;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import file_utiles_Poorna.Common_Utils_Poorna;

//import file.utils.CommonUtils;

public class Login_Page_Poorna extends Base_Page_Poorna {
	public Login_Page_Poorna(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	public WebElement username;
	@FindBy(id = "password")
	public WebElement password;
	@FindBy(id = "Login")
	public WebElement Login;
	@FindBy(xpath = "//*[@id='rememberUn']")
	public WebElement rememberMe;

	@FindBy(css = "#error")
	public WebElement loginErrorMsg;

	@FindBy(id = "un")
	public WebElement forgotUsername;

	@FindBy(partialLinkText = "Forgot Your")
	public WebElement forgotPassword;

	@FindBy(id = "continue")
	public WebElement continueButton;

	@FindBy(id = "forgotPassForm")
	public WebElement passwordResetScreen;

	@FindBy(xpath = "//a[text()='Return to Login']")
	public WebElement returnToLoginButton;

	@FindBy(id = "idcard-identity")
	public WebElement savedUsername;

	@FindBy(xpath="//*[@id='userNavLabel']")
	public WebElement homeUserMenu;
	
	@FindBy(id = "userNav-menuItems/a[4]")
	public WebElement Logout;

	@FindBy(xpath = "//div[@id='userNav-menuItems']/a")
	public List<WebElement> userMenuOptions;


	/*
	 * @FindBy(id = "userNavLabel") public WebElement homeUserMenu;
	 */

//Dat 1 class: creating a method to check is it available or not and sending the values
	public void enterUserName(WebDriver driver, String userName) {
		if (username.isDisplayed()) {
			username.clear();
			username.sendKeys(userName);
		} else
			System.out.println("Username element is not visible");
	}

	public void enterPassword(WebDriver driver, String pass) {
		if (password.isDisplayed()) {
			// password.clear();
			password.sendKeys(pass);
		} else
			System.out.println("PassWord element is not visible");
	}

	public void ClickLoginButton(WebDriver driver) {
		if (Login.isDisplayed()) {
			Login.click();
		} else {
			System.out.println("login button is not visible");
		}

	}

	// Trying by my own, if it didnot work, delete it:)

	public void clearMethod(WebDriver driver) {
		if (password.isDisplayed()) {
			password.clear();
		}
	}

	// Day 7 this launchApp method checks,the login page is launched or not!!!
	public boolean launchApp(WebDriver driver, String sURL) {
		boolean isAppLaunched = false;
		driver.get(sURL);
		String actualURL = driver.getCurrentUrl();

		if (actualURL.equals(sURL)) {
			isAppLaunched = true;
		}
		return isAppLaunched;
	}

	// Day 8 this method is checking the entered username value:
	public String getUserName(WebDriver driver) {
		return username.getText();
	}

	// Day 9 creating a method for checking the remeberme
	// checkbox is selected and its visible
	public boolean selectRememberMeCheckBox(WebDriver driver) {
		if (!rememberMe.isSelected()) {
			rememberMe.click();
			return true;
		} else
			return false;
	}
	// Day 9 checking the home page is displayed or not

	public boolean errorMessageDisplayed(WebDriver driver) {
		return loginErrorMsg.isDisplayed();
	}

	
public boolean isHomePageDisplayed(WebDriver driver) {
	Common_Utils_Poorna.waitForElement(driver, homeUserMenu);
	return homeUserMenu.isDisplayed();
}
//Day 9 checking login page is displayed	
public boolean isLoginPageDisplayed(WebDriver driver) {
		return Common_Utils_Poorna.waitForElement(driver, Login);

	}

	// Day 9: Selecting options from usermenu drop down

	public boolean selectOptionFromUserMenuOption(WebDriver driver, String sOption) {
		boolean isOptionClicked = false;
		WebElement userMenuOption = driver.findElement(By.xpath("//*[text()='" + sOption + "']"));
		if (userMenuOption.isDisplayed()) {
			userMenuOption.click();
		} else {
			System.out.println("Option " + sOption + "not found");
		}
		return isOptionClicked;

	}

	public boolean logOut(WebDriver driver) {
		
		return this.selectOptionFromUserMenuOption(driver, "Logout");
	}
	
	/*
	 * @FindBy(id = "forgotPassForm") public WebElement passwordResetScreen;
	 */
	public void forgotPassWord(WebDriver driver) {
		if (forgotPassword.isDisplayed()) {
			forgotPassword.click();
		} else {
			System.out.println("forgotPassword button  is not visible");
		}

	}
	
public void clicklogout(WebDriver driver) {
	if(homeUserMenu.isDisplayed()) {
		homeUserMenu.click();
		Common_Utils_Poorna.waitForElement(driver, Logout);
		Logout.click();
	}
	}
}

