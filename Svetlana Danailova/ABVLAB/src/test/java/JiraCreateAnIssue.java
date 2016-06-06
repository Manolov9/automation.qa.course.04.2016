import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

public class JiraCreateAnIssue {
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

        WebElement createIssue = driver.findElement(By.id("create_link"));
        createIssue.click();

        WebElement summary = driver.findElement(By.id("summary"));
        summary.click();
        summary.sendKeys("Test");

        WebElement dropDownMenu = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/form/div[1]/div[2]/div[3]/div/span"));
        dropDownMenu.click();

        WebElement priority = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/form/div[1]/div[2]/div[3]/div/input"));
        priority.click();

        WebElement description = driver.findElement(By.id("description"));
        description.clear();
        description.click();
        description.sendKeys("Test");

        WebElement create = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/form/div[2]/div/input"));
        create.click();





    }

    @After
    public void tearDown() {
        //driver.quit();

    }
}
