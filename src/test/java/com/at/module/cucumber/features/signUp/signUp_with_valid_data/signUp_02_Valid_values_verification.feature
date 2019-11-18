 Feature: sign up using new valid user data

#Common preconditions
 Background:
    Given the user navigates to Home page
    And the user clicks on 'SignUp' link

 @signUp
 Scenario Outline: 02_Sign up with new valid values
 #User is able to sign up with new valid values
    When the username "<username>" was registered with password "<password>", name "<name>", email "<email>"
    And the user selects '23', 'November' and '2019' date of birth value
    And the user attempts to sign up
    Then Profile page is opened
 #Log off
    When the user logs off
    Then LogIn page is opened

    Examples:
 | username                                                           | password                                                           | name                                                               | email              |
 | 1                                                                  | 1                                                                  | 1                                                                  |    1@gmail.com     |
 | 123                                                                | 123                                                                | 123                                                                |    e@gmail.com     |
 | a                                                                  | a                                                                  | a                                                                  | e123@gmail.com     |
 |    a                                                               |    a                                                               |    a                                                               | .@e.gmail.com      |
 | !                                                                  | !                                                                  | !                                                                  | e.e@e.e.gmail.com |
 | a.                                                                 |h.                                                                 | a.                                                                 | e.123@w-g.com      |
 | admin1                                                             | hero1                                                             | admin1                                                             | e___123@w-g-g.com  |
 | aadmin                                                             | ehero                                                             | aadmin                                                             | e-123@w-g-g.com    |
 | admi                                                               | he                                                               | admi                                                               | e123@g             |
 | dmin                                                               | ro                                                               | dmin                                                               | e123@gmail         |
 | Admin                                                              | Hero                                                              | Admin                                                              | E123@gmail.com.com |
 | admiN                                                              | herO                                                              | admiN                                                              | e123@Dmail.com     |
 | ADMIN                                                              | HERO                                                              | ADMIN                                                              | e123@gmail.Com     |
 | a123                                                               | a123                                                               | a123                                                               | E123@GMAIL.COM     |
 | a123!                                                              | a123!                                                              | a123!                                                              | e-@gmail.com       |
 | admin 1                                                            | hero 1                                                            | admin 1                                                             | e_@gmail.com       |
 | I Want To   Be  Admin                                              | I Want To   Be  Admin                                              | I Want To   Be  Admin                                              | e.@gmail.com       |
 |              Admin                                                 |              Admin                                                 |                                                            Admin   | e!@123             |
 | 管理者の資格情報                                                     | 管理者の資格情報                                                     | 管理者の資格情報                                                      | .@gmail.com        |
 | àáâãäåçèéêëìíîðñòôõöö                                              | àáâãäåçèéêëìíîðñòôõöö                                              | àáâãäåçèéêëìíîðñòôõöö                                              | !@gmail.1          |
 | ♣ ☺ ♂                                                             | ♣ ☺ ♂                                                             | ♣ ☺ ♂                                                             | +@w                |
 | +++&*?#+@w                                                         | +++&*?#+@w                                                         | +++&*?#+@w                                                         | +++&*?#+@w         |
     |      بيانات اعتماد |                                      بيانات اعتماد المسؤول         | بيانات اعتماد ا                                                    |                                             2@2                     |
 | ывпЫПКПАвапавопаол ААкурыкервоУУПК ЫКПКРВЕрвеарапрпотпр УЕКУПКВРКп | ывпЫПКПАвапавопаол ААкурыкервоУУПК ЫКПКРВЕрвеарапрпотпр УЕКУПКВРКп | ывпЫПКПАвапавопаол ААкурыкервоУУПК ЫКПКРВЕрвеарапрпотпр УЕКУПКВРКп | oirghilshjjthISUHFUEHGJKLHGJKNLKjlksjeflkhlHFLKHGLJKHJK--------sufugbdrigbdiyugUGYYGGVY@gmail.com |
 | <meta content='width=1100' name='viewport'/>                       | <meta content='width=1100' name='viewport'/>                       | <meta content='width=1100' name='viewport'/>                       | e123@gmail.com     |