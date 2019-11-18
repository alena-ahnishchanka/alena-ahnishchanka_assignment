 Feature: sign up using new invalid email

#Common preconditions
 Background:
    Given the user navigates to Home page
    And the user clicks on 'SignUp' link

 @signUp
 Scenario Outline: 07_Sign up with invalid email
 #User is not able to sign up with invalid email
    When the username "<username>" was registered with password "<password>", name "<name>", email "<email>"
    And the user selects '23', 'November' and '2019' date of birth value
    And the user attempts to sign up
    Then Profile page is not opened
    And SignUp page is opened

    Examples:
 | username  | password | name                | email         |
 |  admin1   | 1        | 1                   |               |
 |  admin1   | hero     | Amazing Admin       | @gmail.com    |
 |  admin1   | hero1    | 123                 | @@gmail.com   |
 |  admin1   | wizard   | Zuper Dooper Dev    | a@a@gmail.com |
 |  admin1   | dev      | 123                 | @a@gmail.com  |
 |  admin1   | 1        | 1                   | gmail.com     |
 |  admin1   | hero     | Amazing Admin       | a@.com        |
 |  admin1   | hero1    | 123                 | a@_com        |
 |  admin1   | wizard   | Zuper Dooper Dev    | a@/com        |
 |  admin1   | dev      | 123                 | a@-com        |
 |  admin1   | dev      | 123                 | a@ com        |
 |  admin1   | dev      | 123                 | a @com        |
 |  admin1   | dev      | 123                 | a@            |
 |  admin1   | dev      | 123                 | a@.           |
 |  admin1   | dev      | 123                 | @.            |
 |  admin1   | dev      | 123                 | @             |
 |  admin1   | dev      | 123                 | a             |
 |  admin1   | dev      | 123                 | 1             |
 |  admin1   | dev      | 123                 | a.com         |
 |  admin1   | hero     | Amazing Admin       | a@..com       |
 |  admin1   | hero     | Amazing Admin       | a@.-com       |
 |  admin1   | hero     | Amazing Admin       | a@-com        |
 |  admin1   | hero     | Amazing Admin       | -com          |
 |  admin1   | hero     | Amazing Admin       | -             |
 |  admin1   | hero     | Amazing Admin       | .             |
 |  admin1   | dev      | 123                 | a@com@        |
 |  admin1   | dev      | 123                 | a@com.        |
 |  admin1   | dev      | 123                 | a@com=        |
 |  admin1   | dev      | 123                 | a(@com@       |
 |  admin1   | dev      | 123                 | a)@com.       |
 |  admin1   | dev      | 123                 | a\"@com      |
 |  admin1   | dev      | 123                 | a>@com.       |
 |  admin1   | dev      | 123                 | a<@com        |
 |  admin1   | dev      | 123                 | a<@com        |
 |  admin1   | dev      | 123                 | ф@com         |
 |  admin1   | dev      | 123                 | ,@com         |
 |  admin1   | dev      | 123                 | ]@com         |
 |  admin1   | dev      | 123                 | a@]com        |
 |  admin1   | dev      | 123                 | a.com@        |
 |  admin1   | dev      | 123                 | ☺@com        |
 |  admin1   | dev      | 123                 | 資格情@com     |
 |  admin1   | dev      | 123                 | àáâ@com       |
 |  admin1   | dev      | 123                 | سؤول@com      |