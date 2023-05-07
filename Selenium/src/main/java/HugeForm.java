import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HugeForm {
    ChromeDriver driver;
    // Порядок работы: 1. Before, 2. Test, 3. After

    @Before // Порядок выполнения @Аннотаций: 1.
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/49160/Downloads/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--disable-extensions");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://suninjuly.github.io/huge_form.html");   // Поменяли ссылку :)
    }

    @Test
    public void allFields() throws InterruptedException {
        List<WebElement> inputFields = driver.findElements(By.tagName("input"));
//        inputFields.get(0).sendKeys("Wooooooooooooooooow_969069");
        for (WebElement field:inputFields) {
            field.sendKeys("Best Day Ever :)");
        }
        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        assertTrue(alert.getText().contains("Congrats, you've passed the task!"));
         //Alert alert
        // "Congrats, you've passed the task! Copy this code as the answer "
    }

    @After
    public void tearDown(){
        driver.quit();
    }
    /*  Андрей Попович 11:48
        assertEquals("Copy this code as the answer",alert.getText());
        -- 1 не подходит
        Anatolii Sidorenco 11:48
        assertTrue(alert.getText().contains("Congrats")
        -- 2 True - подходит                                                */

}
