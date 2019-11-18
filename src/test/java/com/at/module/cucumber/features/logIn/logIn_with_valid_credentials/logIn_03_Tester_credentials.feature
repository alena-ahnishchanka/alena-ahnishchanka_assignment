 Feature: login with valid user authentication using tester credentials

#Common preconditions
 Background:
    Given the user navigates to Home page
    And the user clicks on 'LogIn' link

@logIn
 Scenario: 03_Login with Tester username and password
 #User is able to login with tester user credentials
    When the username 'tester' was registered with password 'maniac'
    And the user attempts to login
    Then Profile page is opened
 #User is able to see only tester user information on Profile page
    And he should see a welcome message: 'How are you doing, Al Skept-Cal Tester?'
    And he should see a super power message: "Your super power: Voltage AND Current."
    And he should not see a message: "This is a list of users for you:"
    And he should not see a list of users table
    And he should see a status message: "Logged in as Al Skept-Cal Tester (as.tester@wearewaes.com)!"
 #User is able to see tester user information on Details page
    When the user clicks on 'Details' link
    Then Details page is opened
    And he should see name details: "Name: Al Skept-Cal Tester"
    And he should see email details: "Email address: as.tester@wearewaes.com"
 #User is able to log off from Home page
    When the user clicks on 'Home' link
    Then Home page is opened
    When the user logs off
    Then LogIn page is opened