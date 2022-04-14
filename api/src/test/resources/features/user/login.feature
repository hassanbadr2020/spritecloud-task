@login
Feature: User logs into to the system

  Scenario Outline: User try to logs in with valid credentials
    Given User has a valid userName and password
      | userName   | password   |
      | <userName> | <password> |
    When  user sends a get request to the system with the valid credentials
    Then status code is "200"
    Examples:
      | userName | password |
      | TEST     | TEST     |