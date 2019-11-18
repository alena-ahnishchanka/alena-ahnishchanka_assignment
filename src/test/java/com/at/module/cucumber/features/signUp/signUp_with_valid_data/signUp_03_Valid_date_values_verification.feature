 Feature: sign up using new valid date values

#Common preconditions
 Background:
    Given the user navigates to Home page
    And the user clicks on 'SignUp' link

 @signUp
 Scenario Outline: 03_Sign up with valid date values
 #User is able to sign up with valid date values
    When the username 'User 1' was registered with password 'hero', name 'Name1', email 'e123@gmail.com'
    And the user selects "<day>", "<month>" and "<year>" date of birth value
    And the user attempts to sign up
    Then Profile page is opened
 #Log off
    When the user logs off
    Then LogIn page is opened

    Examples:
 | day    | month    | year    |
 | 1      | January  | 2019    |
 | 31     | December | 1900    |
 | 1      | May      | 2008    |
 | 20     | May      | 1987    |