package test_Poorna;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import constants_Poorna.File_constants_Poorna;
import file_utiles_Poorna.Properties_Files_Utils_Poorna;
import pages_Poorna.Leads_Page_Poorna;
import pages_Poorna.Login_Page_Poorna;
import pages_Poorna.create_Opp_Page_Poorna;

public class create_Opp_Test_Poorna extends Base_Test_Poorna {
	protected static Logger logger = LogManager.getLogger("");

	/*
	 * * SalesForce login page is launched and application home page is logged in
	 * with correct username. Opportunities home page is displayed
	 */
	@Test
	public void opportunities_Drop_Down_TC15() throws IOException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		Leads_Page_Poorna LeadsP = new Leads_Page_Poorna(driver);
		create_Opp_Page_Poorna opp_Pg = new create_Opp_Page_Poorna(driver);

		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "ActualURL");

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

		Assert.assertTrue(opp_Pg.isoppPageIsOpened(driver), "opp page should opened");
		test.info("checking and clicked opp_page_icon");
		logger.debug("checking and clicked opp_page_icon");

		opp_Pg.verify_Opp_Page_DropDown(driver);
		test.info("checking the dropdown and printing it");
		logger.debug("checking the dropdown and printing it");

		// Assert.assertTrue(opp_Pg.verifyItems(driver), "it should match");

		LeadsP.click_userMenu_logout(driver);
		test.info("from opp page logging out");
		logger.debug("from opp page logging out");

	}

	/*
	 * Drop down with "All Oppotunities", "Closing Next Month",
	 * "Closing This Month", "My Opportunities", "New This Week",
	 * "Recently Viewed Opportunities","Won" should be available
	 */

	@Test
	public void create_new_Opp_TC17() throws IOException, InterruptedException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		Leads_Page_Poorna LeadsP = new Leads_Page_Poorna(driver);
		create_Opp_Page_Poorna opp_Pg = new create_Opp_Page_Poorna(driver);

		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "ActualURL");

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

		Assert.assertTrue(opp_Pg.isoppPageIsOpened(driver), "opp page should opened");
		test.info("checking and clicked opp_page_icon");
		logger.debug("checking and clicked opp_page_icon");

		opp_Pg.Click_OppPipeLine(driver);
		test.info("entering reports-pipelinepage");
		logger.debug("entering reports-pipelinepage");

		Thread.sleep(3000);

		Assert.assertEquals(opp_Pg.verify_Opp_Pipe_linePage.getText(), "Opportunity Pipeline",
				"Actual and expected should be same");

		test.info("verifying the page");
		logger.debug("verifying the page");

		System.out.println(opp_Pg.verify_Opp_Pipe_linePage.getText());

		LeadsP.click_userMenu_logout(driver);
		test.info("from opp page logging out");
		logger.debug("from opp page logging out");

	}

	// Launch and Login
	// Click on opportunities link

	// New Opportunity Edit page is displayed. Enter Opportunity Name,Account Name,
	// Close Date,Stage,Probability,Lead Source , Primary Campaign Source and click
	// on save button.

	// New Opportunity page is displayed with Opportunity details.

	@Test
	public void create_new_Opp_TC16() throws IOException, InterruptedException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		Leads_Page_Poorna LeadsP = new Leads_Page_Poorna(driver);
		create_Opp_Page_Poorna opp_Pg = new create_Opp_Page_Poorna(driver);

		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "ActualURL");

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

		Assert.assertTrue(opp_Pg.isoppPageIsOpened(driver), "opp page should opened");
		test.info("checking and clicked opp_page_icon");
		logger.debug("checking and clicked opp_page_icon");
		opp_Pg.iscreateNewButtonAval(driver);
		test.info("clicked the new opp button");
		logger.debug("clicked the newopp button");
		
		opp_Pg.sendingVal(driver);
		test.info("sending values for opp page");
		logger.debug("sending values for opp page");
		
		LeadsP.click_userMenu_logout(driver);
		test.info("from opp page logging out");
		logger.debug("from opp page logging out");
	}

	
	
	//SalesForce login page is launched and application home page is logged in with correct username.
//Click on opportunities link from the main menu
//Opportunities home page is displayed
//Click on Stuck Opportunities link  under Reports.
//Report Page with the Opportunities that are Stuck will be displayed.

	
	@Test
	public void reports_struck_Opp_TC18() throws IOException, InterruptedException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		Leads_Page_Poorna LeadsP = new Leads_Page_Poorna(driver);
		create_Opp_Page_Poorna opp_Pg = new create_Opp_Page_Poorna(driver);

		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "ActualURL");

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

		Assert.assertTrue(opp_Pg.isoppPageIsOpened(driver), "opp page should opened");
		test.info("checking and clicked opp_page_icon");
		logger.debug("checking and clicked opp_page_icon");
	
	opp_Pg.clickStruckOpp(driver);
	test.info("clicked Struck_opp_icon");
	logger.debug("clicked Struck_opp_icon");

	//WebDriverWait wait = new WebDriverWait(driver, 15);
	//wait.until((ExpectedConditions.presenceOfElementLocated((By) opp_Pg.oppPageVerify)));
	Thread.sleep(5000);
	Assert.assertEquals(opp_Pg.oppPageVerify.getText(), "Stuck Opportunities", "this condition should math");
	test.info("Stuck oppourtinutes page is opened");
	logger.debug("Stuck oppourtinutes page is opened");

	LeadsP.click_userMenu_logout(driver);
	test.info("from opp page logging out");
	logger.debug("from opp page logging out");
	}



//Click on opportunities link from the main menu
//Click on Quarterly Summary link and choose list of values for Interval such as Current FQ,Next FQ and Include such as All,
	//Open or closed Opportunities
	@Test
	public void search_Criteria_TC19() throws IOException, InterruptedException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		Leads_Page_Poorna LeadsP = new Leads_Page_Poorna(driver);
		create_Opp_Page_Poorna opp_Pg = new create_Opp_Page_Poorna(driver);

		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"), "ActualURL");

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

		Assert.assertTrue(opp_Pg.isoppPageIsOpened(driver), "opp page should opened");
		test.info("checking and clicked opp_page_icon");
		logger.debug("checking and clicked opp_page_icon");
		
		opp_Pg.openCheckCheck(driver);
		test.info("clicked the opp values to list");
		logger.debug("clicked the opp values to list");
		
		opp_Pg.intervalOppdropdown(driver);
		test.info("clicked the interval values to list");
		logger.debug("clicked the interval values to list");
		
		LeadsP.click_userMenu_logout(driver);
		test.info("from opp page logging out");
		logger.debug("from opp page logging out");
	}
}
