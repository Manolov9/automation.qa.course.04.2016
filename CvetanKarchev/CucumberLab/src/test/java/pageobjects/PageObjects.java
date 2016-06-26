package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by xworks.admin on 6/11/2016.
 */
public class PageObjects extends Tools {

    private WebElement getMyAccountMenu() {
        return findElementBy(By.cssSelector(".truncate > span:nth-child(1)"));
    }

    private WebElement getLogOutButton() {
        return findElementBy(By.xpath("/html/body/div[3]/div[1]/nav/div/div[2]/form/div[2]/ul/li[5]/ul/li[2]/a"));
    }

    public WebElement getWelcomeText() {
        return findElementBy(By.xpath("/html/body/div[3]/div[3]/div[1]/div/div/div/div"));
    }

    public WebElement getVideoInterviewsText() {
        return findElementBy(By.xpath("/html/body/div[1]/div/div/div/h1"));
    }

    public void logout() {
        getMyAccountMenu().click();
        getLogOutButton().click();
    }

    public void login() {

    }

}
