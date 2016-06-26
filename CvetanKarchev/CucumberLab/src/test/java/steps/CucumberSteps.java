package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.PageObjects;

public class CucumberSteps {

    public PageObjects pageObjects;

    @Before
    public void buildDriver() {
        pageObjects = new PageObjects();
    }

    @After
    public void destroyDriver() {
        pageObjects.close();
    }

    @Given("^user account login in jira$")
    public void user_account_login_in_jira() throws Throwable {
        pageObjects.login();
    }

    @When("^the user logout from jira$")
    public void the_user_logout_from_jira()  {

    }

    @Then("^the user successfully logout from jira$")
    public void the_user_successfully_jira() throws Throwable {

    }


    @When("^go to Add issue$")
    public void go_to_Add_issue() throws Throwable {

    }

    @Then("^add issue with (.*), (.*) and (.*)$")
    public void add_issue_with_Test_test_and_test(String tittle,String env,String description) throws Throwable {

    }

    @Then("^verify that the issue is created successfully$")
    public void verify_that_credits_charged_with_money_euro() throws Throwable {

    }



}
