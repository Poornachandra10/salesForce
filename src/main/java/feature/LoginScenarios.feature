Feature: Salesforce Test Cases

Scenario: verify the functionality
Given User launches Login page
When User enters username and password
When User clicks on login button
Then User should see the home page

Scenario: TC02:verify login with valid username and password
Given User launches Login page
When User login page is launched
When User enters username and password
When User clicks on Login button
Then close the browser

Scenario: TC03:Test the remember user check box
Given User launches Login page
When User login page is launched
When User enters username and password
When User clicks on Login button
When user clicks on the user menu dropdown
And Logout menu is clicked
Then close the browser

Scenario: TC04A:Test forgot password link
Given User launches Login page
When User login page is launched
When User enters username and password
And user clicks forgot password link
When salesforce forgot password page should be displayed
When valid username enters username field in forgot password
When continue button is clicked
When Password reset message page is displayed
Then close the browser

Scenario: TC04B:Test with wrong username and wrong password
Given User launches Login page
When User login page is launched
When User enters username and password
When User clicks on Login button
Then close the browser
