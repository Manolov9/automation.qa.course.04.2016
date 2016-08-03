package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by xworks.admin on 6/11/2016.
 */
public class PageObjects extends Tools {

    private WebElement getMyAccountMenu() {
        return findElementBy(By.cssSelector("#user-options > a"));
    }

    private WebElement getLogOutButton() {
        return findElementBy(By.xpath("//*[@id=\"log_out\"]"));
    }

    public WebElement getEmailField() {
        return findElementBy(By.xpath("//*[@id=\"username\"]"));
    }

    public WebElement getPasswordField() {
        return findElementBy(By.xpath("//*[@id=\"password\"]"));
    }

    public WebElement clickLoginButton() {
        return findElementBy(By.xpath("//*[@id=\"login-submit\"]"));
    }

    public void logout() {
        getMyAccountMenu().click();
        getLogOutButton().click();
    }


    public void login(String user,String pass) {
        getMyAccountMenu().click();
        getEmailField().sendKeys(user);
        getPasswordField().sendKeys(pass);
        clickLoginButton().click();
    }

}
