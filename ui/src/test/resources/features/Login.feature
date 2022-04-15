Feature: Demo application with dynamically generated element attributes

  Scenario Outline: Fill in and submit the form. For successful login
    Given User in the home age of "<urlText>"
    And click on the "<flag>" section
    And try to login with valid user name "<userName>" and password "<Password>"
    When click on the login button
    Then user has been logged in successfully with "<welcome message>"
    Examples:
      | urlText             | flag       | userName | Password | welcome message   |
      | uitestingplayground | Sample App | anyUser  | pwd      | Welcome, anyUser! |

