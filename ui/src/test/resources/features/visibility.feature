@visibility
Feature: Checking if element is visible on screen may be a non trivial task

  Scenario Outline:test that clicks hide button and then check visibility of visibility button
    Given User in the home age of "uitestingplayground"
    And   click on the "<Visibility>" section
    When  click on hide button
    Then  the visibility button not displayed
    Examples:
      | Visibility |
      | Visibility |