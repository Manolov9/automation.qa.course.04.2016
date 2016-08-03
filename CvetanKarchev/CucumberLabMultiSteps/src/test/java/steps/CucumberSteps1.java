package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.PageObjects;
import pageobjects.PageObjects2;

public class CucumberSteps1 {

    public PageObjects pageObjects = new PageObjects();
    public PageObjects2 pageObjects2 = new PageObjects2();

    public void destroyDriver() {
        pageObjects.close();
    }

    @Given("^user account login in jira$")
    public void user_account_login_in_jira() throws Throwable {
        //pageObjects = new PageObjects();
        pageObjects.buildDriver();
        pageObjects.login("hristoqatest@abv.bg","qwerty123456");
    }

    @Then("^the user successfully logout from jira$")
    public void the_user_successfully_jira() throws Throwable {
        pageObjects.close();
    }


    @When("^go to Add issue$")
    public void go_to_Add_issue() throws Throwable {

    }

    @Then("^add issue with (.*), (.*) and (.*)$")
    public void add_issue_with_Test_test_and_test(String tittle,String env,String description) throws Throwable {

    }

    @Then("^verify that the issue is created successfully$")
    public void verify_that_credits_charged_with_money_euro() throws Throwable {
        //here i use pageobjects from the second class
        pageObjects2.createBugButon().click();
        pageObjects2.cancelButton().click();
        Thread.sleep(2000); // this is to wait until it's closed, it's stupid way to do it.

        //here i use pageobjects from the first class
        pageObjects.logout();

        destroyDriver();
    }
}
