package selenium.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class PageObjectModel {

    private static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.store.demoqa.com");

        // Use page Object library now

        Home_Page.lnk_MyAccount(driver).click();

        LogIn_Page.txtbx_UserName(driver).sendKeys("testuser_1");

        LogIn_Page.txtbx_Password(driver).sendKeys("Test@123");

        LogIn_Page.btn_LogIn(driver).click();

        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

        Thread.sleep(10000);
        //Home_Page.lnk_LogOut(driver).click();

        driver.quit();

    }

}