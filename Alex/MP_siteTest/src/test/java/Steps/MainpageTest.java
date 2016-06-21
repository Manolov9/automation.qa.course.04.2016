package Steps;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.openqa.selenium.remote.DesiredCapabilities;
import sun.security.util.PendingException;
/**
 * Created by Divdedov QA on 6/8/2016.
 */
public class MainpageTest {

    public WebDriver driver;

    @Before
    public void buildDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.metaporn.com/");
        driver.manage().window().maximize();
    }

    @After
    public void destroyDriver() {
        driver.quit();
    }


    @Given("^Check all of the elements in the  H1 tag that are present$")
    public void h1_tag_check() throws InterruptedException {
        driver.findElement(By.className("logo")).click();
        Thread.sleep(2000);
        assertEquals("http://www.metaporn.com/", driver.getCurrentUrl());
        assertEquals("Tags", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[1]")).getText());
        assertEquals("Pornstars", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[2]")).getText());
        assertEquals("Channels", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[3]")).getText());
        assertEquals("Tubes", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[4]")).getText());
        assertEquals("The Porn Directory", driver.findElement(By.tagName("h1")).getText());
    }

    @And("^Check the meta description$")
    public void meta_check() {
        assertEquals("Free Porn Videos - XXX Sex Clips - Best Porno Movies | MetaPorn", driver.getTitle());
        assertEquals("MetaPorn is your guide to the best free porn the Internet has to offer. Check it out now. You will never want to go back to another porn site!", driver.findElement(By.cssSelector("head > meta:nth-child(3)")).getAttribute("content"));
        assertEquals("porno,video,porno video,free porno video,porn,porn video,free porn video,porno tube,porn tube,free porno,free porn", driver.findElement(By.cssSelector("head > meta:nth-child(4)")).getAttribute("content"));
    }

    @When("^Check the 3 categories Tags , Pornstars and Channels$")
    public void category3_check() {
        assertEquals("Show More", driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div[1]/a")).getText());
        assertEquals("http://www.metaporn.com/tags.html", driver.findElement(By.cssSelector("body > div > div.main-content.container > div.content > div > div:nth-child(1) > a")).getAttribute("href"));
        assertEquals("Featured Tags", driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div[1]/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[2]/div/div[2]/ins")).size());

        assertEquals("Show More", driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div[3]/a")).getText());
        assertEquals("http://www.metaporn.com/pornstars.html", driver.findElement(By.cssSelector("body > div > div.main-content.container > div.content > div > div:nth-child(3) > a")).getAttribute("href"));
        assertEquals("Featured Pornstars", driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div[3]/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[2]/div/div[4]/ins")).size());

        assertEquals("Show More", driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div[5]/a")).getText());
        assertEquals("http://www.metaporn.com/channels.html", driver.findElement(By.cssSelector("body > div > div.main-content.container > div.content > div > div:nth-child(5) > a")).getAttribute("href"));
        assertEquals("Featured Channels", driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div[5]/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[2]/div/div[6]/ins")).size());

    }


    @And("^Check the Side bar that all elements are present$")
    public void side_bar_check() {
        assertEquals("Top Tubes", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/div/h2")).getText());
        assertEquals(9, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[1]/ul/li")).size());


        assertEquals("Top Tags", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/div/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[2]/ul/li")).size());


        assertEquals("Top Pornstars", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[3]/ul/li")).size());


        assertEquals("Top Channels", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[4]/div/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[4]/ul/li")).size());

    }

    @Then("^Check the footer that has text and  is correct$")
    public void footer_check() {

        assertEquals("MetaPorn is your gateway to millions of free porn videos! We are dedicated to presenting you the best high quality porn movies the Internet has to offer, completely free and so easy to use, you will never want to go back to another porn site. We add tons of new videos every day to make sure you never get bored when you explore loads of hot clips from various niches. MetaPorn offers the sexiest amateur babes that look like the girl next door, slutty chicks that love getting anal fucked into their tight holes, horny pornstars with a juicy big ass, others with incredibly huge tits - and lots with both! You have come to the right place if you desire inexperienced teens or cock hungry MILFs alike - we offer you the most beautiful girls in the adult business from all around the world, doing the dirtiest stuff you could ever image. No matter what kind of free porn you are looking for, we have the best XXX clips from the big tube sites out there! MetaPorn is fast, awesome and addictive. Enjoy it!", driver.findElement(By.className("footer-text")).getText());

        assertEquals("Terms of Service", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/a[1]")).getText());
        assertEquals("http://www.metaporn.com/legal/terms.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(1)")).getAttribute("href"));

        assertEquals("Privacy Policy", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/a[2]")).getText());
        assertEquals("http://www.metaporn.com/legal/privacy.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(2)")).getAttribute("href"));

        assertEquals("DMCA", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/a[3]")).getText());
        assertEquals("http://www.metaporn.com/legal/dmca.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(3)")).getAttribute("href"));

        assertEquals("2257", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/a[4]")).getText());
        assertEquals("http://www.metaporn.com/legal/2257.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(4)")).getAttribute("href"));

        assertEquals("© 2016 - MetaPorn.com, All Rights Reserved", driver.findElement(By.className("copyright")).getText());

    }


    //Tag page

    @Given("^Check all of the elements in the  H1 tag on tags page that are present$")
    public void h1_tags_check() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[1]")).click();
        Thread.sleep(2000);
        assertEquals("http://www.metaporn.com/tags.html", driver.getCurrentUrl());
        assertEquals("Tags", driver.findElement(By.className("active")).getText());

        // sravnqva color na active elementa gore v header-a
        String color = driver.findElement(By.cssSelector("#top > div.nav-menu > div.nav-links > ul > li.active > a")).getCssValue("color");
        String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");
        int hexValue1 = Integer.parseInt(hexValue[0]);
        hexValue[1] = hexValue[1].trim();
        int hexValue2 = Integer.parseInt(hexValue[1]);
        hexValue[2] = hexValue[2].trim();
        int hexValue3 = Integer.parseInt(hexValue[2]);
        String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
        Assert.assertEquals("#ffffff", actualColor);

        assertEquals("Pornstars", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[2]")).getText());
        assertEquals("Channels", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[3]")).getText());
        assertEquals("Tubes", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[4]")).getText());
        assertEquals("Tags", driver.findElement(By.tagName("h1")).getText());

    }


    @And("^Check the meta description on tag page$")
    public void tags_meta_check() {
        assertEquals("All Porn Tags - XXX Categories - Hot Sex Niches | MetaPorn", driver.getTitle());
        assertEquals("All the free porn videos you could ever want, find them here at MetaPorn. Every day we add more new & hot XXX clips from every niche you have ever dreamed of!", driver.findElement(By.cssSelector("head > meta:nth-child(3)")).getAttribute("content"));
        assertEquals("porno,video,porno video,free porno video,porn,porn video,free porn video,porno tube,porn tube,free porno,free porn", driver.findElement(By.cssSelector("head > meta:nth-child(4)")).getAttribute("content"));
    }

    @When("^Check the Most viewed Tags and show buttons$")
    public void check_mostviewed_show() throws InterruptedException {

        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[2]/ins")).size());
        assertEquals("Most Viewed Tags", driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[1]/h2")).getText());
        WebElement ShowAll = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[1]/a"));
        WebElement ShowMostViewed = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/a"));
        assertEquals("Show All", ShowAll.getText());
        Thread.sleep(3000);
        ShowAll.click();
        assertEquals("http://www.metaporn.com/tags.html#bottom", driver.getCurrentUrl());
        assertEquals("Show Most Viewed", ShowMostViewed.getText());
        Thread.sleep(3000);
        ShowMostViewed.click();
        assertEquals("http://www.metaporn.com/tags.html#top", driver.getCurrentUrl());
        Thread.sleep(2000);
        String tagname = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[2]/ins[1]/div/div/div[2]/h3/a")).getText().toLowerCase();
        assertEquals("http://www.metaporn.com/tag/best-" + tagname + "/1.html", driver.findElement(By.cssSelector("body > div > div.main-content.container > div.content > div.section.thumbs > div.listing.clearfix > ins:nth-child(1) > div > div > div.thumb-stats > h3 > a")).getAttribute("href"));


    }


    @And("^Check the Side bar  ot tag page that all elements are present$")
    public void sidebar_checker() {
        assertEquals("Top Tubes", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/div/h2")).getText());
        assertEquals(9, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[1]/ul/li")).size());

        assertEquals("Top Tags", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/div/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[2]/ul/li")).size());

        assertEquals("Top Pornstars", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[3]/ul/li")).size());

        assertEquals("Top Channels", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[4]/div/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[4]/ul/li")).size());

    }

    @Then("^Check All tags Alphabetical$")
    public void check_all_tags() {
        assertEquals("All Tags", driver.findElement((By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/h2"))).getText());

        assertEquals(25, driver.findElements(By.className("letter")).size());
        assertEquals("Y", driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/div[25]")).getText());
        assertTrue(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/div[25]")).isDisplayed());

        assertEquals("Terms of Service", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[1]")).getText());
        assertEquals("http://www.metaporn.com/legal/terms.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(1)")).getAttribute("href"));

        assertEquals("Privacy Policy", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[2]")).getText());
        assertEquals("http://www.metaporn.com/legal/privacy.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(2)")).getAttribute("href"));

        assertEquals("DMCA", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[3]")).getText());
        assertEquals("http://www.metaporn.com/legal/dmca.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(3)")).getAttribute("href"));

        assertEquals("2257", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[4]")).getText());
        assertEquals("http://www.metaporn.com/legal/2257.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(4)")).getAttribute("href"));
        assertEquals("© 2016 - MetaPorn.com, All Rights Reserved", driver.findElement(By.className("copyright")).getText());
    }


    //Pornstars Page

    @Given("^Check all of the elements in the  H1 tag on Pornstars page that are present$")
    public void h1_pornstars_check() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        assertEquals("http://www.metaporn.com/pornstars.html", driver.getCurrentUrl());
        assertEquals("Pornstars", driver.findElement(By.className("active")).getText());

        // sravnqva color na active elementa gore v header-a
        String color = driver.findElement(By.cssSelector("#top > div.nav-menu > div.nav-links > ul > li.active > a")).getCssValue("color");
        String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");

        int hexValue1 = Integer.parseInt(hexValue[0]);
        hexValue[1] = hexValue[1].trim();
        int hexValue2 = Integer.parseInt(hexValue[1]);
        hexValue[2] = hexValue[2].trim();
        int hexValue3 = Integer.parseInt(hexValue[2]);

        String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
        Assert.assertEquals("#ffffff", actualColor);


        assertEquals("Tags", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[1]/a")).getText());
        assertEquals("Channels", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[3]")).getText());
        assertEquals("Tubes", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[4]")).getText());
        assertEquals("Pornstars", driver.findElement(By.tagName("h1")).getText());


    }

    @And("^Check the meta description on Pornstars page$")
    public void meta_check_pornstars_page() {

        assertEquals("All Pornstars - Free Porn Videos - Hottest XXX Clips | MetaPorn", driver.getTitle());
        assertEquals("Enjoy the sexiest pornstars for free here at MetaPorn. No matter who you desire, you'll find all of their hottest XXX videos right here!", driver.findElement(By.cssSelector("head > meta:nth-child(3)")).getAttribute("content"));
        assertEquals("porno,video,porno video,free porno video,porn,porn video,free porn video,porno tube,porn tube,free porno,free porn", driver.findElement(By.cssSelector("head > meta:nth-child(4)")).getAttribute("content"));
    }

    @When("^Check the Most viewed Pornstars and show buttons$")
    public void mostviewed_pornstasrs_check() throws InterruptedException {

        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[2]/ins")).size());
        assertEquals("Most Viewed Pornstars", driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[1]/h2")).getText());
        WebElement ShowAll = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[1]/a"));
        WebElement ShowMostViewed = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/a"));
        assertEquals("Show All", ShowAll.getText());
        Thread.sleep(3000);
        ShowAll.click();
        assertEquals("http://www.metaporn.com/pornstars.html#bottom", driver.getCurrentUrl());
        assertEquals("Show Most Viewed", ShowMostViewed.getText());
        Thread.sleep(3000);
        ShowMostViewed.click();
        assertEquals("http://www.metaporn.com/pornstars.html#top", driver.getCurrentUrl());
        Thread.sleep(2000);
        String pornstarname = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[2]/ins[1]/div/div/div[2]/h3/a")).getText().toLowerCase();

        // razdelq imenata na dve 4asti
        String[] parts = pornstarname.split(" ");
        String part1 = parts[0]; // first name
        String part2 = parts[1]; // second name
        assertEquals("http://www.metaporn.com/pornstar/best-" + part1 + "-" + part2 + "/1.html", driver.findElement(By.cssSelector("body > div > div.main-content.container > div.content > div.section.thumbs > div.listing.clearfix > ins:nth-child(1) > div > div > div.thumb-stats > h3 > a")).getAttribute("href"));

    }

    @And("^Check the Side bar ot Pornstars page that all elements are present$")
    public void sidebar_elements_pornstarpage() {

        assertEquals("Top Tubes", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/div/h2")).getText());
        assertEquals(9, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[1]/ul/li")).size());

        assertEquals("Top Tags", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/div/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[2]/ul/li")).size());

        assertEquals("Top Pornstars", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[3]/ul/li")).size());

        assertEquals("Top Channels", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[4]/div/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[4]/ul/li")).size());

    }

    @Then("^Check All Pornstars Alphabetical$")
    public void allpornstars_check() {

        assertEquals("All Pornstars", driver.findElement((By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/h2"))).getText());
        assertEquals(26, driver.findElements(By.className("letter")).size());
        assertEquals("Z", driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/div[26]")).getText());
        assertTrue(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/div[26]")).isDisplayed());

        assertEquals("Terms of Service", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[1]")).getText());
        assertEquals("http://www.metaporn.com/legal/terms.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(1)")).getAttribute("href"));

        assertEquals("Privacy Policy", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[2]")).getText());
        assertEquals("http://www.metaporn.com/legal/privacy.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(2)")).getAttribute("href"));

        assertEquals("DMCA", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[3]")).getText());
        assertEquals("http://www.metaporn.com/legal/dmca.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(3)")).getAttribute("href"));

        assertEquals("2257", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[4]")).getText());
        assertEquals("http://www.metaporn.com/legal/2257.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(4)")).getAttribute("href"));

        assertEquals("© 2016 - MetaPorn.com, All Rights Reserved", driver.findElement(By.className("copyright")).getText());

    }


    //Channels page

    @Given("^Check all of the elements in the  H1 tag on Channels page that are present$")
    public void header_elements_channelspage() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[3]/a")).click();
        Thread.sleep(2000);
        assertEquals("http://www.metaporn.com/channels.html", driver.getCurrentUrl());
        assertEquals("Channels", driver.findElement(By.className("active")).getText());

        // sravnqva color na active elementa gore v header-a
        String color = driver.findElement(By.cssSelector("#top > div.nav-menu > div.nav-links > ul > li.active > a")).getCssValue("color");
        String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");

        int hexValue1 = Integer.parseInt(hexValue[0]);
        hexValue[1] = hexValue[1].trim();
        int hexValue2 = Integer.parseInt(hexValue[1]);
        hexValue[2] = hexValue[2].trim();
        int hexValue3 = Integer.parseInt(hexValue[2]);

        String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
        Assert.assertEquals("#ffffff", actualColor);


        assertEquals("Tags", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[1]/a")).getText());
        assertEquals("Pornstars", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[2]")).getText());
        assertEquals("Tubes", driver.findElement(By.xpath("//*[@id=\"top\"]/div[1]/div[1]/ul/li[4]")).getText());
        assertEquals("Channels", driver.findElement(By.tagName("h1")).getText());

    }

    @And ("^Check the meta description on Channels page$")
        public void meta_desc_channelpage(){

        assertEquals("Free Porn Channels - XXX Studios - Best Porno Sites | MetaPorn", driver.getTitle());
        assertEquals("Looking for free porn videos from the hottest XXX studios? Find them here at MetaPorn. Amazing clips from your favourite porno channels are waiting for you!", driver.findElement(By.cssSelector("head > meta:nth-child(3)")).getAttribute("content"));
        assertEquals("porno,video,porno video,free porno video,porn,porn video,free porn video,porno tube,porn tube,free porno,free porn", driver.findElement(By.cssSelector("head > meta:nth-child(4)")).getAttribute("content"));
    }

    @When ("^Check the Most viewed Channels and show buttons$")
    public void mostviewed_channels_check() throws InterruptedException {

        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[2]/ins")).size());
        assertEquals("Most Viewed Channels", driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[1]/h2")).getText());
        WebElement ShowAll = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[1]/a"));
        WebElement ShowMostViewed = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/a"));
        assertEquals("Show All", ShowAll.getText());
        Thread.sleep(3000);
        ShowAll.click();
        assertEquals("http://www.metaporn.com/channels.html#bottom", driver.getCurrentUrl());
        assertEquals("Show Most Viewed", ShowMostViewed.getText());
        Thread.sleep(3000);
        ShowMostViewed.click();
        assertEquals("http://www.metaporn.com/channels.html#top", driver.getCurrentUrl());
        Thread.sleep(2000);
        String channelname = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[2]/ins[1]/div/div/div[2]/h3/a")).getText().toLowerCase();

//        ArrayList<String> ar = new ArrayList<String>();
//        ar.add(channelname);
//        for (String s : ar){
//            if (s != 2){
//
//            }


//        // razdelq imenata na dve 4asti
        String[] parts = channelname.split(" ");
        channelname.split(" ");
        String part1 = parts[0]; // first name
        String part2 = parts[1]; // second name
        assertEquals("http://www.metaporn.com/channel/best-" + part1 + "-" + part2 + "/1.html", driver.findElement(By.cssSelector("body > div > div.main-content.container > div.content > div.section.thumbs > div.listing.clearfix > ins:nth-child(1) > div > div > div.thumb-stats > h3 > a")).getAttribute("href"));

    }


    @And ("^Check the Side bar ot Channels page that all elements are present$")
        public void sidebar_channelspage_check() {

        assertEquals("Top Tubes", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/div/h2")).getText());
        assertEquals(9, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[1]/ul/li")).size());

        assertEquals("Top Tags", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/div/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[2]/ul/li")).size());

        assertEquals("Top Pornstars", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[3]/ul/li")).size());

        assertEquals("Top Channels", driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[4]/div/h2")).getText());
        assertEquals(60, driver.findElements(By.xpath("/html/body/div/div[1]/div[1]/div[4]/ul/li")).size());

    }
    @Then ("^Check All Channels Alphabetical$")
    public void all_channels_check(){


        assertEquals("All Channels", driver.findElement((By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/h2"))).getText());
        assertEquals(26, driver.findElements(By.className("letter")).size());
        assertEquals("Z", driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/div[26]")).getText());
        assertTrue(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/div[26]")).isDisplayed());

        assertEquals("Terms of Service", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[1]")).getText());
        assertEquals("http://www.metaporn.com/legal/terms.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(1)")).getAttribute("href"));

        assertEquals("Privacy Policy", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[2]")).getText());
        assertEquals("http://www.metaporn.com/legal/privacy.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(2)")).getAttribute("href"));

        assertEquals("DMCA", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[3]")).getText());
        assertEquals("http://www.metaporn.com/legal/dmca.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(3)")).getAttribute("href"));

        assertEquals("2257", driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/a[4]")).getText());
        assertEquals("http://www.metaporn.com/legal/2257.html", driver.findElement(By.cssSelector("body > div > div.footer.container > div > div.statement > a:nth-child(4)")).getAttribute("href"));

        assertEquals("© 2016 - MetaPorn.com, All Rights Reserved", driver.findElement(By.className("copyright")).getText());

    }







}