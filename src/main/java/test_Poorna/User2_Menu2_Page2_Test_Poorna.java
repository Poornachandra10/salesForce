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
import pages_Poorna.User2_Menu2_Page2_Poorna;

public class User2_Menu2_Page2_Test_Poorna extends Base_Test_Poorna{
	protected static Logger logger = LogManager.getLogger("");

@Test//(enabled=false)
public void UserMenu_DropDownTC_05() throws IOException {
	
	WebDriver driver =Base_Test_Poorna.getDriver();
	Login_Page_Poorna lpp = new Login_Page_Poorna(driver);
	User2_Menu2_Page2_Poorna umpp2=new User2_Menu2_Page2_Poorna(driver);
	
	Assert.assertTrue(umpp2.UserMenuPageLaunchApp(driver, "https://login.salesforce.com/"));
	test.info("verified given App is launched");
	logger.debug("verified given App is launched");
	
	lpp.enterUserName(driver, Properties_Files_Utils_Poorna.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.username"));
	test.info("User name given");
	logger.debug("User name given");
	
	lpp.enterPassword(driver, Properties_Files_Utils_Poorna
			.readPropertiesFile(File_constants_Poorna.CREDENTIALS_FILE_PATH, "Sales.password"));
	test.info("Password given");
	logger.debug("Passwordgiven");
	
	lpp.ClickLoginButton(driver);
	test.info("clicked the login in button");
	logger.debug("clicked the login button");
	
	Assert.assertTrue(umpp2.isHomePageDisplayed(driver), "Home page should displayed");
	test.info("home page should displayed");
	logger.debug("home page should displayed");

	umpp2.ClickOnUserMenu(driver);
	test.info("clicked the usermenu button");
	logger.debug("clicked the usermenu button");
	
	test.pass("TC05 Login to home page then verify the usermenuoptions= passed");

Assert.assertTrue(umpp2.verifyUserMenuItems(driver),"Verified User menu items displayed");
}




}
