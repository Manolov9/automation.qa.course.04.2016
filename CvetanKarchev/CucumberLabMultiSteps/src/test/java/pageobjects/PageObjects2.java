package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by xworks.admin on 6/11/2016.
 */
public class PageObjects2 extends Tools {

    public WebElement createBugButon() {
        return findElementBy(By.xpath("//*[@id=\"create_link\"]"));
    }
    public WebElement cancelButton()  {
        return findElementBy(By.xpath("/html/body/div[2]/div[2]/div/div/form/div[2]/div/a"));
    }

}
