Feature: Feature Jenkis functionality

  @complete
  Scenario: Log in and log out from Jenkinss
    Given user with access to Jenkinss
    When login in Jenkinss
    Then logout from Jenkinss