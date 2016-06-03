import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ico on 6/2/2016.
 */
public class AbvTest {

    private WebDriver driver;

    @Before
    public void setUP(){
        driver=new FirefoxDriver();


    }
    @Test
    public void TestLogin() throws InterruptedException {
        driver.get("http://www.abv.bg/");
        String ValidUSername="abv_user_shemale_name";
        String ValidPassword= "parola_za_shemale_name";
        WebElement usernameField=driver.findElement(By.id("username"));
        WebElement passwordFilead=driver.findElement(By.id("password"));
        usernameField.clear();
        usernameField.sendKeys("hristoqatest");
        passwordFilead.clear();
        passwordFilead.sendKeys("qwerty123456");
        WebElement loginButton=driver.findElement(By.id("loginBut"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @After
    public void terDown()
    {
        driver.quit();
    }

}
