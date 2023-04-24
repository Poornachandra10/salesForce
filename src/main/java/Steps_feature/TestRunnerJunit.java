package Steps_feature;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\feature\\LoginScenarios.feature", glue="Steps_feature")
public class TestRunnerJunit {

}
