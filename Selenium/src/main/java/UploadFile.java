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

import static org.junit.Assert.assertTrue;

public class UploadFile {
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
        driver.get("http://suninjuly.github.io/file_input.html");   // Поменяли ссылку :)
    }
    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void uploadFileTest(){
        WebElement firstName = driver.findElement(By.cssSelector("[name='firstname']"));
        firstName.sendKeys("Name");
        WebElement lastName = driver.findElement(By.cssSelector("[name='lastname']"));
        lastName.sendKeys("Last Name");
        WebElement email = driver.findElement(By.cssSelector("[name='email']"));    // нашли элемент
        email.sendKeys("@email"); // заполнили элемент
        WebElement uploadButton = driver.findElement(By.id("file"));
        uploadButton.sendKeys("C:\\Users\\49160\\Downloads\\textfile.txt");
        // "C:\Users\49160\Downloads\textfile.txt" C:/Users/49160/Downloads/textfile.txt
        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        assertTrue(alert.getText().contains("Congrats, you've passed the task!"));


    }
}
