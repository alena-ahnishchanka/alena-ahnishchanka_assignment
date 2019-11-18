 Feature: login with invalid user credentials

#Common preconditions
 Background:
    Given the user navigates to Home page
    And the user clicks on 'LogIn' link

@logIn
 Scenario Outline: 04_Login with invalid username and password
 #User is not able to login with invalid user credentials
    When the username "<username>" was registered with password "<password>"
    And the user attempts to login
    Then Profile page is not opened
    And LogIn page is opened

    Examples:
 | username   | password |
 |            |          |
 |            | hero     |
 |  admin     |          |
 |  admin     | hero1    |
 |  admin!    | hero     |
 |  admin     | _hero    |
 |  admin     | hero 1   |
 |  admin     | hhero    |
 |  admin     | Hero     |
 |  admin     | HERO     |
 |  admin     | ro       |
 |  admin     | he       |
 |  Admin     | hero     |
 |  ADMIN     | hero     |
 |  dmin      | hero     |
 |  admi      | hero     |
 |  admin 1   | hero     |
 |  admin     | maniac   |
 |  123       | 123      |
 |  aaa       | aaa      |
 |  -         | -        |