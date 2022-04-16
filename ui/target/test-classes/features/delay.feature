@delay
Feature: User try to handle most types of delay from ajax, load and client side delays

  Scenario Outline: "try to handle elements may appear on a page after loading data with ajax or client-side time consuming"
    Given User in the home age of "uitestingplayground"
    And  click on the "<delay type>" section
    When click on "<delay type>" Button
    Then the message of "<hidden message>" "<delay type>" is appeared after 15

    Examples:
      | delay type        | hidden message                      |
      | ajax delay        | Data loaded with AJAX get request.  |
      | Client Side Delay | Data calculated on the client side. |

  Scenario: Ensure that a test is capable of waiting for a page to load
    Given User in the home age of "uitestingplayground"
    When  click on the "load delay" section
    Then the page has been loaded