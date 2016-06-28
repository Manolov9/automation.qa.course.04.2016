package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by xworks.admin on 6/11/2016.
 */
public class Tools {


    protected WebDriver webDriver;

    public Tools() {
        buildDriver();
    }

    protected void buildDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://192.168.0.106:8080");
        webDriver.manage().window().maximize();
    }


    public void close() {
        webDriver.quit();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebElement findElementBy(By by) {
        boolean f = true;
        int br = 0;
        WebDriverWait wait = new WebDriverWait(webDriver, 1);
        WebElement element = null;

        while (f) {
            br++;
            try {
                Thread.sleep(1000);
                element = wait.until(ExpectedConditions.elementToBeClickable(by));
                f = false;
                return element;
            } catch (Exception e) {
                if (br==10) System.out.println(e);
            }
            if (br==10) f=false;
        }

        return element;

    }


}
