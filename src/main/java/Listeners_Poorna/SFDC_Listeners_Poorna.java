package Listeners_Poorna;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import file_utiles_Poorna.Common_Utils_Poorna;
import test_Poorna.Base_Test_Poorna;

public class SFDC_Listeners_Poorna extends Base_Test_Poorna implements ITestListener {
@Override
public void onTestStart(ITestResult result) {
	System.out.println("Test started");
}
@Override
public void onTestSuccess(ITestResult result) {
	//System.out.println("Test passed");
	Base_Test_Poorna.test.pass(result.getName()+"Passed");
Base_Test_Poorna.test.pass(MarkupHelper.createLabel(result.getName()+" passed", ExtentColor.GREEN));
}
@Override
public void onTestFailure(ITestResult result) {
	try {
		String screenShotPath= Common_Utils_Poorna.captureScreenShot(getDriver());
		Base_Test_Poorna.test.addScreenCaptureFromPath(screenShotPath);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Base_Test_Poorna.test.fail(result.getName()+"failed");
	Base_Test_Poorna.test.fail(MarkupHelper.createLabel(result.getName()+" failed", ExtentColor.RED));
}

}
