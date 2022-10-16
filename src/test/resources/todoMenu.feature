Feature: Menu Option
  Scenario: Open Menu
    Given Enter to the application
    When I press hamburger button
    And I press on create button
    Then Local Account text should not be displayed