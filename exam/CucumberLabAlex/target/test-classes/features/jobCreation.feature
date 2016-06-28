Feature: Create a job in Jenkins


  @complete
  Scenario: Create a job in Jenkins
    Given user with access to Jenkins
    When login in Jenkinss
    And create new build job and configure it
    Then make the build


