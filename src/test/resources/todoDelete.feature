Feature: Delete Todo
  Scenario: Delete single Todo
    Given I open the app
    When I create Todo task
    And I click the created Todo
    And I click on delete
    Then Todo should not exist
