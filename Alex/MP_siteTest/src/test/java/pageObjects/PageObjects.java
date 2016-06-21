package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Divdedov QA on 6/16/2016.
 */
public class PageObjects extends Tools {


    public WebElement h1_tags() {
            return findElementBy(By.xpath("//*[@id=\"top\"]/div/div[2]/div[1]/div[1]/ul/li[1]"));
        }

    public WebElement h1_pornstars() {
        return findElementBy(By.xpath("//*[@id=\"top\"]/div/div[2]/div[1]/div[1]/ul/li[2]"));
    }

    public WebElement h1_channels() {
        return findElementBy(By.xpath("//*[@id=\"top\"]/div/div[2]/div[1]/div[1]/ul/li[3]"));
    }

    public WebElement h1_tubes() {
        return findElementBy(By.xpath("//*[@id=\"top\"]/div/div[2]/div[1]/div[1]/ul/li[4]"));
    }

    public void h1_click(){
        h1_tags().click();
        h1_pornstars().click();
        h1_channels().click();


    }




}
