 Feature: sign up without selecting day value

#Common preconditions
 Background:
    Given the user navigates to Home page
    And the user clicks on 'SignUp' link

 @signUp
 Scenario: 08_Sign up without selecting day value
 #User is not able to sign up without selecting value
    When the username 'User 1' was registered with password 'hero', name 'Name1', email 'e123@gmail.com'
    And the user selects 'November' month and '2019' year date of birth value
    And the user attempts to sign up
    Then Profile page is not opened
    And SignUp page is opened