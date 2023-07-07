package test_Poorna;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import constants_Poorna.File_constants_Poorna;
import file_utiles_Poorna.Properties_Files_Utils_Poorna;

import pages_Poorna.Login_Page_Poorna;
import pages_Poorna.RandomScenarios_Page_Poorna;

public class RandomScenarios_Test_Poorna extends Base_Test_Poorna {
	protected static Logger logger = LogManager.getLogger("");

	// Test case 33
	// SalesForce application should be Launced.
    //1. Home page should be displayed.                                
	// 2. Verify that the FirstName LastName of the account holder is displayed at
	// the top left hand side of the page, as a link.

	// 1. 'User:FirstName LastName' page should be displayed.
	// 2. This page should be same as the 'My Profile' page.

	@Test
	public void RandomScenarios_TestCase_33() throws IOException {
		WebDriver driver = Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"));
		test.info("using chrome driver laughing the app");
		logger.debug("using chrome driver laughing the app");

		RandomScenarios_Page_Poorna RSP = new RandomScenarios_Page_Poorna(driver);

		LPP.enterUserName(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username"));
		test.info("Entering user name ");
		logger.debug("Entering user name ");

		LPP.enterPassword(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.password"));
		test.info("Entering password");
		logger.debug("Entering password");

		LPP.ClickLoginButton(driver);
		test.info("clicked login button");
		logger.debug("clicked login button");

		Assert.assertTrue(RSP.printProfileNameAndCheck(driver));
		// RSP.printProfileNameAndCheck(driver);
		System.out.println("printing the values");

		test.info("checking the profile name and given profile name are same");
		logger.debug("");

		test.info("");
		logger.debug("");

	}
@Test
	public void RandomScenarios_Page_Editing_Page_TestCase_34() throws IOException, InterruptedException {
		WebDriver driver=Base_Test_Poorna.getDriver();
		Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
		Assert.assertTrue(LPP.launchApp(driver, "https://login.salesforce.com/"));
		test.info("using chrome driver laughing the app");
		logger.debug("using chrome driver laughing the app");
		RandomScenarios_Page_Poorna RSP = new RandomScenarios_Page_Poorna(driver);
		
		LPP.enterUserName(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username"));
		test.info("Entering user name ");
		logger.debug("Entering user name ");

		LPP.enterPassword(driver, Properties_Files_Utils_Poorna
				.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.password"));
		test.info("Entering password");
		logger.debug("Entering password");

		LPP.ClickLoginButton(driver);
		test.info("clicked login button");
		logger.debug("clicked login button");
		
		
		RSP.updateLastName_thenCheckChangedItOrNot(driver);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	//updateLastName_thenCheckChangedItOrNot
}
