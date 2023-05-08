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
import pages_Poorna.Login_Page_Poorna;

public class Contacts_Page_Test_Poorna extends Base_Test_Poorna {
	protected static Logger logger = LogManager.getLogger("");

	@Test//(enabled = false)

	public void Create_New_Contacts_TC_25() throws IOException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		// User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		Contacts_Page_Poorna CPP = new Contacts_Page_Poorna(driver);
		Assert.assertTrue(CPP.lanchAppOwnMethod(driver, "https://login.salesforce.com/"),"Login Page is Launched");
		
		//Assert.assertTrue(CPP.lanchAppOwnMethod(driver, "https://login.salesforce.com/"),"Login Page is Launched");
		
		
		/*
		 * test.info("App is launched"); logger.debug("App is launched");
		 * Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"),
		 * "ActualURL");
		 */
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

		Assert.assertTrue(CPP.isContactsMenuBarButtonVisible(driver),"Contact Home page should be displayed");
		test.info("Contact Home page should be displayed");
		logger.debug("Contact Home page should be displayed");
		// i gave boolean as type, then y it s running:
		CPP.isCreateNewIconVisible(driver);
		test.info("New Contact Home page should be displayed");
		logger.debug("New Contact Home page should be displayed");

		CPP.enterLastName(driver, Properties_Files_Utils_Poorna.readContacts_testdata("FirstName"),
				Properties_Files_Utils_Poorna.readContacts_testdata("LastName"));
		test.info("Entered FirstName&lastName");
		logger.debug("Entered FirstName&lastName");

