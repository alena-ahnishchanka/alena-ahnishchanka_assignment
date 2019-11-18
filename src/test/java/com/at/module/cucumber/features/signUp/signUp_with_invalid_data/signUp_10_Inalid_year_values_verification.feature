 Feature: sign up without selecting year value

#Common preconditions
 Background:
    Given the user navigates to Home page
    And the user clicks on 'SignUp' link

 @signUp
 Scenario: 10_Sign up without selecting year value
 #User is not able to sign up without selecting year value
    When the username 'User 1' was registered with password 'hero', name 'Name1', email 'e123@gmail.com'
    And the user selects '15' day and 'December' month date of birth value
    And the user attempts to sign up
    Then Profile page is not opened
    And SignUp page is opened