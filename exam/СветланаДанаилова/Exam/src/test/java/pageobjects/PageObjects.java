package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageObjects extends Tools {

    public WebElement getUsernameField(){
        return findElementBy(By.xpath(".//*[@id='j_username']"));
    }
    public WebElement getPassField() {
        return findElementBy(By.xpath(".//*[@id='main-panel']/div/form/table/tbody/tr[2]/td[2]/input"));
    }
    public WebElement getLoginButton(){
        return findElementBy(By.xpath(".//*[@id='yui-gen1-button']"));
    }
    public WebElement getLogoutButton(){
        return  findElementBy(By.xpath("/html/body/div[2]/div[1]/div[2]/span/a[2]"));
    }
    public WebElement getNewItem(){
        return findElementBy(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/a[2]"));
    }
    public WebElement getItemName(){
        return findElementBy(By.xpath("/html/body/div[4]/div/div/div/div/form/div[1]/div/input"));
    }
    public WebElement getProject(){
        return findElementBy(By.xpath("/html/body/div[4]/div/div/div/div/form/div[2]/div[1]/ul/li[1]"));
    }
    public WebElement getOkButton(){
        return findElementBy(By.xpath("/html/body/div[4]/div/div/div/div/form/div[4]/div/button"));
    }
    public WebElement getDescription(){
        return findElementBy(By.xpath("/html/body/div[5]/div/div/div/div/form/table/tbody/tr[4]/td[3]/textarea"));
    }
    public WebElement getGitButton(){
        return findElementBy(By.xpath("/html/body/div[5]/div/div/div/div/form/table/tbody/tr[62]/td[1]/label/input"));
    }
    public  WebElement getRepo(){
        return findElementBy(By.xpath("/html/body/div[5]/div/div/div/div/form/table/tbody/tr[64]/td[3]/div/div[1]/table/tbody/tr[1]/td[3]/input"));

    }
    public  WebElement getXvFb(){
        return findElementBy(By.xpath("/html/body/div[5]/div/div/div/div/form/table/tbody/tr[132]/td[1]/input"));
    }
    public  WebElement getAdvanced(){
        return findElementBy(By.xpath("/html/body/div[5]/div/div/div/div/form/table/tbody/tr[134]/td[3]/div/span[2]/span/button"));
    }

    public  WebElement getCheck1(){
        return findElementBy(By.xpath("/html/body/div[5]/div/div/div/div/form/table/tbody/tr[138]/td[3]/input"));
    }
    public  WebElement getCheck2(){
        return findElementBy(By.xpath("/html/body/div[5]/div/div/div/div/form/table/tbody/tr[147]/td[3]/input"));
    }
    public WebElement getZero(){
        return findElementBy(By.xpath("/html/body/div[5]/div/div/div/div/form/table/tbody/tr[150]/td[3]/input"));
    }
    public WebElement getScreen(){
        return findElementBy(By.xpath("/html/body/div[5]/div/div/div/div/form/table/tbody/tr[153]/td[3]/input"));
    }
    public WebElement getDisplayName(){
        return findElementBy(By.xpath("/html/body/div[5]/div/div/div/div/form/table/tbody/tr[156]/td[3]/input"));
    }
    public WebElement getLog(){
        return findElementBy(By.xpath("/html/body/div[5]/div/div/div/div/form/table/tbody/tr[162]/td[3]/input"));
    }
    public WebElement getshutDown(){
        return findElementBy(By.xpath("/html/body/div[5]/div/div/div/div/form/table/tbody/tr[165]/td[3]/input"));
    }
    public WebElement getBuildStep(){
        return findElementBy(By.xpath("/html/body/div[5]/div/div/div/div/form/table/tbody/tr[195]/td/div/div[2]/span/span/button"));
    }
    public WebElement getExecuteShell(){
        return findElementBy(By.xpath("/html/body/div[5]/div/div/div/div/form/table/tbody/tr[195]/td/div/div[2]/div/div[1]/ul/li[4]/a"));
    }

    public WebElement getCommand(){
        return findElementBy(By.xpath("/html/body/div[6]/div/div/div/div/form/table/tbody/tr[195]/td/div/div[1]/table/tbody/tr[3]/td[3]/div[1]/div[3]/div/div/div[2]"));
    }
    public WebElement getSave(){
        return findElementBy(By.xpath("/html/body/div[6]/div/div/div/div/form/table/tbody/tr[198]/td/div[2]/div[2]/span[1]/span/button"));
    }
    public WebElement getPost(){
        return findElementBy(By.xpath("/html/body/div[6]/div/div/div/div/form/table/tbody/tr[197]/td/div/div[2]/span/span/button"));
    }
    public WebElement getCuc(){
        return findElementBy(By.xpath("/html/body/div[6]/div/div/div/div/form/table/tbody/tr[197]/td/div/div[2]/div/div[1]/ul/li[2]/a"));
    }







    public void credentials(String user, String password){
        getUsernameField().click();
        getUsernameField().sendKeys(user);
        getPassField().click();
        getPassField().sendKeys(password);
    }
    public void logout(){
        getLogoutButton().click();
    }
    public void newJob(String name){
        getNewItem().click();
        getItemName().click();
        getItemName().sendKeys(name);
        getProject().click();
        getOkButton().click();
    }
    public void configure (String desc, String repo, String zero, String screen, String one){
        getDescription().click();
        getDescription().sendKeys(desc);
        getGitButton().click();
        getRepo().click();
        getRepo().sendKeys(repo);
        getXvFb().click();
        getAdvanced().click();
        getCheck1().click();
        getCheck2().click();
        getZero().click();
        getZero().sendKeys(zero);
        getScreen().click();
        getScreen().sendKeys(screen);
        getDisplayName().click();
        getDisplayName().sendKeys(one);
        getLog().click();
        getshutDown().click();



    }
    public void Build(String command){
        getBuildStep().click();
        getExecuteShell().click();
        getCommand().click();
        getCommand().sendKeys(command);
        getSave().click();
        getPost().click();
        getCuc().click();

    }



}
