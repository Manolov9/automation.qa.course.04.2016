package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobjects.PageObjects;

public class CucumberSteps {

    public PageObjects pageObjects = new PageObjects();

    @Before
    public void buildDriver() {
//        pageObjects = new PageObjects();
    }

    @After
    public void destroyDriver() {
        pageObjects.close();
    }

    @Given("^user with access to Jenkins$")
    public void user_account_login_in_jira() throws Throwable {




    }



    @When("^login in Jenkins$")
    public void the_user_logout_from_jira() throws InterruptedException {
        pageObjects.logIn();




    }

    @Then("^logout from Jenkins$")
    public void the_user_successfully_jira() throws Throwable {
        pageObjects.logOut();



    }




}
