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

import static java.lang.Double.parseDouble;
import static java.lang.Math.*;
import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MathCalc2 {
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
        driver.get("http://suninjuly.github.io/get_attribute.html");   // Поменяли ссылку :)
    }
    public double funcCalc(double x){   // double
        return log(abs(12*sin(x)));
    }

    @Test
    public void CalculationTest() throws InterruptedException {  // String- нужно преобразовать
        double result = 0;
        WebElement treasure = driver.findElement(By.id("treasure"));
        System.out.println(treasure.getText());   // Возвращает строку
        System.out.println(parseDouble(treasure.getAttribute("valuex")));  // Возвращает ЧИСЛООО!
        result = funcCalc(parseDouble(treasure.getAttribute("valuex")));   // parseDouble. Парсим. Преобразовываем
        System.out.println("Result: " + result);
        WebElement answerInputField = driver.findElement(By.id("answer"));
        answerInputField.sendKeys(Double.toString(result));
//        sleep(10000);
        //307   //307.0   //Result: 2.2212475208539244

        //1. Checkbox I'm the robot
        //2. Radiobutton Robots rule
        //3. Submit button
        WebElement checkBoxRobot =
                driver.findElement(By.id("robotCheckbox"));
        checkBoxRobot.click();
        assertEquals("robotCheckbox", checkBoxRobot.getAttribute("id"));
        WebElement Radiobutton =
                driver.findElement(By.id("robotsRule"));
        Radiobutton.click();
        assertEquals("robotsRule", Radiobutton.getAttribute("id"));
        WebElement submitButton =
                driver.findElement(By.tagName("button"));
//        sleep(10000);
        submitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        assertTrue(alert.getText().contains("Congrats, you've passed the task!"));
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}