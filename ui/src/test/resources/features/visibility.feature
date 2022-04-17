Feature: Checking if element is visible on screen may be a non trivial task

  Scenario Outline:test that clicks Start button and then waits for the progress bar to reach 75%
    Given User in the home age of "uitestingplayground"
    And   click on the "<Visibility>" section
    When  click on hide button
    Then  the visibility button not displayed
    Examples:
      | Visibility |
      | Visibility |