@scrollBars
Feature: Scrolling an element into view may be a tricky task


  Scenario: Scrolling an element into view may be a tricky task
    Given  User in the home age of "uitestingplayground"
    And  click on the ScrollBar section
    When Update scrollTop and scrollRight automatically of the hidden area.
    Then the button is visible now

