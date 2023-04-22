Feature: Login feature

Background:
Given  User Launches Login page 

Scenario: Verify the login functionality
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
Then user should see the homepage
|Student Age|
|poorna  10|
|chandra 20|