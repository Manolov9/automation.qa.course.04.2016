Feature: Jenkis functionality

#@complete
Scenario: Log in and log out from Jenkins
Given user with access to Jenkins
When login in Jenkins
Then logout from Jenkins
