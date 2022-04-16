@deletePet
Feature: add a new pet to the store

  Scenario Outline: Try to delete a pet from the store already exist
    Given user has status and name
      | name   | status   |
      | <name> | <status> |
    And  the photo urls of "jhk" pet
    And user send post request with these valid data
    When send request to delete that pet with validId
    And status code is "200"
    Examples:
      | name | status    |
      | Dog  | available |

  Scenario: Try to delete a new pet from the store already exist with invalid ID
    When send request to delete that pet with invalidId
    And status code is "404"
