@DeletePurchase
Feature: Delete purchase by order Id

  Scenario Outline: Try to delete a created order
    Given user has valid data to store a pet
      | id   | petId   | quantity   | shipDate   | status   | complete   |
      | <id> | <petId> | <quantity> | <shipDate> | <status> | <complete> |
    And send a post request with the valid body
    And status code is "200"
    When user sends a delete request to the system with the valid OrderId witch has been created
    Then status code is "200"
    Examples:
      | id | petId | quantity | shipDate                 | status | complete |
      | 0  | 0     | 0        | 2022-04-14T13:35:33.894Z | placed | true     |