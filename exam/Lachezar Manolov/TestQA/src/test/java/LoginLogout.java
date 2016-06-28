import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginLogout {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://192.168.0.106:8080/";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Given("^user account login in Jenkins$")
    public void user_account_login_in_Jenkins() throws Exception {
        driver.get(baseUrl + "/login?from=%2F");
        driver.findElement(By.id("j_username")).clear();
        driver.findElement(By.id("j_username")).sendKeys("ceco");
        driver.findElement(By.name("j_password")).clear();
        driver.findElement(By.name("j_password")).sendKeys("ceco");}

        @When("^the user logout from Jenkins$")
        public void the_user_logout_from_Jenkins ()  throws Exception {
        driver.findElement(By.id("yui-gen1-button")).click();
        assertEquals("log out", driver.findElement(By.xpath("//div[@id='header']/div[2]/span/a[2]/b")).getText());
        driver.findElement(By.xpath("//div[@id='header']/div[2]/span/a[2]/b")).click();
    }
    @Then("^the user successfully logout from Jenkins$")
    public void the_user_successfully_jira() throws Throwable {

    }
    @And("^create new build job and configure it$")
    public void create_new_build_job_and_configure_it() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("New Item")).click();
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("New");
        assertEquals("Freestyle project", driver.findElement(By.cssSelector("li.hudson_model_FreeStyleProject > label")).getText());
        driver.findElement(By.cssSelector("div.desc")).click();
        assertTrue(isElementPresent(By.id("ok-button")));
        driver.findElement(By.id("ok-button")).click();
        driver.findElement(By.xpath("//div[@id='main-panel']/div/div/div/div[2]/div[3]/div/div")).click();
        driver.findElement(By.id("radio-block-1")).click();
        driver.findElement(By.name("_.url")).clear();
        driver.findElement(By.name("_.url")).sendKeys("https://github.com/shtraker/automation.qa.course.04.2016");
        driver.findElement(By.id("cb22")).click();
        driver.findElement(By.id("yui-gen19-button")).click();
        driver.findElement(By.linkText("Execute shell")).click();
        driver.findElement(By.cssSelector("div > textarea")).clear();
        driver.findElement(By.cssSelector("div > textarea")).sendKeys("/Lachezar Manolov/target");
        driver.findElement(By.id("yui-gen21-button")).click();
        driver.findElement(By.linkText("Cucumber-JVM reports")).click();
        driver.findElement(By.id("yui-gen65-button")).click();
        driver.findElement(By.name("_.jsonReportDirectory")).clear();
        driver.findElement(By.name("_.jsonReportDirectory")).sendKeys("ss");
        assertEquals("Save", driver.findElement(By.id("yui-gen38-button")).getText());
        driver.findElement(By.id("yui-gen38-button")).click();}

    @Then("^make the build$")
    public void make_the_build() throws Exception {
    driver.findElement(By.linkText("Cucumber-JVM reports")).click();
}


    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }


    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
