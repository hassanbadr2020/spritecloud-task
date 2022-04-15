@login
Feature: Demo application with dynamically generated element attributes

  Scenario Outline: Fill in and submit the form. For successful login
    Given User in the home age of "<urlText>"
    And click on the "<flag>" section
    And try to login with "valid" user name "<userName>" and password "<Password>"
    When click on the login button
    Then user has  logged in with "<welcome message>"
    Examples:
      | urlText             | flag       | userName | Password | welcome message   |
      | uitestingplayground | Sample App | anyUser  | pwd      | Welcome, anyUser! |

  Scenario Outline: Fill in and submit the form. For failed login
    Given User in the home age of "<urlText>"
    And click on the "<flag>" section
    And try to login with "invalid" user name "<userName>" and password "<Password>"
    When click on the login button
    Then user has not logged in with "<Error message>"
    Examples:
      | urlText             | flag       | userName | Password | Error message             |
      | uitestingplayground | Sample App |          | pwd      | Invalid username/password |
      | uitestingplayground | Sample App | anyUser  |          | Invalid username/password |
      | uitestingplayground | Sample App |          |          | Invalid username/password |
