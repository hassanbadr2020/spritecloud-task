Feature: place an order for a pet

  Scenario Outline: User try place an order for a pet with valid data
    Given user has valid data to store a pet
      | id   | petId   | quantity   | shipDate   | status   | complete   |
      | <id> | <petId> | <quantity> | <shipDate> | <status> | <complete> |
    When send a post request with the valid body
    Then status code is "200"
    And the order has been stored successfully with status "placed"
    Examples:
      | id | petId | quantity | shipDate                 | status | complete |
      | 0  | 0     | 0        | 2022-04-14T13:35:33.894Z | placed | true     |