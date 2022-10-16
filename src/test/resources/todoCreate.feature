Feature: Create Todo
  Scenario: Create single Todo
    Given I open the application
    When I press create button
    And Fill creation data
    And Save the Todo
    Then todo should be created

  Scenario: Cancel Create Todo
    Given I open application
    When I press to create button
    And Fill data
    And I cancel the Todo
    Then Title Todo should not be created
    And Note should not be created too