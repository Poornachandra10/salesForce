package pages_Poorna;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.beust.ah.A;

import constants_Poorna.Wait_Constants_Poorna;
import file_utiles_Poorna.Common_Utils_Poorna;
import file_utiles_Poorna.Properties_Files_Utils_Poorna;

public class User_Menu_Page_Poorna extends Base_Page_Poorna {
	public User_Menu_Page_Poorna(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	public WebElement username;
	@FindBy(id = "password")
	public WebElement password;
	@FindBy(id = "Login")
	public WebElement Login;
	@FindBy(xpath = "//*[@id='rememberUn']")
	public WebElement rememberMe;

	@FindBy(css = "#error")
	public WebElement loginErrorMsg;

	@FindBy(id = "un")
	public WebElement forgotUsername;

	@FindBy(partialLinkText = "Forgot Your")
	public WebElement forgotPassword;

	@FindBy(id = "continue")
	public WebElement continueButton;

	@FindBy(id = "forgotPassForm")
	public WebElement passwordResetScreen;

	@FindBy(xpath = "//a[text()='Return to Login']")
	public WebElement returnToLoginButton;

	@FindBy(id = "idcard-identity")
	public WebElement savedUsername;

	@FindBy(id = "userNavLabel")
	public WebElement homeUserMenu;

	////*[@id='userNavLabel']
	@FindBy(xpath="//*[@id='userNavLabel']")
	//@FindBy(id = "userNavLabel")
	public WebElement userMenu;

	@FindBy(xpath = "//div[@id='userNav-menuItems']/a")
	public List<WebElement> userMenuOptions;

	@FindBy(id = "userNav-menuItems/a[1]")
	public WebElement MyProfile;

	@FindBy(id = "userNav-menuItems/a[2]")
	public WebElement MySettings;

	////*[@title='Developer Console (New Window)']
	//@FindBy(id = "userNav-menuItems/a[3]")
	@FindBy (xpath="//*[@title='Developer Console (New Window)']")
	public WebElement DevelopersConsole;

	@FindBy(id = "userNav-menuItems/a[4]")
	public WebElement SwitchtoLightningExperience;

	@FindBy(id = "userNav-menuItems/a[4]")
	public WebElement Logout;

	// My profile
	@FindBy(xpath = "//a[@class='contactInfoLaunch editLink']")
	public WebElement editprofilebutton;

	@FindBy(xpath = "//div/h2[@id='contactInfoTitle']")
	public WebElement EditProfilePopupwindow;

	@FindBy(id = "aboutTab")
	public WebElement Abouttab;

	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement Abouttablastname;

	@FindBy(xpath = "//*[@value='Save All']")
	public WebElement saveAllButton;

	@FindBy(xpath = "//*[@id=\"tailBreadcrumbNode\"]")
	public WebElement Userprofilepagenamedisplay;

	// Postlink
	@FindBy(css = "#publishereditablearea")
	public WebElement postLink;

	@FindBy(xpath = "/html/body")
	public WebElement postTextArea;

	@FindBy(xpath = "//input[@id='publishersharebutton']")
	public WebElement shareButton;

	// filelink

	@FindBy(xpath = "//*[@id='publisherAttachContentPost']")
	public WebElement filelink;

	@FindBy(xpath = "//a[@id='publisherAttachContentPost']/span[1]")
	public WebElement contentpost;

	@FindBy(css = "#chatterUploadFileAction")
	public WebElement Uploadfile;

	@FindBy(css = "#chatterFile")
	public WebElement Fileopen;

	@FindBy(css = "#publishersharebutton")
	public WebElement publish;

	@FindBy(xpath = "//input[@value='Cancel Upload']")
	public WebElement cancelUpload;

	@FindBy(id = "uploadLink")
	public WebElement updateButton;
	// Photo link

	@FindBy(xpath = "//*[@id=\"publisherAttachLinkPost\"]/span[1]")
	public WebElement photolink;

	@FindBy(id = "j_id0:uploadFileForm:uploadInputFile")
	public WebElement uploadphoto;

	@FindBy(name = "j_id0:uploadFileForm:uploadBtn")
	public WebElement uploadbutton;

	@FindBy(id = "publishersharebutton")
	public WebElement photosharebutton;

	@FindBy(id = "uploadPhotoContentId")
	public WebElement photoUploadIframe;

	@FindBy(xpath = "//input[@id='j_id0:uploadFileForm:uploadBtn']")
	public WebElement photoSaveButton;

	@FindBy(xpath = "//input[@id='j_id0:j_id7:save']")
	public WebElement photoSaveButton2;
	// My Settings
	// personallink

	@FindBy(xpath = "//*[@id=\'PersonalInfo_font\']")
	public WebElement personallink;

	@FindBy(xpath = "//*[@id=\"LoginHistory_font\"]")
	public WebElement loginHistorylink;

	@FindBy(xpath = "//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a")
	public WebElement logindisplay;

	@FindBy(id = "contactInfoContentId")
	public WebElement iframeAboutTab;
	// Display&layoutlink

	@FindBy(xpath = "//*[@id=\"DisplayAndLayout_font\"]")
	public WebElement DisplayLayoutlink;

	@FindBy(id = "CustomizeTabs_font")
	public WebElement CustomizedTab;

	@FindBy(xpath = "//*[@id=\"p4\"]/option[9]")
	public WebElement customApp;

	@FindBy(xpath = "//*[@id=\"duel_select_0\"]/option[73]")
	public WebElement Availabletab;

	@FindBy(xpath = "//*[@id=\"duel_select_0_right\"]/img")
	public WebElement Add;

	@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
	public WebElement save;

	@FindBy(id = "tabBar")
	public WebElement tabList;

	// Emaillink

	@FindBy(xpath = "//*[@id=\"EmailSetup_font\"]")
	public WebElement Emaillink;

	@FindBy(id = "EmailSettings_font")
	public WebElement MyEmailSettings;

	@FindBy(id = "sender_name")
	public WebElement Emailname;

	@FindBy(xpath = "//*[@id=\"sender_email\"]")
	public WebElement Emailaddress;

	@FindBy(xpath = "//*[@id=\"useremailSection\"]/table/tbody/tr[7]/td[2]/div")
	public WebElement BCCradiobutton;

	@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
	public WebElement Saveonemail;

	// Calendar and Remainders
	@FindBy(id = "CalendarAndReminders_font")
	public WebElement CalendarAndReminders;

	@FindBy(xpath = "//*[@id=\"Reminders_font\"]")
	public WebElement ActivityRemainder;

	@FindBy(id = "testbtn")
	public WebElement OpenaTestRemainder;

	@FindBy(xpath = "//*[@id=\"summary\"]")
	public WebElement SampleEventPopup;

	@FindBy(css = "#displayBadge")
	public WebElement moderatorButton;

	@FindBy(id = "profileTab_sfdc.ProfilePlatformFeed")
	public WebElement profilePage;

	@FindBy(id = "contactTab")
	public WebElement contactTab;

	@FindBy(xpath = "//div[@class='cxfeeditem feeditem'][1]//p")
	public WebElement firstPostText;

	@FindBy(xpath = "(//*[@class='contentFileTitle'])[1]")
	public WebElement verifyFilePostElement;

	
	//trying by my own
	/*
	 * @FindBy(xpath = "//*[@id=\'PersonalInfo_font\']") public WebElement
	 * personallink;
	 */
	//i m writing this for test case 7
	public void selectPersonalLink(WebDriver driver) {
		if(Common_Utils_Poorna.waitForElement(driver, personallink)) {
			personallink.click();
		}else {
			System.out.println("personal link is not available");
		}
	}
	public void selecthistory(WebDriver driver) {
		if(Common_Utils_Poorna.waitForElement(driver, loginHistorylink )) {
			loginHistorylink.click();	
		}else {
			System.out.println("personal link is not available");
			
		}
	}
	
	/*
	 * table handling and printing
	 * 
	 * @FindBy(id = "tabBar") public WebElement tabList; xpth =
	 * //*[@id="RelatedUserLoginHistoryList"]/div[1] for (int rows = 2; rows < 20;
	 * rows++) { for (int cd = 1; cd < 10; cd++) { WebElement data =
	 * driver.findElement(By.
	 * xpath("//table[@class='reportTable tabularReportTable']/tbody/tr["+rows+
	 * "]/td["+cd+"]")); System.out.print(data.getText()+"\t"); }
	 * System.out.println(); }
	 */
	  
	 
	/*
	 * public void tableHandling(WebDriver driver) { if(tabList.isDisplayed()) {
	 * 
	 * } }
	 */
	
	// Day 9: Selecting options from usermenu drop down

	public boolean selectOptionFromUserMenuOption(WebDriver driver, String sOption) {
		boolean isOptionClicked = false;

		if (!userMenu.isDisplayed()) {
			userMenu.click();
		}
		WebElement userMenuOption = driver.findElement(By.xpath("//*[text()='" + sOption + "']"));
		if (userMenuOption.isDisplayed()) {
			userMenuOption.click();
			isOptionClicked = true;
		} else {
			System.out.println("Option " + sOption + "not found");
		}
		return isOptionClicked;

	}

	public boolean logout(WebDriver driver) {
		return this.selectOptionFromUserMenuOption(driver, "Logout");
	}

	// Day 10=usermenu page test case 6
	public boolean verifyUserMenuItems(WebDriver driver) throws IOException {
		boolean isOptionverified = true;
		String[] expectedUserMenuItems = Properties_Files_Utils_Poorna.readUserMenuTestData("usermenu.items")
				.split(",");
		for (int i = 0; i < expectedUserMenuItems.length; i++) {
			String actualUserMenuItems = userMenuOptions.get(i).getText();
			if (actualUserMenuItems.equals(expectedUserMenuItems[i])) {
				System.out.println("The option" + expectedUserMenuItems[i] + "passed");
			} else {
				isOptionverified = false;
				System.out.println(
						"Actual option : " + actualUserMenuItems + "Expected option" + expectedUserMenuItems[i]);
			}
			}
			return isOptionverified;
		

		
	}
	// Day 11 video
	public boolean isProfilePageVisible(WebDriver driver) {
		return profilePage.isDisplayed();
	}
	public boolean ismySettingsPageVisible(WebDriver driver) {
		return MySettings.isDisplayed();
	}
	//im writing to check: if its not working plz delete the clickmysetting
	//This code is working for me
	
	/*
	 * public void clickmysetting(WebDriver driver) {
	 * 
	 * if(Common_Utils_Poorna.waitForElement(driver, MySettings)) {
	 * MySettings.click(); }
	} */
		 
	
	public void isDevelopersConsoleVisible(WebDriver driver) {
		
		if(DevelopersConsole.isDisplayed()){
			//Select select =new Select(DevelopersConsole);
			//select.selectByVisibleText("Developer Console");
				DevelopersConsole.click();}
		else {
			System.out.println("DevelopersConsole not present");
		}
	}
//Day11, click the user menu button
	public void clickOnUserMenu(WebDriver driver) {
		
		if (userMenu.isDisplayed()) {
	
			userMenu.click();
		} else {
			System.out.println("The Usermenu element is not visible");
		}
	}
	// Day 11video
	public boolean selectMyProfile(WebDriver driver) {
		return this.selectOptionFromUserMenuOption(driver, "My Profile");
	}
	public boolean SelectMySettings(WebDriver driver) {
		return this.selectOptionFromUserMenuOption(driver, "MySettings");
	}
	// Day 11 video, to click edit button
	// edit profile popup window is displayed
	// create two functions click on edit icon another to validate the above
//the page visible
	public void clickEditProfile(WebDriver driver) {
		if (Common_Utils_Poorna.waitForElement(driver, editprofilebutton)) {
			editprofilebutton.click();
		}
	}

//Day 11 video, to verifyprofilepopupwindow
	public boolean toVerifyPopUpWindow(WebDriver driver) {
		boolean isPopUpTabVerfied = false;
		if (Common_Utils_Poorna.waitForElement(driver, iframeAboutTab)) {
			driver.switchTo().frame(iframeAboutTab);
			if (Abouttab.isDisplayed() && contactTab.isDisplayed()) {
				isPopUpTabVerfied = true;
			}
			driver.switchTo().parentFrame();
		}
		return isPopUpTabVerfied;
	}

//click on about tab; userprofilepage withchanged lastname is displayed
	public boolean verifyLastNameChangeInAboutTab(WebDriver driver, String sLastname) throws InterruptedException {
		boolean isLastNameVerified = false;
		if (Abouttab.isDisplayed()) {
			Abouttab.click();
			Abouttablastname.clear();
			Abouttablastname.sendKeys(sLastname);
			saveAllButton.click();
			Thread.sleep(Wait_Constants_Poorna.WAIT_FOR_LAST_NAME_TO_UPDATE);
			driver.switchTo().parentFrame();
			if (Userprofilepagenamedisplay.isDisplayed()) {
				String sExpectedLastName = Userprofilepagenamedisplay.getText();
				if (sExpectedLastName.contains(sLastname))
					;
				{
					isLastNameVerified = true;
				}
			} else {
				System.out.println("AboutTab is not displayed");
			}
		}
		return isLastNameVerified;
	}

	// DAy 11 video 58:40
	// text entered should be displayed on the page
	public boolean verifyCreatePost(WebDriver driver, String sPostMessage) throws InterruptedException {
		boolean isCreatePostVerified = false;
		if (Common_Utils_Poorna.waitForElement(driver, postLink)) {
			postLink.click();
			driver.switchTo().frame(0);
			postTextArea.sendKeys(sPostMessage);
			driver.switchTo().parentFrame();
			if (shareButton.isDisplayed()) {
				shareButton.click();
				Thread.sleep(Wait_Constants_Poorna.WAIT_FOR_NEW_POST_TO_UPDATE);
				if (firstPostText.isDisplayed()) {
					if (firstPostText.getText().equals(sPostMessage)) {
						isCreatePostVerified = true;
					}
				}
			}
		} else {
			System.out.println("Element is not visible");
		}
		return isCreatePostVerified;

	}

	// select file should be posted

	public boolean verifyFileUpload(WebDriver driver, String sFilePathToUpload) throws InterruptedException {
		boolean isFileUpLoadSuccess = false;
		if (Common_Utils_Poorna.waitForElement(driver, Uploadfile)) {
			Uploadfile.click();
			if (Common_Utils_Poorna.waitForElement(driver, Fileopen)) {
				Fileopen.sendKeys(sFilePathToUpload);
				shareButton.click();
				Thread.sleep(Wait_Constants_Poorna.WAIT_FOR_UPLOAD_TO_START);
				if (Common_Utils_Poorna.waitForElementToDisappear(driver, cancelUpload)) {
					if (verifyFilePostElement.isDisplayed()) {
						isFileUpLoadSuccess = true;
					}
				}
			}
		}
		return isFileUpLoadSuccess;
	}

	public void clickOnUpdatePhoto(WebDriver driver) {
		Common_Utils_Poorna.moveToElement(driver, moderatorButton);
		if (updateButton.isDisplayed()) {
			updateButton.click();
		}
	}

	public boolean uploadPhoto(WebDriver driver, String sFilePath) throws InterruptedException {
		boolean isPhotoUploadSuccess = false;
		clickOnUpdatePhoto(driver);
		driver.switchTo().frame(photoUploadIframe);
		if (Common_Utils_Poorna.waitForElement(driver, uploadphoto)) {
			uploadphoto.sendKeys(sFilePath);
			photoSaveButton.click();
			Thread.sleep(Wait_Constants_Poorna.WAIT_FOR_ELEMENT_TO_LOAD);
			// check if is working or give this command"Thread.sleep(3000);
		}
		if (Common_Utils_Poorna.waitForElement(driver, photoSaveButton2)) {
			photoSaveButton2.click();
				isPhotoUploadSuccess = true;
		}
		driver.switchTo().parentFrame();
		return isPhotoUploadSuccess;
	}

}
