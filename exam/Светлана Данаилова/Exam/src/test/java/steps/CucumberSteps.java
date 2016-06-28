package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pageobjects.PageObjects;
import static junit.framework.Assert.assertEquals;

import java.io.File;
import java.io.IOException;


public class CucumberSteps {

    public PageObjects pageObjects;

    @Before
    public void buildDriver(){
        pageObjects = new PageObjects();
    }

    @After
    public void destroyDriver() throws IOException {
        //File scrFile =
               // ((TakesScreenshot)pageObjects.getWebDriver()).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile, new File("D:\\Automation\\screenshots.png"));
        pageObjects.close();
    }

    @Given("^User account login in abv$")

    public void user_account_login_in_abv() throws Throwable {
        pageObjects.login("sveti.danailova@abv.bg", "love66");
        assertEquals("Здравейте, Светлана Данаилова",  pageObjects.findElementBy(By.xpath(".//*[@id='middlePagePanel']/div[1]")).getText());

    }

    @When("^User logout from abv$")
    public void user_logout_from_abv() throws Throwable{
        pageObjects.logout();

    }
    @Then("^User successfully logout from abv$")
    public void user_successfully_logout_from_abv() throws Throwable{
        Thread.sleep(5000);
        assertEquals("http://www.gbg.bg/?a", pageObjects.getWebDriver().getCurrentUrl());
    }

    @Given("^User is login in abv$")
    public  void user_is_login_in_abv() throws Throwable {
        pageObjects.login("sveti.danailova@abv.bg", "love66");
    }

    @When("^User creates an email$")
    public void user_creates_an_email() throws Throwable {
        pageObjects.writeEmail("svetlana.danailova@d-consult.net", "Hi", "Hi");

    }
    @And("^User sends an email$")
    public void user_sends_an_email() throws Throwable {
        pageObjects.sendEmail();
    }
    @Then("^The email is successfully send$")
    public  void the_email_is_successfully_send() throws Throwable
    {

    }
}
