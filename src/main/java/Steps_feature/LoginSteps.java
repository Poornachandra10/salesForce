package Steps_feature;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class LoginSteps {
	@Given("User Launches Login page")
	public void user_launches_login_page() {
	  
		
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
	    
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
	    
		
	}

	@Then("user should see the homepage")
	public void user_should_see_the_homepage() {
	   
		
	}
	@When("User enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
	    
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		System.out.println("username"+string);
	    System.out.println("password"+string2);
		
	}
	@Then("User should see the error message on the login screen")
	public void user_should_see_the_error_message_on_the_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	}



