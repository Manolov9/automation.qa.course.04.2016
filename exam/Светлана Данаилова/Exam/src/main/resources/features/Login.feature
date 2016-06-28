Feature: Login and Logout functionality
  As an user i want to be able to login and logout from abv

  @complete
  Scenario: Login with user and logout
    Given User account login in abv
    When User logout from abv
    Then User successfully logout from abv