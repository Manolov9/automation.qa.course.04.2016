$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/NewJob.feature");
formatter.feature({
  "line": 1,
  "name": "Create a job in jenkins",
  "description": "",
  "id": "create-a-job-in-jenkins",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4113734051,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Create a job in Jenkinss",
  "description": "",
  "id": "create-a-job-in-jenkins;create-a-job-in-jenkinss",
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
  "name": "user with access to Jenkinss",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "login in Jenkinss",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "create new build job and configure it",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "make the build",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberSteps.user_with_access_to_Jenkinss()"
});
formatter.result({
  "duration": 4751517686,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.login_in_Jenkinss()"
});
formatter.result({
  "duration": 2167463069,
  "status": "passed"
});
formatter.match({
  "location": "CucumberSteps.create_new_build_job()"
});
