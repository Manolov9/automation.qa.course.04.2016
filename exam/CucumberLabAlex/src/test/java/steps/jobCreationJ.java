package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobjects.PageObjects;

/**
 * Created by Vesela on 28.6.2016 г..
 */
public class jobCreationJ {

    public PageObjects pageObjects = new PageObjects();

    @Before
    public void buildDriver() {
//        pageObjects = new PageObjects();
    }

    @After
    public void destroyDriver() {
        pageObjects.close();
    }

    @Given("^user with access to Jenkinss$")
    public void user_account_access() throws Throwable {

    }


    @When("^login in Jenkinss$")
    public void logIn_J() throws Throwable {
        pageObjects.logIn();
    }

    @And("^create new build job and configure it$")
    public void job_creation() throws Throwable {
        pageObjects.jobCreation();


    }


    @Then("^make the build$")
    public void make_build() throws Throwable {


    }
}