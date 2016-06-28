package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

/**
 * Created by xworks.admin on 6/11/2016.
 */
public class PageObjects extends Tools {


    public WebElement usernamefirld() {
        return findElementBy(By.id("j_username"));
    }

    public WebElement userpasswordfield() {
        return findElementBy(By.name("j_password"));
    }

    public WebElement login_button() {
        return findElementBy(By.id("yui-gen1-button"));
    }

    public WebElement logout_button() {
        return findElementBy(By.xpath("//*[@id=\"header\"]/div[2]/span/a[2]/b"));
    }

    public WebElement new_items() {
        return findElementBy(By.xpath("//*[@id=\"tasks\"]/div[1]/a[2]"));
    }

    public WebElement enter_a_name_field() {
        return findElementBy(By.id("name"));
    }

    public WebElement free_style_project() {
        return findElementBy(By.cssSelector("#j-add-item-type-standalone-projects > ul > li.hudson_model_FreeStyleProject"));
    }

    public WebElement ok_button() {
        return findElementBy(By.id("ok-button"));
    }

    public WebElement job_description() {
        return findElementBy(By.cssSelector("#main-panel > div > div > div > form > table > tbody > tr:nth-child(4) > td.setting-main > textarea"));
    }

    public WebElement git_job_selection() {
        return findElementBy(By.cssSelector("#radio-block-1"));
    }


    public WebElement git_repos_url() {
        return findElementBy(By.cssSelector("#main-panel > div > div > div > form > table > tbody > tr:nth-child(66) > td.setting-main > div > div.repeated-chunk.first.last.only > table > tbody > tr:nth-child(1) > td.setting-main > input"));
    }

    public WebElement build_environment_settup_start_xvfb() {
        return findElementBy(By.xpath("//*[@id=\"cb22\"]"));
    }

    public WebElement Let_Xvfb_choose_display_name() {
        return findElementBy(By.xpath("//*[@id=\"main-panel\"]/div/div/div/form/table/tbody/tr[138]/td[3]/input"));
    }


    public WebElement build_environment_advanced() {
        return findElementBy(By.xpath("//*[@id=\"yui-gen27-button\"]"));
    }


    public WebElement m_running_this_job_in_parallel_on_same_node() {
        return findElementBy(By.xpath("//*[@id=\"main-panel\"]/div/div/div/form/table/tbody/tr[147]/td[3]/input"));
    }

    public WebElement timeout_in_seconds() {
        return findElementBy(By.cssSelector("#main-panel > div > div > div > form > table > tbody > tr:nth-child(154) > td.setting-main > input"));

    }

    public WebElement vfbdisplay_ame_ffset() {
        return findElementBy(By.cssSelector("#main-panel > div > div > div > form > table > tbody > tr:nth-child(160) > td.setting-main > input"));
    }

    public WebElement screen_resolution() {
        return findElementBy(By.cssSelector("#main-panel > div > div > div > form > table > tbody > tr:nth-child(157) > td.setting-main > input"));
    }

    public WebElement chavka1() {
        return findElementBy(By.cssSelector("#main-panel > div > div > div > form > table > tbody > tr:nth-child(166) > td.setting-main > input"));
    }

    public WebElement chavka2() {
        return findElementBy(By.cssSelector("#main-panel > div > div > div > form > table > tbody > tr:nth-child(169) > td.setting-main > input"));
    }


    public WebElement add_ne6to() {
        return findElementBy(By.cssSelector("#yui-gen19-button"));
    }

    public WebElement execute_shell() {
        return findElementBy(By.cssSelector("#yui-gen43 > a"));
    }

    public WebElement execute_command_description(){
    return findElementBy(By.cssSelector("#yui-gen60 > table > tbody > tr:nth-child(3) > td.setting-main > div.CodeMirror > div.CodeMirror-scroll.cm-s-default"));
}
    public WebElement save_job_button() {
        return findElementBy(By.cssSelector("#yui-gen38-button"));
    }



    public void logIn() {
        usernamefirld().sendKeys("ceco");
        userpasswordfield().sendKeys("ceco");
        login_button().click();
    }

    public void jobCreation() throws InterruptedException {
        new_items().click();
        enter_a_name_field().sendKeys("Exam korrrrrrrrrrrrrrrrrrrrrrrrrr");
        free_style_project().click();
        ok_button().click();
        job_description().sendKeys("description nekakuv si");
        Thread.sleep(5000);
        git_job_selection().click();
        git_repos_url().sendKeys("https://github.com/shtraker/automation.qa.course.04.2016");
        Thread.sleep(5000);
        build_environment_settup_start_xvfb().click();
        Thread.sleep(6000);
        build_environment_advanced().click();
        Let_Xvfb_choose_display_name().click();
        m_running_this_job_in_parallel_on_same_node().click();
        timeout_in_seconds().sendKeys("0");
        screen_resolution().sendKeys("1024x768x24");
        Thread.sleep(5000);
        vfbdisplay_ame_ffset().sendKeys("1");
        chavka1().click();
        chavka2().click();
        Thread.sleep(3000);
        add_ne6to().click();
        execute_shell().click();
        //execute_command_description().click();

        //execute_command_description().sendKeys("nqkva shell komanda");
        Thread.sleep(3000);
        save_job_button().click();

    }


    public void logOut() {
        logout_button();
    }
}



