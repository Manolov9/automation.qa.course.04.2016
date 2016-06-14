Feature: Adding an issue in Jira

  @complete
  Scenario Outline: Add issue in jira
    Given user account login in jira
    When go to Add issue
    Then add issue with <tittle>, <env> and <description>
    When the user logout from jira
    Then the user successfully logout from jira
   Examples:
      | tittle  | env  | description |
      | Test    | test | test        |
      | Gosho    | Gosho | Gosho        |
