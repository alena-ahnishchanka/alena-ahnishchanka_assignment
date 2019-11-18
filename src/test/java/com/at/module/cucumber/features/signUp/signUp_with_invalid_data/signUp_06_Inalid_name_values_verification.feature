 Feature: sign up using new invalid name

#Common preconditions
 Background:
    Given the user navigates to Home page
    And the user clicks on 'SignUp' link

 @signUp
 Scenario Outline: 06_Sign up with invalid name
 #User is not able to sign up with invalid name
    When the username "<username>" was registered with password "<password>", name "<name>", email "<email>"
    And the user selects '23', 'November' and '2019' date of birth value
    And the user attempts to sign up
    Then Profile page is not opened
    And SignUp page is opened

    Examples:
 | username  | password | name                | email                   |
 | 1         | 1        |                     | 1@gmail.com             |