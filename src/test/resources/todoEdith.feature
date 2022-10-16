Feature: Edith Todo
  Scenario: Edith single Todo
    Given I open the application Todo
    When I create the Todo
    And I select the note created
    And I edith the note
    And I save the form
    Then The firs title should not exist
    And The edited Todo Should exist