$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/jira.feature");
formatter.feature({
  "line": 1,
  "name": "Login and creating a bug functionality",
  "description": "As a user i want to login in jira and create bugs.",
  "id": "login-and-creating-a-bug-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9004111601,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login with user and create bug",
  "description": "",
  "id": "login-and-creating-a-bug-functionality;login-with-user-and-create-bug",
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
  "name": ": User account login in jira",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": ": The user creates a bug",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": ": User account Logout in jira",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": ": The user successfully logout from jira",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_account_login_in_jira()"
});
formatter.result({
  "duration": 9447399158,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_user_creates_a_bug()"
});
formatter.result({
  "duration": 10250631138,
  "status": "passed"
});
formatter.match({
  "location": "Steps.User_account_Logout_in_jira()"
});
formatter.result({
  "duration": 246743871,
  "status": "passed"
});
formatter.match({
  "location": "Steps.then_the_user_successfully_logout_from_jira()"
});
formatter.result({
  "duration": 1779957345,
  "status": "passed"
});
formatter.after({
  "duration": 655530457,
  "status": "passed"
});
});