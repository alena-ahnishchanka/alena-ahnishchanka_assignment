 Feature: login with valid user authentication using dev credentials

#Common preconditions
 Background:
    Given the user navigates to Home page
    And the user clicks on 'LogIn' link

@logIn
 Scenario: 02_Login with Dev username and password
 #User is able to login with dev user credentials
    When the username 'dev' was registered with password 'wizard'
    And the user attempts to login
    Then Profile page is opened
 #User is able to see only dev user information on Profile page
    And he should see a welcome message: 'How are you doing, Zuper Dooper Dev?'
    And he should see a super power message: "Your super power: Debug a repellent factory storage."
    And he should not see a message: "This is a list of users for you:"
    And he should not see a list of users table
    And he should see a status message: "Logged in as Zuper Dooper Dev (zd.dev@wearewaes.com)!"
 #User is able to see dev user information on Details page
    When the user clicks on 'Details' link
    Then Details page is opened
    And he should see name details: "Name: Zuper Dooper Dev"
    And he should see email details: "Email address: zd.dev@wearewaes.com"
 #User is able to log off from Profile page
    When the user clicks on 'Profile' link
    Then Profile page is opened
    When the user logs off
    Then LogIn page is opened