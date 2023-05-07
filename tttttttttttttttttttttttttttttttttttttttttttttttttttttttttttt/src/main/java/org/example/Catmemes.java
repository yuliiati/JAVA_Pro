package org.example;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class Catmemes {
    ChromeDriver driver;

    @Before
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","/C:/Program Files/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-extensions");
        driver = new ChromeDriver(options);
        driver.get("http://suninjuly.github.io/cats.html");

        System.setProperty("webdriver.chrome.driver","/C:/Program Files/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-extensions");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://suninjuly.github.io/cats.html");
    }
    @Test
    public <ChromeDriver, WebElement> void checkHeaderText () {
        WebElement header =
                driver.findElement(By.tagName("h1"));
        System.out.println(header.getText());
        assertEquals("Cat memes", checkHeaderText());
    }
    @Test
    public void timeOfLastCat() throws InterruptedException {
        WebElement timeOfLastCat =
                driver.findElement(By.xpath("//div[@class=\"col-sm-4\"][6]//small"));
        assertEquals("9 mins", timeOfLastCat.getText());
        timeOfLastCat.isDisplayed = true;
        sleep(10000);
    }

    @Test
    public void checkCardsQuantity(){
        List<WebElement> cards =
                driver.findElements(By.xpath("//div[]@class='col-sm-4'"));
        System.out.println(cards.size());
        assertEquals(6, cards.size());
    }

    public void editButtonSecondCatIsDisplayed(){
        WebElement editBtnScndCat = driver.findElement(By.);
        editBtnScndCat.isDisplayed()
    }

    @After
    public void tearDown(){
        driver.quit(); // закрыть окно браузера
    }


}
