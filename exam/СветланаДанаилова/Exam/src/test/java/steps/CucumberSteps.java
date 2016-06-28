package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import pageobjects.PageObjects;

import java.io.IOException;


public class CucumberSteps {

    public PageObjects pageObjects;

    @Before
    public void buildDriver(){
        pageObjects = new PageObjects();
    }

    @After
    public void destroyDriver() {
        pageObjects.close();
    }

    @Given("^user with access to Jenkins$")

    public void user_with_access_to_Jenkins() throws Throwable {
        pageObjects.credentials("ceco", "ceco");

    }

    @When("^login in Jenkins$")
    public void login_in_Jenkins() throws Throwable{
        pageObjects.getLoginButton().click();


    }
    @Then("^logout from Jenkins$")
    public void logout_from_Jenkins(){
        pageObjects.logout();

    }
    @Given("^user with access to Jenkinss$")

    public void user_with_access_to_Jenkinss() throws Throwable {
        pageObjects.credentials("ceco", "ceco");

    }

    @When("^login in Jenkinss$")
    public void login_in_Jenkinss() throws Throwable{
        pageObjects.getLoginButton().click();


    }


    @And("^create new build job and configure it$")
    public void create_new_build_job() throws  Throwable{
        pageObjects.newJob("ExxxamQA");
        pageObjects.configure("This is an exam", "https://github.com/shtraker/automation.qa.course.04.2016", "0", "1024x768x24", "1");
        Thread.sleep(10000);
        pageObjects.Build( "cd exam/SvetlanaDanailova/Exam && mvn clean test");
    }

    @Then("^make the build$")
    public void make_the_build(){
        pageObjects.logout();

    }



}
