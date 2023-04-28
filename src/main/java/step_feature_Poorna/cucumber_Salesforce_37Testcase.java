package step_feature_Poorna;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import constants_Poorna.File_constants_Poorna;
import file_utiles_Poorna.Properties_Files_Utils_Poorna;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages_Poorna.Login_Page_Poorna;
import test_Poorna.Base_Test_Poorna;

public class cucumber_Salesforce_37Testcase extends Base_Test_Poorna {
	protected static Logger logger = LogManager.getLogger("");
	private static WebDriver driver;
	public static Login_Page_Poorna LPP;
	@Given("User launches Login page")
	public void user_launches_login_page() {
		driver = Base_Test_Poorna.getBrowserType("chrome", false);   
		LPP = new Login_Page_Poorna(driver);
		driver.get("https://login.salesforce.com/");
		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "Actual URL should be Match");
	}

	
	@When("User enters username and password")
	public void user_enters_username_and_password() throws IOException {
		LPP.enterUserName(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username"));
		
		
		LPP.enterPassword(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.password"));
	
	}
	@When("User clicks on login button")
	public void user_clicks_on_login_button1() {
		LPP.ClickLoginButton(driver);
	}


	/*
	 * @When("User clicks on login button") public void
	 * User_clicks_on_login_button() { LPP.ClickLoginButton(driver);
	 * 
	 * }
	 */

	@Then("User should see the home page")
	public void user_should_see_the_home_page() {
		Assert.assertTrue(LPP.isHomePageDisplayed(driver), "Home page should Display");
	}

	@Given("User login page is launched")
	public void user_login_page_is_launched() {
		//Assert.assertTrue(LPP.isLoginPageDisplayed(driver), "Login Page Should be displayed");
		
	}

	@When("Valid Username enters username field")
	public void valid_username_enters_username_field() throws IOException {
		LPP.enterUserName(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username"));
		 
		
	}

	@When("Valid Password enters password field")
	public void valid_password_enters_password_field() throws IOException {
		LPP.enterPassword(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.password"));
		
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		LPP.ClickLoginButton(driver);
	}

	@Then("close the browser")
	public void close_the_browser() {
	  // system
	}

	@When("user clicks on the user menu dropdown")
	public void user_clicks_on_the_user_menu_dropdown() {
	    
	}

	@When("Logout menu is clicked")
	public void logout_menu_is_clicked() {
	LPP.clicklogout(driver);
		Assert.assertTrue(LPP.logOut(driver), "LogOut Page should displayed");
	
	}

	@When("user clicks forgot password link")
	public void user_clicks_forgot_password_link() {
		LPP.forgotPassWord(driver);
		test.info("clicked forgotPassWord");
		logger.debug("Login_Test_Poorna TC3 Login_forgotPassWordbutton clicked");  
	}

	@When("salesforce forgot password page should be displayed")
	public void salesforce_forgot_password_page_should_be_displayed() {
	    
	}

	@When("valid username enters username field in forgot password")
	public void valid_username_enters_username_field_in_forgot_password() {
	    
	}

	@When("continue button is clicked")
	public void continue_button_is_clicked() {
		LPP.forgotPassWord(driver);
		
		logger.debug("Login_Test_Poorna TC3 Login_forgotPassWordbutton clicked");
		   
	}

	@When("Password reset message page is displayed")
	public void password_reset_message_page_is_displayed() {
	    
	}

	@When("Invalid Username enters username field")
	public void invalid_username_enters_username_field() throws IOException {
		LPP.enterUserName(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.wrongusername"));
		
   
	}

	@When("Invalid Password enters password field")
	public void invalid_password_enters_password_field() throws IOException {

		LPP.enterPassword(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.Wrongpassword"));
		
	}


}
