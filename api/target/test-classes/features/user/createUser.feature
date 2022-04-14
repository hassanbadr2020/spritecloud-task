@createUser
Feature: Create a new User

  Scenario Outline: try to create a new user with valid data
    Given Admin has valid data to create a new user
      | id   | username   | firstName   | lastName   | email   | password   | phone   | userStatus   |
      | <id> | <username> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |
    When Admin send post request to create user
    Then status code is "200"
    And response body matches "json-schemas/createUser.json" in Api contract
    Examples:
      | id | username | firstName | lastName | email         | password | phone    | userStatus |
      | 0  | TEST     | TESTF     | TESTL    | test@test.com | TESTpass | 01313123 | 0          |

