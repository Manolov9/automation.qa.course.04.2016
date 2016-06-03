import jdk.internal.util.xml.impl.Input;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
/**
 * Created by Divdedov QA on 6/2/2016.
 */
public class Jira_logIn {

    private WebDriver driver;


    @Before
    public void setUp(){
        driver = new FirefoxDriver();

    }
    @Test
    public  void Test_Jira_log_IN(){
        driver.get("https://divdedov.atlassian.net/login?dest-url=%2Fsecure%2FRapidBoard.jspa%3FrapidView%3D1%26projectKey%3DDV");
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.clear();
        usernameField.sendKeys("a_marino@abv.bg");
        passwordField.clear();

        passwordField.sendKeys("random");
        driver.findElement(By.id("login")).click();
        assertEquals("https://divdedov.atlassian.net/secure/RapidBoard.jspa?rapidView=1&projectKey=DV",driver.getCurrentUrl());
        driver.findElement(By.xpath("//*[@id=\"logo\"]/a")).click();
        assertEquals("Welcome to JIRA",driver.findElement(By.cssSelector("#gadget-10000 > div > div > h3")).getText());
        WebElement createIssueButton = driver.findElement(By.xpath("//*[@id=\"create_link\"]"));
        createIssueButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"summary\"]")).sendKeys("testIssue");
        driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("This is test , Big Test");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"create-issue-submit\"]")).click();


        //driver.findElement(By.xpath("//*[@id=\"issuetype-single-select\"]/span")).click();
        //new Input(driver.findElement(By.id("issuetype-field"))).selectByVisibleText("Bug");
        //Select dropdown = new Select(driver.findElement(By.id("issuetype-field")));
        //assertEquals();

    }

    @After
    public void terDown() {

    }


}
