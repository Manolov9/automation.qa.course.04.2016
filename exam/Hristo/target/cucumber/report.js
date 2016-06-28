$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LoginLogoutJenkis.feature");
formatter.feature({
  "line": 1,
  "name": "Jenkis functionality",
  "description": "",
  "id": "jenkis-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5923371767,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Log in and log out from Jenkins",
  "description": "",
  "id": "jenkis-functionality;log-in-and-log-out-from-jenkins",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@complete"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user with access to Jenkins",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "login in Jenkins",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "logout from Jenkins",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberSteps.user_account_login_in_jira()"
});
formatter.result({
  "duration": 179973912,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.the_user_logout_from_jira()"
});
formatter.result({
  "duration": 2111333204,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.the_user_successfully_jira()"
});
formatter.result({
  "duration": 819962067,
  "status": "passed"
});
formatter.after({
  "duration": 1140626657,
  "status": "passed"
});
});