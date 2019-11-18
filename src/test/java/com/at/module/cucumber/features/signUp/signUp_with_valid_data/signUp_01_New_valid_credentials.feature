 Feature: sign up using new valid user data

#Common preconditions
 Background:
    Given the user navigates to Home page
    And the user clicks on 'SignUp' link

 @signUp
 Scenario: 01_Sign up with new valid user data
 #User is able to sign up with new valid user data
    When the username 'User 1' was registered with password 'hero', name 'Name1', email 'e123@gmail.com'
    And the user selects '23', 'November' and '2019' date of birth value
    And the user attempts to sign up
    Then Profile page is opened
 #User is able to see only new user information on Profile page
    And he should see a welcome message: 'Welcome to your new profile page, Name1!'
    And he should not see a super power message
    And he should not see a message: "This is a list of users for you:"
    And he should not see a list of users table
    And he should see a status message: "Logged in as Name1 (e123@gmail.com)!"
 #User is able to see new user information on Details page
    When the user clicks on 'Details' link
    Then Details page is opened
    And he should see name details: "Name: Name1"
    And he should see email details: "Email address: e123@gmail.com"
 #User is able to see new user updated information on Profile page
    When the user clicks on 'Profile' link
    Then Profile page is opened
    And he should see a welcome message: "How are you doing, Name1?"
    And he should see a super power message: "Your super power: You have no super powers yet. =[."
    And he should not see a message: "This is a list of users for you:"
    And he should not see a list of users table
    And he should see a status message: "Logged in as Name1 (e123@gmail.com)!"
 #User is able to log off from Details page
    When the user logs off
    Then LogIn page is opened
 #New user authentication data is not stored after log off
 #User is not able to login
    When the username 'User 1' was registered with password 'hero'
    And the user attempts to login
    Then he should see a status message: "Wrong credentials. You can do it, try again!"
    And Profile page is not opened
    And LogIn page is opened
 #User is able to sign up with previously used credentials
    When the user clicks on 'SignUp' link
    And the username 'User 1' was registered with password 'hero', name 'Name1', email 'e123@gmail.com'
    And the user selects '23', 'November' and '2019' date of birth value
    And the user attempts to sign up
    Then Profile page is opened
 #User is able to log off from Profile page
    When the user logs off
    Then LogIn page is opened