		CPP.enterAccName(driver, Properties_Files_Utils_Poorna.readContacts_testdata("AccName"));
		test.info("Entered AccName and verified");
		logger.debug("Entered AccName and verified");

	}

	@Test//(enabled = false)
	public void CreateNewView_TC_26() throws IOException {

		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		// User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		Contacts_Page_Poorna CPP = new Contacts_Page_Poorna(driver);
		test.info("App is launched");
		logger.debug("App is launched");

		Assert.assertTrue(CPP.launchApp(driver, "https://login.salesforce.com/"), "ActualURL");
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

		Assert.assertTrue(CPP.isContactsMenuBarButtonVisible(driver),"Contact Home page should be displayed");
		test.info("Contact Home page should be displayed");
		logger.debug("Contact Home page should be displayed");

		CPP.isContactnewviewTab(driver);
		test.info("contact new view should be displayed");
		logger.debug("contact new view should be displayed");

		CPP.enterViewName(driver, Properties_Files_Utils_Poorna.readContacts_testdata("newViewName"));
		test.info("entered new name should be displayed");
		logger.debug("entered new name should be displayed");

		CPP.enter_Unique_Name(driver, Properties_Files_Utils_Poorna.readContacts_testdata("unique_Name"));
		test.info("entered unique name should be displayed");
		logger.debug("entered unique name should be displayed");

		// Contacts Home page is opened. Created View name is displayed in drop down in
		// that page by defalut.

		CPP.clickNewCondactViewSaveButton(driver);
		test.info("Clicked save button");
		logger.debug("entered unique name should be displayed");

		/*
		 * Have doubt in this CPP.checkEnteredName(driver);
		 * test.info("Checking the entered acc name");
		 * logger.debug("Checking the entered acc name");
		 */

	}

	@Test//(enabled = false)
	public void CheckingRecentlyCreatedContactsTC_27() throws IOException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		// User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		Contacts_Page_Poorna CPP = new Contacts_Page_Poorna(driver);
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

		Assert.assertTrue(CPP.isContactsMenuBarButtonVisible(driver),"Contact Home page should be displayed");
		test.info("Contact Home page should be displayed");
		logger.debug("Contact Home page should be displayed");

		CPP.isRecentlyCreatedContacts(driver);
		test.info("Recently Created Contacts should be displayed");
		logger.debug("Recently Created Contacts should be displayed");

		/*
		 * CPP.isMyContactsContactsPage(driver);
		 * test.info("My Contacts should be displayed");
		 * logger.debug("My Created Contacts should be displayed");
		 */

	}

	@Test//(enabled = false)
	public void CheckingMyContactsTC_28() throws IOException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		// User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		Contacts_Page_Poorna CPP = new Contacts_Page_Poorna(driver);
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

		Assert.assertTrue(CPP.isContactsMenuBarButtonVisible(driver),"Contact Home page should be displayed");
				
		test.info("Contact Home page should be displayed");
		logger.debug("Contact Home page should be displayed");

		CPP.isMyContactsContactsPage(driver);
		test.info("My Contacts should be displayed");
		logger.debug("My Created Contacts should be displayed");

	}
	
	
	@Test//(enabled = false)
	public void CheckingMyContactsTC_29() throws IOException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		// User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		Contacts_Page_Poorna CPP = new Contacts_Page_Poorna(driver);
		test.info("App is launched");
		logger.debug("App is launched");

		Assert.assertTrue(CPP.launchApp(driver, "https://login.salesforce.com/"), "ActualURL");
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

		Assert.assertTrue(CPP.isContactsMenuBarButtonVisible(driver),"Contact Home page should be displayed");
		test.info("All Contact page should be displayed");
		logger.debug("All Contact page should be displayed");	
	}	
	
	
	@Test//(enabled = false)
	public void CreateNewView_TC_30() throws IOException, InterruptedException {

		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		// User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		Contacts_Page_Poorna CPP = new Contacts_Page_Poorna(driver);
		test.info("App is launched");
		logger.debug("App is launched");

		Assert.assertTrue(CPP.launchApp(driver, "https://login.salesforce.com/"), "ActualURL");
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

		Assert.assertTrue(CPP.isContactsMenuBarButtonVisible(driver),"Contact Home page should be displayed");
		test.info("Contact Home page should be displayed");
		logger.debug("Contact Home page should be displayed");

		CPP.isContactnewviewTab(driver);
		test.info("contact new view should be displayed");
		logger.debug("contact new view should be displayed");

		/*
		 * CPP.enterViewName(driver,
		 * Properties_Files_Utils_Poorna.readContacts_testdata("newViewName"));
		 * test.info("entered new name should be displayed");
		 * logger.debug("entered new name should be displayed");
		 */
Thread.sleep(5000);
		CPP.enter_Unique_Name(driver, Properties_Files_Utils_Poorna.readContacts_testdata("AddingAnotherUniqueName"));
		test.info("entered unique name should be displayed");
		logger.debug("entered unique name should be displayed");

		// Contacts Home page is opened. Created View name is displayed in drop down in
		// that page by defalut.

		CPP.clickNewCondactViewSaveButton(driver);
		test.info("Clicked save button");
		logger.debug("Clicked save button");
		
		Assert.assertEquals(CPP.errorMessage.getText(), "Error:","Error msg is not visible");
		
	}
	
	@Test//(enabled=false)
	public void EnterViewNameUniqueNameButDontSaveIt_TC_31() throws IOException {

		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		// User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		Contacts_Page_Poorna CPP = new Contacts_Page_Poorna(driver);
		test.info("App is launched");
		logger.debug("App is launched");

		Assert.assertTrue(CPP.launchApp(driver, "https://login.salesforce.com/"), "ActualURL");
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

		Assert.assertTrue(CPP.isContactsMenuBarButtonVisible(driver),"Contact Home page should be displayed");
		test.info("Contact Home page should be displayed");
		logger.debug("Contact Home page should be displayed");

		CPP.isContactnewviewTab(driver);
		test.info("contact new view should be displayed");
		logger.debug("contact new view should be displayed");

		CPP.enterViewName(driver, Properties_Files_Utils_Poorna.readContacts_testdata("AddingVNameToNotSave"));
		test.info("entered new name should be displayed");
		logger.debug("entered new name should be displayed");

		CPP.enter_Unique_Name(driver, Properties_Files_Utils_Poorna.readContacts_testdata("AddingUniqNameToNotSave"));
		test.info("entered unique name should be displayed");
		logger.debug("entered unique name should be displayed");

		CPP.clickCancelButton(driver);
		test.info("clicked cancel button");
		logger.debug("clicked cancel button");

		//How to check if the more values are there?
		//Assert.assertEquals(CPP.errorMessage.getText(), "Error:","Error msg is not visible");
		Assert.assertEquals(CPP.viewTestbox.getText(), "All Contacts", "ABCD is not visible I M PRINT ING THE ALL CONTACTS WORD FOR MY OUT PUT");
		test.info("Expected text is visible");
		logger.debug("Expected text is visible");
}
	

	@Test// (enabled = false)
	public void CreateNewLastNameAccountNameUpdateing_TC_32() throws IOException, InterruptedException {

		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		// User_Menu_Page_Poorna UMPP = new User_Menu_Page_Poorna(driver);
		Contacts_Page_Poorna CPP = new Contacts_Page_Poorna(driver);
		test.info("App is launched");
		logger.debug("App is launched");

		Assert.assertTrue(CPP.launchApp(driver, "https://login.salesforce.com/"), "ActualURL");
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
		Assert.assertEquals(driver.getCurrentUrl(), "https://tekarch-db-dev-ed.develop.my.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom");
		
		Assert.assertTrue(CPP.isContactsMenuBarButtonVisible(driver),"Contact Home page should be displayed");
		test.info("Contact Home page should be displayed");
		logger.debug("Contact Home page should be displayed");
Assert.assertEquals(driver.getCurrentUrl(), "https://tekarch-db-dev-ed.develop.my.salesforce.com/003/o","Contact page is displayed");
		
		CPP.isCreateNewIconVisible(driver);
		test.info("New Contact Home page should be displayed");
		logger.debug("New Contact Home page should be displayed");

		CPP.enterLastName(driver, Properties_Files_Utils_Poorna.readContacts_testdata("FirstName"),
				Properties_Files_Utils_Poorna.readContacts_testdata("LastName1"));
		test.info("Entered FirstName&lastName");
		logger.debug("Entered FirstName&lastName");

		CPP.enterAccName(driver, Properties_Files_Utils_Poorna.readContacts_testdata("AccName1"));
		test.info("Entered AccName and verified");
		logger.debug("Entered AccName and verified");

		CPP.isClickSaveNewButton(driver);
		test.info("Clicked save button");
		logger.debug("entered unique name should be displayed");
		
		//here i m seeing error msgs, check in workshop
	Assert.assertEquals(CPP.contactsaPageVisibleChecking.getText(), "New Contact", "Contact page is visible");
	test.info("New contact page is visible");
	logger.debug("New contact page is visible");	
	}












}
