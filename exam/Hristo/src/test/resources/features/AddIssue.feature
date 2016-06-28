Feature: Create Issue in jenkis

  @complete
  Scenario: Create a job in Jenkins
    Given user with access to Jenkins
    When login in Jenkins
    When create new build job and configure it
    Then make the build


