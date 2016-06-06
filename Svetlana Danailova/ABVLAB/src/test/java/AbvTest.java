import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

public class AbvTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test
    public void TestSendMail_AllRequiredFieldsPopulated_ShouldSendAndReceiveCorrectly() {
        this.TestLogin_ValidCredentials_ShouldLoginCorrectly();


        WebElement mailButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div/div[3]/div"));
        mailButton.click();

        WebElement toButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[2]/td[2]/div/input"));

        toButton.click();
        toButton.sendKeys("svetlana_danailova@abv.bg");

        WebElement subjectButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[5]/td[2]/div/input"));
        subjectButton.click();
        subjectButton.sendKeys("Test mail sending Selenium");

        WebElement textArea = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div/iframe"));
        textArea.click();
        textArea.sendKeys("Test body of the test mail");

        WebElement count = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div/div/table/tbody[1]/tr[1]/td/div/em"));
        int countMailBefore = Integer.parseInt(count.getText());

        WebElement sendButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div/div[1]/div[1]"));
        sendButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.abv-h2")));



        WebElement inboxButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div/div/table/tbody[1]/tr[1]/td/div/div"));
        inboxButton.click();

        WebElement count2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div/div/table/tbody[1]/tr[1]/td/div/em"));
        int countMailAfter = Integer.parseInt(count2.getText());
        assertEquals(countMailAfter, (countMailBefore + 1));


        WebElement senderName = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div/div[5]/div/div/table/tbody[1]/tr[1]/td[2]/div"));
        assertEquals("Светлана Данаилова", senderName.getText());

        WebElement subjectName = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div/div[5]/div/div/table/tbody[1]/tr[1]/td[5]/div"));
        assertEquals("Test mail sending Selenium", subjectName.getText());


    }
    public void TestLogin_ValidCredentials_ShouldLoginCorrectly() {
        driver.get("http://abv.bg");

        String validUsername = "svetlana_danailova";
        String validPassword = "lastkiss";

        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.clear();
        usernameField.sendKeys(validUsername);

        passwordField.clear();
        passwordField.sendKeys(validPassword);

        WebElement loginButton = driver.findElement(By.id("loginBut"));
        loginButton.click();

        assertEquals("https://nm60.abv.bg/Mail.html", driver.getCurrentUrl());

        WebElement fullname = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div[1]/div[1]"));

        assertEquals("Светлана Данаилова", fullname.getText());


    }
    @After
    public void tearDown(){
        driver.quit();

    }
}
