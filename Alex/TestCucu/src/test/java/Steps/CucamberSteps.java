package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import org.openqa.selenium.remote.DesiredCapabilities;
import sun.security.util.PendingException;

/**
 * Created by Vesela on 4.6.2016 г..
 */
public class CucamberSteps {







    public WebDriver driver;

    @Before
    public void buildDriver() {

        System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://divdedov.atlassian.net/secure/RapidBoard.jspa?rapidView=1&projectKey=DV");
    }

    @After
    public void destroyDriver() {
        driver.quit();
    }





    @Given("^user account login in jira and gets greatings on  jira home page$")
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
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"logo\"]/a")).click();
        assertEquals("https://divdedov.atlassian.net/secure/Dashboard.jspa",driver.getCurrentUrl());
        assertEquals("Welcome to JIRA",driver.findElement(By.cssSelector("#gadget-10000 > div > div > h3")).getText());


    }

    @When("^user creats a bug$")
    public void user_creats_a_bug() throws Throwable {

        WebElement createIssueButton = driver.findElement(By.xpath("//*[@id=\"create_link\"]"));
        createIssueButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"summary\"]")).sendKeys("testIssue");
        driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("This is test , Big Test");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"create-issue-submit\"]")).click();
        Thread.sleep(5000);




    }


//    @When("^the user logout gets greeatings on  jira home page$")
//    public void the_user_logout_from_jira() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        //throw new PendingException();





    //}

    @Then("^the user successfully logout from jira$")
    public void the_user_successfully_logout_from_jira() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.id("header-details-user-fullname")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("log_out")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals("Please confirm that you want to log out",driver.findElement(By.id("confirm-logout")).getText());
        driver.findElement(By.id("logout")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        assertEquals("You are logged out of this Atlassian Cloud instance.",driver.findElement(By.id("logged-out")).getText());
        driver.quit();


    }



}
