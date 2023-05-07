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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UploadFile2 {
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
        driver.get("https://demoqa.com/upload-download");   // Поменяли ссылку :)
    }
    @After
    public void tearDown(){
        driver.quit();
    }

    @Test   // 4 строчки кода...а я туплю :(
    public void uploadFileTest(){
        WebElement uploadFile = driver.findElement(By.id("uploadFile"));    // нашли по айдишнику
        uploadFile.sendKeys("C:\\Users\\49160\\Downloads\\textfile.txt");   // отправили файл
        WebElement path = driver.findElement(By.id("uploadedFilePath"));    //сравниваем путь
        assertTrue(path.getText().contains("textfile.txt")); // сравниваем путь

    }

}
