package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by xworks.admin on 6/11/2016.
 */
public class Tools {

    protected static WebDriver webDriver;

    public void buildDriver() {
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("network.http.phishy-userpass-length", 255);
        webDriver = new FirefoxDriver(profile);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://jira.atlassian.com");
        webDriver.manage().window().setSize(new Dimension(1300, 700));
    }

    public void close() {
        webDriver.quit();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public static WebElement findElementBy(By by) {
        webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        WebElement element = null;
        element = wait.until(ExpectedConditions.elementToBeClickable(by));
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return element;
    }


}
