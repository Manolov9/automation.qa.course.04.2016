package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.PageObjects;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Divdedov QA on 6/16/2016.
 */




public class TubePage {

    public PageObjects pageObjects;

    @Before
    public void buildDriver()  {
        pageObjects = new PageObjects();
    }

    @After
    public void destroyDriver() {
        pageObjects.close();
    }


    @Given("^Check all of the elements in the  H1 tag on tube page that are present$")
    public void h1_tube_check() throws InterruptedException {

        pageObjects.h1_click();


//        Thread.sleep(2000);
       //  assertEquals("http://www.metaporn.com/tubes.html", pageObjects.getCurrentUrl());














//        assertEquals("Pornstars", driver.findElement(By.className("active")).getText());
//
//        // sravnqva color na active elementa gore v header-a
//        String color = driver.findElement(By.cssSelector("#top > div.nav-menu > div.nav-links > ul > li.active > a")).getCssValue("color");
//        String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");
//
//        int hexValue1 = Integer.parseInt(hexValue[0]);
//        hexValue[1] = hexValue[1].trim();
//        int hexValue2 = Integer.parseInt(hexValue[1]);
//        hexValue[2] = hexValue[2].trim();
//        int hexValue3 = Integer.parseInt(hexValue[2]);
//
//        String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
//        Assert.assertEquals("#ffffff", actualColor);
//
//
//        assertEquals("Tags", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[1]/a")).getText());
//        assertEquals("Channels", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[3]")).getText());
//        assertEquals("Tubes", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[4]")).getText());
//        assertEquals("Pornstars", driver.findElement(By.tagName("h1")).getText());


    }

    @And("^Check the meta description on tube page$")
    public void meta_check_tubes_page() {

//        assertEquals("All Pornstars - Free Porn Videos - Hottest XXX Clips | MetaPorn", driver.getTitle());
//        assertEquals("Enjoy the sexiest pornstars for free here at MetaPorn. No matter who you desire, you'll find all of their hottest XXX videos right here!", driver.findElement(By.cssSelector("head > meta:nth-child(3)")).getAttribute("content"));
//        assertEquals("porno,video,porno video,free porno video,porn,porn video,free porn video,porno tube,porn tube,free porno,free porn", driver.findElement(By.cssSelector("head > meta:nth-child(4)")).getAttribute("content"));
    }

    @When("^Check the Most viewed tube and show buttons$")
    public void mostviewed_tubes_check() throws InterruptedException {

//        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[2]/ins")).size());
//        assertEquals("Most Viewed Pornstars", driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[1]/h2")).getText());
//        WebElement ShowAll = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[1]/a"));
//        WebElement ShowMostViewed = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/a"));
//        assertEquals("Show All", ShowAll.getText());
//        Thread.sleep(3000);
//        ShowAll.click();
//        assertEquals("http://www.metaporn.com/pornstars.html#bottom", driver.getCurrentUrl());
//        assertEquals("Show Most Viewed", ShowMostViewed.getText());
//        Thread.sleep(3000);
//        ShowMostViewed.click();
//        assertEquals("http://www.metaporn.com/pornstars.html#top", driver.getCurrentUrl());
//        Thread.sleep(2000);
//        String pornstarname = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[2]/ins[1]/div/div/div[2]/h3/a")).getText().toLowerCase();
//
//        // razdelq imenata na dve 4asti
//        String[] parts = pornstarname.split(" ");
//        String part1 = parts[0]; // first name
//        String part2 = parts[1]; // second name
//        assertEquals("http://www.metaporn.com/pornstar/best-" + part1 + "-" + part2 + "/1.html", driver.findElement(By.cssSelector("body > div > div.main-content.container > div.content > div.section.thumbs > div.listing.clearfix > ins:nth-child(1) > div > div > div.thumb-stats > h3 > a")).getAttribute("href"));

    }

    @And("^Check the Side bar  ot tube page that all elements are present$")
    public void sidebar_elements_tubepage() {

//        assertEquals("Top Tubes", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/div/h2")).getText());
//        assertEquals(9, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[1]/ul/li")).size());
//
//        assertEquals("Top Tags", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/div/h2")).getText());
//        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[2]/ul/li")).size());
//
//        assertEquals("Top Pornstars", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/h2")).getText());
//        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[3]/ul/li")).size());
//
//        assertEquals("Top Channels", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[4]/div/h2")).getText());
//        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[4]/ul/li")).size());

    }

    @Then("^Check All tubes Alphabetical$")
    public void alltubes_check() {

//        assertEquals("All Pornstars", driver.findElement((By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/h2"))).getText());
//        assertEquals(26, driver.findElements(By.className("letter")).size());
//        assertEquals("Z", driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/div[26]")).getText());
//        assertTrue(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/div[26]")).isDisplayed());
//
//        assertEquals("Terms of Service", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[1]")).getText());
//        assertEquals("http://www.metaporn.com/legal/terms.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(1)")).getAttribute("href"));
//
//        assertEquals("Privacy Policy", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[2]")).getText());
//        assertEquals("http://www.metaporn.com/legal/privacy.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(2)")).getAttribute("href"));
//
//        assertEquals("DMCA", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[3]")).getText());
//        assertEquals("http://www.metaporn.com/legal/dmca.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(3)")).getAttribute("href"));
//
//        assertEquals("2257", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[4]")).getText());
//        assertEquals("http://www.metaporn.com/legal/2257.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(4)")).getAttribute("href"));
//
//        assertEquals("© 2016 - MetaPorn.com, All Rights Reserved", driver.findElement(By.className("copyright")).getText());

    }



}
