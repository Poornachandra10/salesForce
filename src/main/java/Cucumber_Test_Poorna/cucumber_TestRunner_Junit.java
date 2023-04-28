package Cucumber_Test_Poorna;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\main\\java\\feature"}, 
		glue = "step_feature_new_cucumber", plugin = {"pretty",
				"html:src\\main\\resources\\reports\\cucumber.html"},
		monochrome = true)
public class cucumber_TestRunner_Junit {

}
