$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Logout.feature");
formatter.feature({
  "line": 1,
  "name": "Logout functionality",
  "description": "As a user I want be able to login and logout from the platform.",
  "id": "logout-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7349421580,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login with user and logout",
  "description": "",
  "id": "logout-functionality;login-with-user-and-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@complete"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user account login in jira",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user logout from jira",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user successfully logout from jira",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberSteps.user_account_login_in_jira()"
});
formatter.result({
  "duration": 10067543212,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.the_user_logout_from_jira()"
});
formatter.result({
  "duration": 34897,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.the_user_successfully_jira()"
});
formatter.result({
  "duration": 28328,
  "status": "passed"
});
formatter.after({
  "duration": 1312116395,
  "status": "passed"
});
});