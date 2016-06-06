import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

public class GitHubFail {
    private WebDriver driver;


    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @Test
    public void TestGitHub_Login_TestFail() {
        try {
            driver.get("https://github.com/");
            String validUsername = "SvetlanaDanailova";
            String validPassword = "lastkiss";

            WebElement signInButton = driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]"));
            signInButton.click();

            WebElement usernameField = driver.findElement(By.id("login_field"));
            WebElement passwordField = driver.findElement(By.id("password"));

            usernameField.clear();
            usernameField.sendKeys(validUsername);

            passwordField.clear();
            passwordField.sendKeys(validPassword);

            WebElement loginButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/form/div[4]/input[3]"));
            loginButton.click();


        } catch( IndexOutOfBoundsException e ) {
            assertEquals("Incorrect username or password.", e.getMessage());


        }
    }

    @After
    public void tearDown(){
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys("Lastkiss1759");
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/form/div[4]/input[3]"));
        loginButton.click();


        WebElement repo = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div/div[2]/div[3]/div[2]/ul/li[5]/a/span/span"));
        repo.click();


        WebElement issueButton = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/nav/span[2]/a/span[1]"));
        issueButton.click();

        WebElement newIssueButton = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[1]/div/div[1]/a"));
        newIssueButton.click();

        WebElement titleIssue = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[1]/div/form/div[2]/div[1]/div/div/div[1]/input"));
        titleIssue.sendKeys("Login functionality does not work,cannot login with valid credentials ");

        WebElement issueBody = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[1]/div/form/div[2]/div[1]/div/div/div[2]/div/div[3]/textarea"));
        issueBody.sendKeys("Expected result:lastkiss1759, Actual result:lastkiss");

        WebElement labelButton = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[1]/div/form/div[2]/div[2]/div[1]/div/div[1]/button"));
        labelButton.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement bugButton = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[1]/div/form/div[2]/div[2]/div[1]/div/div[1]/div/div/div[3]/div[1]/div/div/div/span[2]"));
        bugButton.click();
        labelButton.click();

        WebElement submitIssueButton = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[1]/div/form/div[2]/div[1]/div/div/div[3]/button"));
        submitIssueButton.click();

        driver.quit();


    }
}
