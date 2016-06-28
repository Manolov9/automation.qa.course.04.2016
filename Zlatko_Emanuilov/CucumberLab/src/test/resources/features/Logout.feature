Feature: Logout functionality
  As a user I want be able to login and logout from the platform.

  @complete
  Scenario: Login with user and logout
    Given user account login in jenkins
    When the user logout from jenkins
    Then the user successfully logout from jenkins

