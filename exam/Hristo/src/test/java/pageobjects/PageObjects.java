package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static junit.framework.Assert.assertEquals;

/**
 * Created by xworks.admin on 6/11/2016.
 */
public class PageObjects extends Tools {

    /*private WebElement getMyAccountMenu() {
        return findElementBy(By.cssSelector("#user-options > a"));
    }*/

    private WebElement getLogOutButton() {
        return findElementBy(By.xpath("//*[@id=\"header\"]/div[2]/span/a[2]/b"));
    }

    public WebElement getUserField() {
        return findElementBy(By.xpath("//*[@id=\"j_username\"]"));
    }

    public WebElement getPasswordField() {
        return findElementBy(By.xpath("//*[@id=\"main-panel\"]/div/form/table/tbody/tr[2]/td[2]/input"));
    }
    public WebElement clickLoginButton() {
        return findElementBy(By.xpath("//*[@id=\"yui-gen1-button\"]"));
    }
    public WebElement createNewjob() {
        return findElementBy(By.xpath("//*[@id=\"tasks\"]/div[1]/a[2]"));
    }
    public WebElement addTittleNewJob(){
        return findElementBy(By.xpath("//*[@id=\"name\"]"));
    }
    public WebElement chooseFreeProject(){
        return findElementBy(By.xpath("//*[@id=\"j-add-item-type-standalone-projects\"]/ul/li[1]/label/span"));
    }
    public WebElement createProject(){
        return findElementBy(By.id("ok-button"));
    }
    public WebElement selectGit(){
        return findElementBy(By.xpath("//*[@id=\"radio-block-1\"]"));
    }
    public WebElement getRepostoryUrl(){
        return findElementBy(By.xpath("//*[@id=\"main-panel\"]/div/div/div/form/table/tbody/tr[64]/td[3]/div/div[1]/table/tbody/tr[1]/td[3]/input"));
    }
    public WebElement buildEnviroment(){
        return findElementBy(By.id("cb22"));
    }
   public WebElement EnviromentOptions(){
       return findElementBy(By.xpath("//*[@id=\"yui-gen25-button\"]"));
   }
    public WebElement letXvfbchoosedisplayname(){
        return findElementBy(By.xpath("//*[@id=\"main-panel\"]/div/div/div/form/table/tbody/tr[138]/td[3]/input"));
    }
    public WebElement sameNode(){
        return findElementBy(By.xpath("//*[@id=\"main-panel\"]/div/div/div/form/table/tbody/tr[147]/td[3]/input"));
    }
    public WebElement Timeoutinseconds(){
        return findElementBy(By.xpath("//*[@id=\"main-panel\"]/div/div/div/form/table/tbody/tr[150]/td[3]/input"));
    }
    public WebElement Xvfbscreen(){
        return findElementBy(By.xpath("//*[@id=\"main-panel\"]/div/div/div/form/table/tbody/tr[153]/td[3]/input"));
    }
    public WebElement Xvfbdisplaynameoffset(){
        return findElementBy(By.xpath("//*[@id=\"main-panel\"]/div/div/div/form/table/tbody/tr[156]/td[3]/input"));
    }
    public WebElement LogXvfboutput(){
        return findElementBy(By.xpath("//*[@id=\"main-panel\"]/div/div/div/form/table/tbody/tr[162]/td[3]/input"));
    }
    public WebElement ShutdownXvfb(){
        return findElementBy(By.xpath("//*[@id=\"main-panel\"]/div/div/div/form/table/tbody/tr[165]/td[3]/input"));
    }
    public WebElement BuildButonOptions(){
        return findElementBy(By.xpath("//*[@id=\"yui-gen19-button\"]"));
    }
    public WebElement selectBuildButtonOptions(){
        return findElementBy(By.xpath("//*[@id=\"yui-gen43\"]/a"));
    }
    public WebElement buildCommand(){
        return findElementBy(By.xpath("//*[@id=\"yui-gen17\"]/table/tbody/tr[3]/td[3]/div[1]/div[3]/div/div/div[2]"));
    }
    public WebElement addPostBuildButton()
    {
        return findElementBy(By.xpath("//*[@id=\"yui-gen21-button\"]"));
    }
    public WebElement selectPostBuildMethod(){
        return findElementBy(By.xpath("//*[@id=\"yui-gen50\"]/a"));
    }
    public WebElement PostBuildOptions(){
        return findElementBy(By.xpath("//*[@id=\"yui-gen65-button\"]"));
    }
    public WebElement JsonReportsPath(){
        return findElementBy(By.xpath("//*[@id=\"yui-gen21\"]/table/tbody/tr[4]/td[3]/input"));
    }
    public WebElement SaveProjectOptions(){
        return findElementBy(By.xpath("//*[@id=\"yui-gen43-button\"]"));
    }
    public WebElement RunProject(){
        return findElementBy(By.xpath("//*[@id=\"tasks\"]/div[5]/a[2]"));
    }

    public void logout() {
        getLogOutButton().click();
    }

    public void login(String user,String pass) {
        getUserField().sendKeys(user);
        getPasswordField().sendKeys(pass);
        clickLoginButton().click();

    }
    public void Createjob()
    {
        createNewjob().click();
    }
    public void CreateNewfreeProject() throws Exception
    {
        addTittleNewJob().sendKeys("ico14");
        chooseFreeProject().click();
        createProject().click();




    }
    public void defineProject() throws Exception
    {
        selectGit().click();
        Thread.sleep(2000);

        getRepostoryUrl().sendKeys("https://github.com/shtraker/automation.qa.course.04.2016");
        Thread.sleep(6000);
        buildEnviroment().click();
        Thread.sleep(5000);
        EnviromentOptions().click();
        Thread.sleep(5000);

        letXvfbchoosedisplayname().click();

        sameNode().click();

        Timeoutinseconds().sendKeys("0");
        Xvfbscreen().sendKeys("1024x768x24");

        Xvfbdisplaynameoffset().sendKeys("1");


        LogXvfboutput().click();
        ShutdownXvfb().click();
        Thread.sleep(12000);
        BuildButonOptions().click();

        selectBuildButtonOptions().click();
        Thread.sleep(12000);
        buildCommand().click();
        buildCommand().sendKeys("cd Hristo Tonchev/homework14 && mvn test");

        addPostBuildButton().click();

        selectPostBuildMethod().click();

        PostBuildOptions().click();

JsonReportsPath().click();
        JsonReportsPath().sendKeys("Hristo Tonchev/homework14/target/");

        SaveProjectOptions().click();



    }
    public void FinalRunProject()
    {
        RunProject().click();
    }


}
