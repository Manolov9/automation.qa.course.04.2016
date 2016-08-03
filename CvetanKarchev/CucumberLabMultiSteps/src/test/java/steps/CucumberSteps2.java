package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageobjects.PageObjects;
import pageobjects.PageObjects2;

/**
 * Created by Deni on 14.6.2016 г..
 */
public class CucumberSteps2 {

    public PageObjects pageObjects = new PageObjects();
    public PageObjects2 pageObjects2 = new PageObjects2();

    public void destroyDriver() {
        pageObjects.close();
    }
    //this step is from one scenario and the rest steps are in other class
    @When("^the user logout from jira$")
    public void the_user_logout_from_jira() throws InterruptedException {

        //here i use pageobjects from the second class
        pageObjects2.createBugButon().click();
        pageObjects2.cancelButton().click();
        Thread.sleep(2000); // this is to wait until it's closed, it's stupid way to do it.

        //here i use pageobjects from the first class
        pageObjects.logout();

        destroyDriver();
    }

    @Given("^user (.*) account login in jiraaaa$")
    public void user_aaaa_account_login_in_jiraaaa(String type) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        pageObjects.buildDriver();
        pageObjects.login("hristoqatest@abv.bg","qwerty123456");
    }

    @When("^go to Add issue \"(.*?)\" bla bla$")
    public void go_to_Add_issue_bla_bla(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
}
