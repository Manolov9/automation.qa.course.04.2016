import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ico on 6/2/2016.
 */
public class JiraTest {
    private WebDriver driver;

    @Before
    public void setUp()
    {
        driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void login_bug_close() throws InterruptedException {
        driver.get("https://jira.atlassian.com/secure/Dashboard.jspa");

      WebElement login= driver.findElement(By.partialLinkText("Log In"));
        login.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("hristoqatest@abv.bg");
        WebElement password=driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("qwerty123456");
        WebElement loginSubmit=driver.findElement(By.id("login-submit"));
        loginSubmit.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement create=driver.findElement(By.id("create_link"));
        create.click();
        WebElement project =driver.findElement(By.id("project-field"));
        project.sendKeys("A Test Project (TST)");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement issuetype=driver.findElement(By.id("issuetype-field"));
        issuetype.sendKeys("Bug");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement summary=driver.findElement(By.id("summary"));
        summary.sendKeys("Random text");
        WebElement duedate=driver.findElement(By.id("duedate"));
        duedate.sendKeys("03/june/2016");
        WebElement components =driver.findElement(By.id("components-textarea"));
        components.sendKeys("Component 1");
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

        driver.quit();
    }
    @After
    public void dontKnowYet()
    {

    }

}
