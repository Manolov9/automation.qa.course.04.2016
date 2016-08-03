$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddIssue.feature");
formatter.feature({
  "line": 1,
  "name": "Adding an issue in Jira",
  "description": "",
  "id": "adding-an-issue-in-jira",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 11,
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
  "name": "user aaaa account login in jiraaaa",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "go to Add issue \"imalo edno vreme\" bla bla",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "add issue with Test, test and test",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "verify that the issue is created successfully",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "aaaa",
      "offset": 5
    }
  ],
  "location": "CucumberSteps2.user_aaaa_account_login_in_jiraaaa(String)"
});
formatter.result({
  "duration": 11403577017,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "imalo edno vreme",
      "offset": 17
    }
  ],
  "location": "CucumberSteps2.go_to_Add_issue_bla_bla(String)"
});
formatter.result({
  "duration": 71024,
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
  "location": "CucumberSteps1.add_issue_with_Test_test_and_test(String,String,String)"
});
formatter.result({
  "duration": 80057,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps1.verify_that_credits_charged_with_money_euro()"
});
formatter.result({
  "duration": 5357313263,
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
  "location": "CucumberSteps1.user_account_login_in_jira()"
});
formatter.result({
  "duration": 10788293900,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps2.the_user_logout_from_jira()"
});
formatter.result({
  "duration": 5293508467,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps1.the_user_successfully_jira()"
});
formatter.result({
  "duration": 126038,
  "status": "passed"
});
});