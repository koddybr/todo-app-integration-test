Feature: Search Todo
  Scenario: Search a Todo
    Given Go to the app
    When I create three Todos
    And I press searcher button
    And I write target text
    Then The task Should exist