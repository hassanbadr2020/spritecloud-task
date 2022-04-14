Feature: add a new pet to the store

  Scenario Outline: Try to add a new pet to the store with valid data
    Given user has status and name
      | name   | status   |
      | <name> | <status> |
    And  the photo urls of "jhk" pet
    When user send post request with these valid data
    Then the pet added with name "<name>"
    And status code is "200"
    Examples:
      | name | status    |
      | Dog  | available |