Feature: iLearn Login
  Scenario: Sign in present
    Given launch chrome browser
    When open iLearn webpage
    Then verify sign in button
    And close browser