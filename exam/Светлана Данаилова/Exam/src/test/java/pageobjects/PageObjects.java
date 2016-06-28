package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageObjects extends Tools {

    public WebElement getEmailField(){
        return findElementBy(By.xpath(""));
    }

    public WebElement getPasswordField(){
        return findElementBy(By.xpath(""));
    }
    public  WebElement getLoginButton(){
        return findElementBy(By.xpath(""));
    }
    public WebElement getMenuProfile(){
        return findElementBy(By.xpath(""));
    }
    public WebElement getLogoutButton(){
        return findElementBy(By.xpath(""));
    }
    public  WebElement getWriteEmailButton() {
        return findElementBy(By.xpath(""));
    }
    public WebElement getToFields(){
        return findElementBy(By.xpath(""));
    }
    public WebElement getTopicField(){
        return findElementBy(By.xpath(""));
    }
    public WebElement getBodyField(){
        return findElementBy(By.xpath(""));
    }
    public WebElement getSendButton(){
        return findElementBy(By.xpath(""));
    }
    public void login(String user, String pass){
        getEmailField().click();
        getEmailField().sendKeys(user);
        getPasswordField().click();
        getPasswordField().sendKeys(pass);
        getLoginButton().click();
    }
    public void logout() {
        getMenuProfile().click();
        getLogoutButton().click();
    }
    public void writeEmail(String to, String topic, String body) {
        getWriteEmailButton().click();
        getToFields().click();
        getToFields().sendKeys(to);
        getTopicField().click();
        getTopicField().sendKeys(topic);
        getBodyField().click();
        getBodyField().sendKeys(body);
    }
    public void sendEmail(){
        getSendButton().click();
    }



}
