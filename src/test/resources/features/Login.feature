Feature: As a user, I should be able to log in

  Scenario Template: Verify login with valid credentials
    Given user is on the login page
    When user use username "<username>" and passcode "<password>"
    And user click the login button
    Then user should be at the dashboard page

    Examples:
      | username | password    |
      | User9    | Userpass123 |
      | User39   | Userpass123 |
      | User69   | Userpass123 |
      | User99   | Userpass123 |