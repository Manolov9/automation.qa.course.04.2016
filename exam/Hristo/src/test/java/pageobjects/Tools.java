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
        //Firefox browser

       /* FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("network.http.phishy-userpass-length", 255);
        webDriver = new FirefoxDriver(profile);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://jira.atlassian.com/secure/Dashboard.jspa");
        webDriver.manage().window().maximize();*/

        //Chrome browser
        System.setProperty("webdriver.chrome.driver", "E://chromedriver/chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://192.168.0.106:8080");
    }

    public void close() {
        webDriver.quit();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }


    public WebElement findElementBy(By by) {

        webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
           WebDriverWait wait = new WebDriverWait(webDriver, 10);
                WebElement element = null;
              element = wait.until(ExpectedConditions.elementToBeClickable(by));
           webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return element;
    }





}
