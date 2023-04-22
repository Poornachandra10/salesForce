package test_Poorna;

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

		// LeadsP.verifyLeadsDropDown(driver);
		// LeadsP.clickDropDownLeads.getText();
	}

	// Select 'My unread leads' from the view drop down and logout from the
	// application
	// Enter Username and pasword and click login
	// Click leads tab link from Home Page
    //Click on go button without changing list selection

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

		/*
		 * LeadsP.isclickDropDownLeads(driver);
		 * test.info("Leads page droup down elements are visible");
		 * logger.debug("Leads page elements are visible");
		 */
	//	LeadsP.dropDownClickToday_Leads(driver);
		// test.info("Leads page droup down elements are visible and selected Today's Leads");
		  //logger.debug("Leads page elements are visible and selected Today's Leads");

	Assert.assertTrue(LeadsP.isclickGoVisible(driver), "Go button is not visible");
	}
	
}
