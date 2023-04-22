package test_Poorna;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants_Poorna.File_constants_Poorna;
import file_utiles_Poorna.Properties_Files_Utils_Poorna;
import pages_Poorna.CreateAccount_Page_Poorna;
import pages_Poorna.Login_Page_Poorna;

public class Create_Acc_Page_Test_Poorna extends Base_Test_Poorna {
	protected static Logger logger = LogManager.getLogger("");

@Test
public void Create_New_ACC_TC10() throws IOException {
	WebDriver driver = Base_Test_Poorna.getDriver();
	Login_Page_Poorna LPP = new Login_Page_Poorna(driver);
	CreateAccount_Page_Poorna CreateAccpage=new CreateAccount_Page_Poorna(driver);
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

	
}































}
