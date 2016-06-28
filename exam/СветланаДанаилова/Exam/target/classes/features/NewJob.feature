Feature: Create a job in jenkins

  @complete
  Scenario: Create a job in Jenkinss
    Given user with access to Jenkinss
    When login in Jenkinss
    And create new build job and configure it
    Then make the build
