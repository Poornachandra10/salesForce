Feature: Login feature

Background:
Given  User Launches Login page 

Scenario Outline:
o: Verify the login functionality
Given  User Launches Login page
When User enters "<username>" and "<password>"
When User clicks login button
Then user should see the homepage
Examples:
|username      |password|
|poorna@ta.com |poorna  |
|chandra@ta.com|chandra |

Scenario: Verify the login functionality
When User enters invalid username and password
When User clicks login button
Then User should see the error message on the login screen