Feature: LogInLogOut functionality
  As a user I want be able to login and logout from the platform.

  @complete
  Scenario: Login with user and logout
    Given user account login in Jenkins
    When the user logout from Jenkins
    Then the user successfully logout from Jenkins