package test_Poorna;

import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants_Poorna.File_constants_Poorna;
import file_utiles_Poorna.Properties_Files_Utils_Poorna;
import pages_Poorna.Contacts_Page_Poorna;
import pages_Poorna.Leads_Page_Poorna;
import pages_Poorna.Login_Page_Poorna;
import pages_Poorna.User_Menu_Page_Poorna;

public class Leads_Page_Test_Poorna extends Base_Test_Poorna {
	protected static Logger logger = LogManager.getLogger("");

	/**
	 * /Tc20 //Click leads tab link from Home Page
	 * 
	 * //List should drop down and should show the following contents: All Open
	 * Leads / My Unread Leads / Recently Viewed Leads / Today's Leads.
	 * 
	 * @throws IOException
	 */
	@Test
	public void OpenLeadsPage_TC_20() throws IOException {

		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		// Contacts_Page_Poorna CPP = new Contacts_Page_Poorna(driver);
		Leads_Page_Poorna LeadsP = new Leads_Page_Poorna(driver);

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

		Assert.assertTrue(LeadsP.isLedsPageVisibleBoolean(driver), "Leads page is not visible");
		test.info("leads page is opened");
		logger.debug("leads page is opened");

		LeadsP.click_userMenu_logout(driver);
		test.info("from leads page logging out");
		logger.debug("from leads page logging out");

	}

	/**
	 * Link should navigate to Leads Home page List should drop down and should show
	 * the following contents: All Open Leads / My Unread Leads / Recently Viewed
	 * Leads / Today's Leads.
	 * 
	 * @throws IOException
	 */
	@Test
	public void validate_Leads_Select_View_TC_21() throws IOException {

		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		// Contacts_Page_Poorna CPP = new Contacts_Page_Poorna(driver);
		Leads_Page_Poorna LeadsP = new Leads_Page_Poorna(driver);

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

		Assert.assertTrue(LeadsP.isLedsPageVisibleBoolean(driver), "Leads page is not visible");
		test.info("Leads page is visible");
		logger.debug("Leads page is visible");

		LeadsP.isclickDropDownLeads(driver);
		test.info("Leads page droup down elements are visible");
		logger.debug("Leads page elements are visible");

		
		
		  LeadsP.verifyLeadsDropDown(driver);
		
		 
		LeadsP.click_userMenu_logout(driver);
		test.info("from leads page logging out");
		logger.debug("from leads page logging out");

	}

	// Select 'My unread leads' from the view drop down and logout from the
	// application
	// Enter Username and pasword and click login
	// Click leads tab link from Home Page
	// Click on go button without changing list selection

	// working positive
	@Test
	public void Functionality_of_Go_Button_TC22() throws IOException {

		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		// Contacts_Page_Poorna CPP = new Contacts_Page_Poorna(driver);
		Leads_Page_Poorna LeadsP = new Leads_Page_Poorna(driver);

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

		Assert.assertTrue(LeadsP.isLedsPageVisibleBoolean(driver), "Leads page is not visible");
		test.info("Leads page is visible");
		logger.debug("Leads page is visible");

		Assert.assertTrue(LeadsP.isclickGoVisible(driver), "Go button is not visible");

		LeadsP.click_userMenu_logout(driver);
		test.info("from leads page logging out");
		logger.debug("from leads page logging out");

	}

	// Link should navigate to Leads Home page
//select Todays Leads from the view drop down
//Todays's Lead page should be displayed.
	// logout

	@Test
	public void todays_Leads_TC23() throws IOException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		// Contacts_Page_Poorna CPP = new Contacts_Page_Poorna(driver);
		Leads_Page_Poorna LeadsP = new Leads_Page_Poorna(driver);

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

		Assert.assertTrue(LeadsP.isLedsPageVisibleBoolean(driver), "Leads page is not visible");
		test.info("Leads page is visible");
		logger.debug("Leads page is visible");

		LeadsP.dropDownClickToday_Leads(driver);
		test.info("Leads page droup down elements are visible and selected Today's Leads");
		logger.debug("Leads page elements are visible and selected Today's Leads");

		Assert.assertTrue(LeadsP.isclickGoVisible(driver), "Go button is not visible");
		test.info("clicked go button");
		logger.debug("clicked go button");

		Assert.assertTrue(
				LeadsP.launchLeadsPage(driver,
						"https://tekarch-db-dev-ed.develop.my.salesforce.com/00Q?fcf=00B3x00000BjLCw"),
				"url should match");
		test.info("checking the page url ");
		logger.debug("checking the page url");

		LeadsP.click_userMenu_logout(driver);
		test.info("from leads page logging out");
		logger.debug("from leads page logging out");

	}

	// New Lead creation page should open
//enter "ABCD" in the last name and company name field
	// click on the save button
	// new lead should be saved and the newly created lead view page should be
	// opened

	@Test
	public void newlyCreatedLeadView_TC24() throws IOException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		// Contacts_Page_Poorna CPP = new Contacts_Page_Poorna(driver);
		Leads_Page_Poorna LeadsP = new Leads_Page_Poorna(driver);

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

		Assert.assertTrue(LeadsP.isLedsPageVisibleBoolean(driver), "Leads page is not visible");
		test.info("Leads page is visible");
		logger.debug("Leads page is visible");

		LeadsP.isnewBtn(driver);
		test.info("clicking the new button");
		logger.debug("clicking the new button");

		LeadsP.sendKeysLastAndCompanyName(driver, "ABCD", "ABCD");
		test.info("adding last name company name and saving it");
		logger.debug("adding last name company name and saving it");

		/*
		 * Assert.assertEquals(LeadsP.checkingTestBlock.getText(), "ABCD",
		 * "both should match");
		 * test.info("checking the added last name is equal or not");
		 * logger.debug("checking the added last name is equal or not");
		 */

		Assert.assertTrue(LeadsP.ischeckingTestBlock(driver, "ABCD"), "ABCD should be printed ");
		test.info(" the newly created lead view page should be opened");
		logger.debug(" the newly created lead view page should be opened");
	}

}
