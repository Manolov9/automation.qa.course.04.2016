$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddIssue.feature");
formatter.feature({
  "line": 1,
  "name": "Adding an issue in Jira",
  "description": "",
  "id": "adding-an-issue-in-jira",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18546286735,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Add issue in jira",
  "description": "",
  "id": "adding-an-issue-in-jira;add-issue-in-jira;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@complete"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user account login in jira",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "go to Add issue",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "add issue with Test, test and test",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the user logout from jira",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user successfully logout from jira",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberSteps.user_account_login_in_jira()"
});
formatter.result({
  "duration": 12037566385,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.go_to_Add_issue()"
});
formatter.result({
  "duration": 1478989009,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 15
    },
    {
      "val": "test",
      "offset": 21
    },
    {
      "val": "test",
      "offset": 30
    }
  ],
  "location": "CucumberSteps.add_issue_with_Test_test_and_test(String,String,String)"
});
formatter.result({
  "duration": 13490143394,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.the_user_logout_from_jira()"
});
formatter.result({
  "duration": 2767816885,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.the_user_successfully_jira()"
});
formatter.result({
  "duration": 4322869664,
  "status": "passed"
});
formatter.after({
  "duration": 1379554988,
  "status": "passed"
});
formatter.before({
  "duration": 18058521907,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Add issue in jira",
  "description": "",
  "id": "adding-an-issue-in-jira;add-issue-in-jira;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@complete"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user account login in jira",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "go to Add issue",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "add issue with Gosho, Gosho and Gosho",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the user logout from jira",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user successfully logout from jira",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberSteps.user_account_login_in_jira()"
});
formatter.result({
  "duration": 11278176866,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.go_to_Add_issue()"
});
formatter.result({
  "duration": 1453802211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gosho",
      "offset": 15
    },
    {
      "val": "Gosho",
      "offset": 22
    },
    {
      "val": "Gosho",
      "offset": 32
    }
  ],
  "location": "CucumberSteps.add_issue_with_Test_test_and_test(String,String,String)"
});
formatter.result({
  "duration": 13546846311,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.the_user_logout_from_jira()"
});
formatter.result({
  "duration": 2776725144,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.the_user_successfully_jira()"
});
formatter.result({
  "duration": 4104297204,
  "status": "passed"
});
formatter.after({
  "duration": 1252050762,
  "status": "passed"
});
formatter.uri("features/Logout.feature");
formatter.feature({
  "line": 1,
  "name": "Logout functionality",
  "description": "As a user I want be able to login and logout from the platform.",
  "id": "logout-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15794088626,
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
  "duration": 14046248860,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.the_user_logout_from_jira()"
});
formatter.result({
  "duration": 2761172344,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.the_user_successfully_jira()"
});
formatter.result({
  "duration": 4321960169,
  "status": "passed"
});
formatter.after({
  "duration": 1118440068,
  "status": "passed"
});
});