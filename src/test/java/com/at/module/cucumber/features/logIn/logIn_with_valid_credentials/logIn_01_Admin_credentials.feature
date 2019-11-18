 Feature: login with valid user authentication using admin credentials

#Common preconditions
 Background:
    Given the user navigates to Home page
    And the user clicks on 'LogIn' link

@logIn
 Scenario: 01_Login with Admin username and password
 #User is able to login with admin user credentials
    When the username 'admin' was registered with password 'hero'
    And the user attempts to login
    Then Profile page is opened
 #User is able to see admin user information on Profile page
    And he should see a welcome message: 'How are you doing, Amazing Admin?'
    And he should see a super power message: "Your super power: Change the course of a waterfall."
    And he should see a message: "This is a list of users for you:"
    And he should see a list of users table
    And list of users table should contain 3 users
    And list of users table should contain a user with 'Amazing Admin' name and 'a.admin@wearewaes.com' e-mail in row 1
    And list of users table should contain a user with 'Al Skept-Cal Tester' name and 'as.tester@wearewaes.com' e-mail in row 2
    And list of users table should contain a user with 'Zuper Dooper Dev' name and 'zd.dev@wearewaes.com' e-mail in row 3
    And he should see a status message: "Logged in as Amazing Admin (a.admin@wearewaes.com)!"
 #User is able to see admin user information on Details page
    When the user clicks on 'Details' link
    Then Details page is opened
    And he should see name details: "Name: Amazing Admin"
    And he should see email details: "Email address: a.admin@wearewaes.com"
    And he should see a status message: "Logged in as Amazing Admin (a.admin@wearewaes.com)!"
 #User is able to log off from Details page
    When the user logs off
    Then LogIn page is opened
 #User is able to return to Home page
    When the user clicks on 'Home' link
    Then Home page is opened