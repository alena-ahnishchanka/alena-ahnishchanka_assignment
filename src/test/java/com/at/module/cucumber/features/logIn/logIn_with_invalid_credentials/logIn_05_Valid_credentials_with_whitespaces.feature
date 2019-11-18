 Feature: login with invalid user authentication using admin credentials with whitespaces

#Common preconditions
 Background:
    Given the user navigates to Home page
    And the user clicks on 'LogIn' link

@logIn
 Scenario: 05_Login with valid username and password with whitespaces
 #User is not able to login with valid user credentials with whitespaces
    When the username 'admin ' was registered with password 'hero'
    And the user attempts to login
    Then Profile page is not opened
    And LogIn page is opened
    When the username 'admin' was registered with password ' hero'
    And the user attempts to login
    Then Profile page is not opened
    And LogIn page is opened