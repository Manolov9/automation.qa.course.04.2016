package steps;

import cucumber.api.java.en.When;
import pageobjects.PageObjects;

/**
 * Created by Deni on 14.6.2016 г..
 */
public class CucumberSteps2 {

    public PageObjects pageObjects = new PageObjects();

    @When("^the user logout from jira$")
    public void the_user_logout_from_jira()  {
        pageObjects.logout();
    }
}
