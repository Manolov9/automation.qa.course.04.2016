Feature: Logout functionality
  As a user I want be able to login and logout from the platform.

  @complete
  Scenario: Login with user and logout
    Given user account login in jira and gets greatings on  jira home page
#    And User Creats a bug
    When user creats a bug
    Then the user successfully logout from jira