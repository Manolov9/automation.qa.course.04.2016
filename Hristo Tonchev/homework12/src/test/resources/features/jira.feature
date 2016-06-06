Feature: Login and creating a bug functionality
  As a user i want to login in jira and create bugs.

  @complete
  Scenario:  Login with user and create bug
    Given : User account login in jira
    When : The user creates a bug
    Then : User account Logout in jira
    Then : The user successfully logout from jira

