import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Hover {
    ChromeDriver driver;

    @Before // Устанавливает перед тестами ВСЕ НАСТРОЙКИИИ *(Можно много всякого накрутить!)
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/49160/Downloads/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--disable-extensions");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");
    }

    @After  // Закрывает после теста все и всех :DDD (Все окна!)
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void hoverTest() throws InterruptedException {
        WebElement dropdown = driver.
                findElement(By.xpath("//li[@class='dropdown']/a")); //подучить селекторы!
        Actions actions = new Actions(driver);
        actions.moveToElement(dropdown).perform();
        WebElement secondaryMenu = driver.
                findElement(By.cssSelector("[class='secondary-dropdown']>a"));
        actions.moveToElement(secondaryMenu).perform();
        WebElement secondaryAction = driver.
                findElement(By.cssSelector("[onclick='handleSecondaryAction()']"));
        secondaryAction.click();
        //assert "SecondaryPage"
        WebElement secondaryHeader = driver.findElement(By.cssSelector("[class='jumbotron secondary-clicked']>h1"));
//        assertTrue(secondaryAction.getText().contains("<h1> Secondary Page <h1>"));
//        assertEquals("Secondary Page", secondaryAction.getAttribute("h1"));
//        assertTrue(secondaryHeader.getText().contains("Secondary Page"));
        assertEquals("Secondary Page", secondaryHeader.getText() );

    }


}
