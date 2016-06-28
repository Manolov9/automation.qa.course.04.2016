Feature: Adding an issue in Jira

  @complete
  Scenario Outline: Add issue in jira
    Given user <type> account login in jiraaaa
    When go to Add issue "imalo edno vreme" bla bla
    Then add issue with <tittle>, <env> and <description>
    And verify that the issue is created successfully
    Examples:
      | type | tittle  | env  | description |
      |aaaa | Test    | test | test        |
