package test_Poorna;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Listeners_Poorna.SFDC_Listeners_Poorna;
import constants_Poorna.File_constants_Poorna;
import file_utiles_Poorna.Properties_Files_Utils_Poorna;
import pages_Poorna.Login_Page_Poorna;

@Listeners(SFDC_Listeners_Poorna.class)
public class Login_Test_Poorna extends Base_Test_Poorna {
	protected static Logger logger = LogManager.getLogger("");

	//Login +ve test case
	@Test//(enabled = false)
	public void LoginTC02() throws IOException, InterruptedException {
		WebDriver driver = Base_Test_Poorna.getDriver();

//driver.get("https://login.salesforce.com/");
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);

		
		test.info("App is launched");
		LPP.enterUserName(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username"));
		test.info("entered username");
		
//Assert.assertEquals(LPP.getUserName(driver),Properties_Files_Utils_Poorna.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username" ));
		
		LPP.enterPassword(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.password"));
		test.log(Status.INFO, "Password entered");
		
		Assert.assertTrue(LPP.selectRememberMeCheckBox(driver), "Remember me checkbox shoulb be selected");
		test.log(Status.INFO, "RememberMe checked");
		
		LPP.ClickLoginButton(driver);
		test.log(Status.INFO, "Login button clicked");

	Assert.assertTrue(LPP.isHomePageDisplayed(driver), "Home page should Display");
		test.pass("TC02 Login passed");


//Assert.assertTrue(LPP.isLoginPageDisplayed(driver), "Login Page Should be displayed");

//Assert.assertTrue(LPP.logOut(driver), "LogOut Page should displayed");

	}
	//Login error test case
	@Test//(enabled = false) // (priority = 1)
	public void Login_Error_MessageTC01() throws IOException, InterruptedException {
		// Password field should be empty
		// error message 'Please enter your password.'should be displayed
		WebDriver driver = Base_Test_Poorna.getDriver();

		// driver.get("https://login.salesforce.com/");
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);

		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "Actual URL should be Match");
		test.info("App is launched");
		LPP.enterUserName(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username"));
		test.info("entered username");
		LPP.clearMethod(driver);

		test.log(Status.INFO, "cleared the Password text box ");
		LPP.ClickLoginButton(driver);
		test.log(Status.INFO, "Login button clicked");
		Assert.assertTrue(LPP.errorMessageDisplayed(driver), "Error message should be Display");
		test.log(Status.INFO, "Error message displayed");
		test.pass("TC01 Login passed");
	}

	// test.pass("TC01 Login passed");SFDC login page is opened;Home page should be
	// displayed
	@Test //(enabled = false) // (priority =2)//(enabled=false)
	public void Login_HomePage_Displayed02() throws IOException, InterruptedException {
		WebDriver driver = Base_Test_Poorna.getDriver();

		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);

		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "Actual Url should be match");
		logger.debug("Login_Test_Poorna TC2 Login_HomePage_Displayed_ checking Homepage launched or not");
		test.log(Status.INFO, "checking - Homepage launched ");

		LPP.enterUserName(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username"));
		test.log(Status.INFO, "User name given");

		LPP.enterPassword(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.password"));
		test.log(Status.INFO, "Password given");
		LPP.ClickLoginButton(driver);
		test.log(Status.INFO, "Login button clicked");
		logger.debug("Login_Test_Poorna TC2 Login_HomePage_Displayed_ entered username and password");

		Assert.assertTrue(LPP.isHomePageDisplayed(driver), "Home page should Display");

		test.log(Status.INFO, "Checking -Home page displayed ");
		logger.debug("Login_Test_Poorna TC2_Home page displayed ");
		test.pass("TC02 Login& home page displayed passed");
		/*
		 * Assert.assertTrue(LPP.isLoginPageDisplayed(driver),
		 * "Login Page Should be displayed"); test.log(Status.INFO,
		 * "checked = Login page displayed");
		 */
	}

	@Test
	public void ClickRememberMeTC3() throws IOException, InterruptedException {
		WebDriver driver = Base_Test_Poorna.getDriver();

		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);

		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "Actual URL should be Match");
		test.info("App is launched");
		LPP.enterUserName(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username"));
		test.info("entered username");
		logger.debug("Login_Test_Poorna TC3 Login_HomePage_Displayed_ entered username and password");

		// Assert.assertEquals(LPP.getUserName(driver),Properties_Files_Utils_Poorna.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH,
		// "Sales.username" ));
		Thread.sleep(2000);
		LPP.enterPassword(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.password"));
		test.log(Status.INFO, "Password entered");

		Assert.assertTrue(LPP.selectRememberMeCheckBox(driver), "Remember me checkbox shoulb be selected");
		test.log(Status.INFO, "RememberMe checked");
		
		
		LPP.ClickLoginButton(driver);
		test.log(Status.INFO, "Login button clicked");
		logger.debug("Login_Test_Poorna TC2 Login_HomePage_Displayed_ entered username and password");

		LPP.clicklogout(driver);
		test.log(Status.INFO, "logout button clicked");
		test.pass("TC03 RememberMe check box clicking - passed");
	}
	//TC 04Password reset message page is displayed. An email associated with the <username> account is sent.

	@Test
	public void PasswordRest_Tc04_A() throws IOException {
		WebDriver driver = Base_Test_Poorna.getDriver();

		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);

		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "Actual URL should be Match");
		test.info("App is launched");
		LPP.enterUserName(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username"));
		test.info("entered username");
		logger.debug("Login_Test_Poorna TC3 Login_HomePage_Displayed_ entered username and password");
		LPP.forgotPassWord(driver);
		test.info("clicked forgotPassWord");
		logger.debug("Login_Test_Poorna TC3 Login_forgotPassWordbutton clicked");
		LPP.sendForgotPasswordValidGmail(driver, Properties_Files_Utils_Poorna.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Forget.email"));
		test.info("clicked forgotPassWord");
		test.pass("TC04 clicking the Password reset button -passed");
	}
	@Test
	public void WrongUserNameandPassword_TC04B() throws IOException {
	WebDriver driver = Base_Test_Poorna.getDriver();

	Login_Page_Poorna LPP = new Login_Page_Poorna(driver);

	Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "Actual Url should be match");
	logger.debug("Login_Test_Poorna TC2 Login_HomePage_Displayed_ checking Homepage launched or not");
	test.log(Status.INFO, "checking - Homepage launched ");

	LPP.enterUserName(driver, Properties_Files_Utils_Poorna
			.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.wrongusername"));
	test.log(Status.INFO, "wrong User name given");

	LPP.enterPassword(driver, Properties_Files_Utils_Poorna
			.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.Wrongpassword"));
	test.log(Status.INFO, "wrong Password given");
	LPP.ClickLoginButton(driver);
	test.log(Status.INFO, "Login button clicked");
	logger.debug("Login_Test_Poorna TC2 Login_HomePage_Displayed_ entered username and password");
	test.pass("TC04B Wrong user name and password given-passed");
	}
}
