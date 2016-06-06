package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static junit.framework.Assert.assertEquals;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ico on 6/6/2016.
 */
public class Steps {
    public WebDriver driver;

    @Before
    public void buildWebDriver() {
        driver = new FirefoxDriver();
    
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    @Given("^: User account login in jira$")
    public void user_account_login_in_jira() throws Throwable {
        driver.get("https://jira.atlassian.com/secure/Dashboard.jspa");
        WebElement login= driver.findElement(By.partialLinkText("Log In"));
        login.click();
        WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("hristoqatest@abv.bg");
        WebElement password=driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("qwerty123456");
        WebElement loginSubmit=driver.findElement(By.id("login-submit"));
        loginSubmit.click();




        //throw new PendingException();
    }

    @When("^: The user creates a bug$")
    public void the_user_creates_a_bug() throws Throwable {
        WebElement create=driver.findElement(By.id("create_link"));
        create.click();
        WebElement project =driver.findElement(By.id("project-field"));
        project.sendKeys("A Test Project (TST)");
        WebElement issuetype=driver.findElement(By.id("issuetype-field"));
        issuetype.sendKeys("Bug");
        Thread.sleep(1000);
        WebElement summary=driver.findElement(By.id("summary"));
        summary.sendKeys("Random text");
        WebElement duedate=driver.findElement(By.id("duedate"));
        duedate.sendKeys("03/june/2016");
        WebElement environment=driver.findElement(By.id("environment"));
        environment.sendKeys("gosho");
        WebElement description=driver.findElement(By.id("description"));
        description.sendKeys("random text");
        WebElement customfield_10041=driver.findElement(By.id("customfield_10041"));
        customfield_10041.sendKeys("03/june/2016");
        WebElement customfield_10530=driver.findElement(By.id("customfield_10530"));
        customfield_10530.sendKeys("icko");
        WebElement isssue_submit=driver.findElement(By.id("create-issue-submit"));
        isssue_submit.click();
        Thread.sleep(5000);
       // throw new PendingException();
    }

    @Then("^: User account Logout in jira$")
    public void User_account_Logout_in_jira() throws Throwable {
        WebElement logout = driver.findElement(By.id("header-details-user-fullname"));
        logout.click();
        WebElement finallogout=driver.findElement(By.id("log_out"));
        finallogout.click();
        // throw new PendingException();
    }


    @Then("^: The user successfully logout from jira$")
    public void then_the_user_successfully_logout_from_jira() throws Throwable {

        assertEquals("https://jira.atlassian.com/secure/Dashboard.jspa",driver.getCurrentUrl());
       // throw new PendingException();
    }
    @After
    public void destroyDriver(){
        driver.quit();
    }


}

