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
    public void destroyDriver() throws IOException {
        File scrFile =
                ((TakesScreenshot)pageObjects.getWebDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("E:\\IT academy\\homework14\\Screenshots\\screenshots.png"));
        pageObjects.close();
    }

    @Given("^user account login in jira$")
    public void user_account_login_in_jira() throws Throwable {
        pageObjects.login("hristoqatest@abv.bg","qwerty123456");



    }

    @When("^the user logout from jira$")
    public void the_user_logout_from_jira()  {
        pageObjects.logout();

    }

    @Then("^the user successfully logout from jira$")
    public void the_user_successfully_jira() throws Throwable {
        assertEquals("Welcome to jira.atlassian.com",pageObjects.findElementBy(By.cssSelector("#gadget-11760 > div > b")).getText());
        assertEquals("https://jira.atlassian.com/secure/Dashboard.jspa",pageObjects.getWebDriver().getCurrentUrl());

    }


    @When("^go to Add issue$")
    public void go_to_Add_issue() throws Throwable
    {
        pageObjects.Bugbutton();
    }

    @Then("^add issue with (.*), (.*) and (.*)$")
    public void add_issue_with_Test_test_and_test(String tittle,String env,String description) throws Throwable {
        pageObjects.createbug(tittle,env,description);
        Thread.sleep(5000);
    }





}
