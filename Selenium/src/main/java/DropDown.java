import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertTrue;

public class DropDown {
    ChromeDriver driver;
    // Порядок выполнения @Аннотаций: 1. Before, 2. Test, 3. After
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/49160/Downloads/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--disable-extensions");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://suninjuly.github.io/selects1.html");   // Поменяли ссылку :)
    }
    @After
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void dropDownTest(){
        WebElement num1 = driver.findElement(By.id("num1"));
        WebElement num2 = driver.findElement(By.id("num2"));
//      num1.getText()
//      String s1 = "Hello";
//      String s2 = "Allo";
//      System.out.println(s1+s2);
        int sum =  parseInt(num1.getText()) + parseInt(num2.getText());
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='dropdown']"));
        dropdown.click();
        WebElement answerOption = driver.findElement(By.cssSelector("[value='"+ sum +"']"));
        answerOption.click();
        //click on submit button
        //assert alert
        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        assertTrue(alert.getText().contains("Congrats, you've passed the task!"));

    }

}
