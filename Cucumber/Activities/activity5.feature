@activity5

Feature: Data driven test with Example

//@SmokeTest
  Scenario Outline: Testing login with Example
    Given User is on Login page
    When User enters "<Usernames>" and "<Passwords>"
    Then Read the page title and confirmation message
    And Close the Browser
    
Examples:
    | Usernames | Passwords |
    | admin     | password  |
    | adminUser | Password  |