package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pageobjects.PageObjects;

import java.io.File;
import java.io.IOException;

import static junit.framework.Assert.assertEquals;

public class CucumberSteps {

    public PageObjects pageObjects;

    @Before
    public void buildDriver() {
        pageObjects = new PageObjects();

    }

    @After
    public void destroyDriver()  {
       /* File scrFile =
                ((TakesScreenshot)pageObjects.getWebDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("E:\\IT academy\\homework14\\Screenshots\\screenshots.png"));*/
        pageObjects.close();
    }

    @Given("^user with access to Jenkins$")
    public void user_account_login_in_jira() throws Throwable {

    }

    @When("^login in Jenkins$")
    public void the_user_logout_from_jira()  {
        pageObjects.login("ceco","ceco");


    }

    @Then("^logout from Jenkins$")
    public void the_user_successfully_jira() throws Throwable {
        pageObjects.logout();

        assertEquals("http://192.168.0.107:8080/login?from=%2F",pageObjects.getWebDriver().getCurrentUrl());

    }


    @When("^create new build job and configure it$")
    public void go_to_Add_issue() throws Throwable
    {
        pageObjects.Createjob();
        pageObjects.CreateNewfreeProject();
        pageObjects.defineProject();
    }

    @Then("make the build$")
    public void add_issue_with_Test_test_and_test() throws Throwable {
        pageObjects.FinalRunProject();
    }





}
