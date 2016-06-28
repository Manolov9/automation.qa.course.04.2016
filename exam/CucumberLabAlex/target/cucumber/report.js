$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/jobCreation.feature");
formatter.feature({
  "line": 1,
  "name": "Create a job in Jenkins",
  "description": "",
  "id": "create-a-job-in-jenkins",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6970645021,
  "status": "passed"
});
formatter.before({
  "duration": 4087289855,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Create a job in Jenkins",
  "description": "",
  "id": "create-a-job-in-jenkins;create-a-job-in-jenkins",
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
  "name": "user with access to Jenkins",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "login in Jenkinss",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "create new build job and configure it",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "make the build",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberSteps.user_account_login_in_jira()"
});
formatter.result({
  "duration": 122783905,
  "status": "passed"
});
formatter.match({
  "location": "jobCreationJ.logIn_J()"
});
formatter.result({
  "duration": 4132254843,
  "status": "passed"
});
formatter.match({
  "location": "jobCreationJ.job_creation()"
});
formatter.result({
  "duration": 29178671055,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element is not clickable at point (639, 288). Other element would receive the click: \u003ctd class\u003d\"setting-main\"\u003e...\u003c/td\u003e\n  (Session info: chrome\u003d51.0.2704.103)\n  (Driver info: chromedriver\u003d2.21.371459 (36d3d07f660ff2bc1bf28a75d1cdabed0983e7c4),platform\u003dWindows NT 6.3 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 58 milliseconds\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027PM-01\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.21.371459 (36d3d07f660ff2bc1bf28a75d1cdabed0983e7c4), userDataDir\u003dC:\\Users\\Vesela\\AppData\\Local\\Temp\\scoped_dir4444_31798}, takesHeapSnapshot\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d51.0.2704.103, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: a3867ca5180290b5defa27baaa1f6dfc\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:647)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:326)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat pageobjects.PageObjects.jobCreation(PageObjects.java:136)\r\n\tat steps.jobCreationJ.job_creation(jobCreationJ.java:42)\r\n\tat ✽.And create new build job and configure it(features/jobCreation.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "jobCreationJ.make_build()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1438040489,
  "status": "passed"
});
formatter.after({
  "duration": 1308547285,
  "status": "passed"
});
});