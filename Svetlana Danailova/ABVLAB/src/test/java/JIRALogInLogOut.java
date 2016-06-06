import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

public class JIRALogInLogOut {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test
    public void Jira_test() {
        String email = "sveti.danailova@gmail.com";
        String password = "lastkiss";


        driver.get("https://jira.atlassian.com/secure/Dashboard.jspa");

        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/header/nav/div/div[3]/ul/li[3]/a"));
        loginButton.click();

        WebElement emailField = driver.findElement(By.id("username"));
        emailField.click();
        emailField.clear();
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);

        WebElement logInSubmit = driver.findElement(By.id("login-submit"));
        logInSubmit.click();

        WebElement profile = driver.findElement(By.xpath("/html/body/div/header/nav/div/div[3]/ul/li[3]/a"));
        profile.click();

        WebElement viewProfile = driver.findElement(By.id("view_profile"));
        viewProfile.click();

        assertEquals("https://jira.atlassian.com/secure/ViewProfile.jspa", driver.getCurrentUrl());

        WebElement userName = driver.findElement(By.xpath("/html/body/div[1]/section/header/div/div[2]/h1/span"));
        assertEquals("Svetlana Danailova", userName.getText());

        WebElement profile1 = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[3]/ul/li[3]/a"));

        profile1.click();

        WebElement logOut = driver.findElement(By.id("log_out"));
        logOut.click();


    }
    @After
    public void tearDown(){
       driver.quit();

    }
}
