package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.security.util.PendingException;

/**
 * Created by Vesela on 4.6.2016 г..
 */
public class CucamberSteps {







    public WebDriver driver;

    @Before
    public void buildDriver() {
        driver = new FirefoxDriver();
        driver.get("https://divdedov.atlassian.net/secure/RapidBoard.jspa?rapidView=1&projectKey=DV");
    }

    @After
    public void destroyDriver() {
        driver.quit();
    }





    @Given("^user account login in jira$")
    public void user_account_login_in_jira() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();

        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.clear();
        usernameField.sendKeys("a_marino@abv.bg");
        passwordField.clear();

        passwordField.sendKeys("random");
        driver.findElement(By.id("login")).click();


    }

    @When("^the user logout from jira$")
    public void the_user_logout_from_jira() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^the user successfully logout from jira$")
    public void the_user_successfully_logout_from_jira() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }



}
