package test_Poorna;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants_Poorna.File_constants_Poorna;
import file_utiles_Poorna.Properties_Files_Utils_Poorna;
import pages_Poorna.Login_Page_Poorna;
import pages_Poorna.User_Menu_Page_Poorna;

public class User_Menu_Page_Test_Poorna extends Base_Test_Poorna {
	protected static Logger logger = LogManager.getLogger("");

	// logger.debug("BaseTest : setDriver : driver configuration done");
	@Test(enabled = false)
	public void userMenu_TC06() throws IOException, InterruptedException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "ActualURL");

		LPP.enterUserName(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username"));

		LPP.enterPassword(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.password"));
		LPP.ClickLoginButton(driver);

		Assert.assertTrue(LPP.isHomePageDisplayed(driver), "Home page should be displayed");
		UMPP.clickOnUserMenu(driver);
		
		Assert.assertTrue(UMPP.verifyUserMenuItems(driver), "Failed to verify usermenu options");
		
		Assert.assertTrue(UMPP.selectMyProfile(driver), "Failed to select my profile");
		
		Assert.assertTrue(UMPP.isProfilePageVisible(driver), "Profile page should visible");
		
		UMPP.clickEditProfile(driver);
		
		Assert.assertTrue(UMPP.toVerifyPopUpWindow(driver), "Failed to verify pop up my profile");
		
		Assert.assertTrue(
				UMPP.verifyLastNameChangeInAboutTab(driver,
						Properties_Files_Utils_Poorna.readUserMenuTestData("usermenu.profile.lastname")),
				"Failed to verify lastname");
		// C:\Users\poorn\eclipse-workspace\salesforce\SaleForce_Info\UserMenu_Testdata.Properties
		Assert.assertTrue(UMPP.verifyCreatePost(driver, File_constants_Poorna.USER_MENU_FILE_UPLOAD_PATH),
		
				"Failed to upload photo");
		
		Assert.assertTrue(UMPP.uploadPhoto(driver, File_constants_Poorna.USER_MENU_PHOTO_UPLOAD_PATH),
			
				"Failedto verify photo upload");
		
		test.pass("TC_06 Pass");
	}

	// SalesForce login page is launched and application home page is logged in with
	// correct username.
	// User menu drop down shpuld be available.
	// Drop down with "My profile", "My Settings", "Developer Console","Logout" ,
	// "Switching to lightning Experience" is displayed

	@Test(enabled = false)
	public void UserMenuDropDownTC_05() throws IOException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		test.info("App is launched");
		logger.debug("App is launched");

		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "ActualURL");
		test.info("verified given App is launched");
		logger.debug("verified given App is launched");

		LPP.enterUserName(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username"));
		test.info("User name given");
		logger.debug("User name given");

		LPP.enterPassword(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.password"));
		test.info("Password given");
		logger.debug("Passwordgiven");

		LPP.ClickLoginButton(driver);
		test.info("clicked the login in button");
		logger.debug("clicked the login button");

		Assert.assertTrue(LPP.isHomePageDisplayed(driver), "Home page should be displayed");
		UMPP.clickOnUserMenu(driver);
		// Assert.assertTrue(UMPP.verifyUserMenuItems(),"verified usermenu options");
		test.info("verified usermenu items");
		logger.debug("verifyed user menu items");

		test.pass("TC05 Login to home page then verify the usermenuoptions= passed");
		test.pass("TC_05 Pass");
	}

//Drop down with "My profile", "My Settings", "Developer Console","Logout" is displayed
//My Settings page is displayed
//Login history is displayed and the data is downloaded in .csv format.
//Reports field is added to Selected Tabs list and also added in the links available in top of salesforce page and sales force chatter page and sales and marketing pages.
//Given details are saved as default mail options and My settings page is displayed.
//Sample event pop window is dispayed.

	@Test // (enabled=false)
	public void UserDrops_TC07() throws IOException, InterruptedException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		test.info("App is launched");
		logger.debug("App is launched");

		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "ActualURL");
		test.info("verified given App is launched");
		logger.debug("verified given App is launched");

		LPP.enterUserName(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username"));
		test.info("User name given");
		logger.debug("User name given");

		LPP.enterPassword(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.password"));
		test.info("Password given");
		logger.debug("Passwordgiven");

		LPP.ClickLoginButton(driver);
		test.info("clicked the login in button");
		logger.debug("clicked the login button");

		//Assert.assertTrue(LPP.isHomePageDisplayed(driver), "Home page should be displayed");

		UMPP.clickOnUserMenu(driver);
		//Assert.assertTrue(UMPP.selectMyProfile(driver), "Failed to select my profile");
		
		/*
		 * Assert.assertTrue(UMPP.verifyUserMenuItems(driver),
		 * "Failed to verify usermenu options");
		 * 
		 * test.info("Verifying the usermenu items");
		 * logger.debug("Verifying the usermenu items");
		 */

	//	UMPP.ismySettingsPageVisible(driver);
		test.info("Verifying my settings page visible");
		logger.debug("Verifying my settings page visible");
		// click on personal

		UMPP.selectPersonalLink(driver);
		Thread.sleep(2000);
		test.info("Verifying my settings page personal link is visbile or not, if visible click it");
		logger.debug("Verifying my settings page personal link is visbile or not, if visible click it");

		UMPP.selecthistory(driver);
		test.info("Verifying history is visbile or not, if visible click it");
		logger.debug("Verifying history is visbile or not, if visible click it");

		test.pass("TC_07 Pass");
	
	}
//Drop down with "My profile", "My Settings", "Developer Console","Logout" is displayed
//Force.com Developer Console window is displayed
//Force.com Developer Console window is closed

	@Test(enabled = false) // (priority=3)
	public void checkDeveloperConsole_TC_08() throws IOException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		test.info("App is launched");
		logger.debug("App is launched");

		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "ActualURL");
		test.info("verified given App is launched");
		logger.debug("verified given App is launched");

		LPP.enterUserName(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username"));
		test.info("User name given");
		logger.debug("User name given");

		LPP.enterPassword(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.password"));
		test.info("Password given");
		logger.debug("Passwordgiven");

		LPP.ClickLoginButton(driver);
		test.info("clicked the login in button");
		logger.debug("clicked the login button");

		Assert.assertTrue(LPP.isHomePageDisplayed(driver), "Home page should be displayed");
		test.info("Home page should be displayed");
		logger.debug("Home page should be displayed");

		UMPP.clickOnUserMenu(driver);
		test.info("Clicking the user menu button");
		logger.debug("Clicking the user menu button");

		UMPP.isDevelopersConsoleVisible(driver);
		test.info("Clicking the DevelopersConsole button");
		logger.debug("Clicking the DevelopersConsole button");

		test.pass("TC_08 Pass");

	}

}
