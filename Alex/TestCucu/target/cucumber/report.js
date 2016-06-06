$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Logout.feature");
formatter.feature({
  "line": 1,
  "name": "Logout functionality",
  "description": "As a user I want be able to login and logout from the platform.",
  "id": "logout-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9629830359,
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
  "name": "user account login in jira and gets greatings on  jira home page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#    And User Creats a bug"
    }
  ],
  "line": 8,
  "name": "user creats a bug",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user successfully logout from jira",
  "keyword": "Then "
});
formatter.match({
  "location": "CucamberSteps.user_account_login_in_jira()"
});
formatter.result({
  "duration": 9924822677,
  "status": "passed"
});
formatter.match({
  "location": "CucamberSteps.user_creats_a_bug()"
});
formatter.result({
  "duration": 10758550062,
  "status": "passed"
});
formatter.match({
  "location": "CucamberSteps.the_user_successfully_logout_from_jira()"
});
formatter.result({
  "duration": 2335406967,
  "status": "passed"
});
formatter.after({
  "duration": 131370,
  "status": "passed"
});
});