@findPet
Feature: Find Pets by Status

  Scenario Outline: User try to find pets based on status
    Given User wants to find pet within "<status>"
    When Sends get request to pet endpoint with the status as query parameter
    Then  status code is "200"
    Examples:
      | status    |
      | available |
      | pending   |
      | sold      |