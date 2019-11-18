 Feature: sign up using new invalid password

#Common preconditions
 Background:
    Given the user navigates to Home page
    And the user clicks on 'SignUp' link

 @signUp
 Scenario Outline: 04_Sign up with invalid password
 #User is not able to sign up with invalid password
    When the username "<username>" was registered with password "<password>", name "<name>", email "<email>"
    And the user selects '23', 'November' and '2019' date of birth value
    And the user attempts to sign up
    Then Profile page is not opened
    And SignUp page is opened

    Examples:
 | username   | password | name                | email                   |
 |  admin1    |          | 1                   | 1@gmail.com             |