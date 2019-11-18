 Feature: sign up using new invalid username

#Common preconditions
 Background:
    Given the user navigates to Home page
    And the user clicks on 'SignUp' link

 @signUp
 Scenario Outline: 05_Sign up with invalid username
 #User is not able to sign up with invalid username
    When the username "<username>" was registered with password "<password>", name "<name>", email "<email>"
    And the user selects '23', 'November' and '2019' date of birth value
    And the user attempts to sign up
    Then Profile page is not opened
    And SignUp page is opened

    Examples:
 | username  | password | name                | email                   |
 |           | 1        | 1                   | 1@gmail.com             |
 |  admin    |  hero    | Amazing Admin       | a.admin@wearewaes.com   |
 |  admin    |  hero1   | 123                 | e@gmail.com             |
 |  dev      |  wizard  | Zuper Dooper Dev    | zd.dev@wearewaes.com    |
 |  dev      |  dev     | 123                 | e@gmail.com             |
 |  tester   |  maniac  | Al Skept-Cal Tester | as.tester@wearewaes.com |
 |  tester   |  wizard  | 123                 | e@gmail.com             |