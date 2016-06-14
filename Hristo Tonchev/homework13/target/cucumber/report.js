$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddIssue.feature");
formatter.feature({
  "line": 1,
  "name": "Adding an issue in Jira",
  "description": "",
  "id": "adding-an-issue-in-jira",
  "keyword": "Feature"
});
formatter.before({
  "duration": 28026541511,
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
  "duration": 12139039806,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.go_to_Add_issue()"
});
formatter.result({
  "duration": 1429236078,
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
  "duration": 16784604174,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.the_user_logout_from_jira()"
});
formatter.result({
  "duration": 2773305620,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.the_user_successfully_jira()"
});
formatter.result({
  "duration": 4320250651,
  "status": "passed"
});
formatter.after({
  "duration": 1078242451,
  "status": "passed"
});
formatter.before({
  "duration": 17832661760,
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
  "duration": 12019691710,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.go_to_Add_issue()"
});
formatter.result({
  "duration": 1438173172,
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
  "duration": 13687008202,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.the_user_logout_from_jira()"
});
formatter.result({
  "duration": 2786619626,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.the_user_successfully_jira()"
});
formatter.result({
  "duration": 4109103207,
  "status": "passed"
});
formatter.after({
  "duration": 899403819,
  "status": "passed"
});
});