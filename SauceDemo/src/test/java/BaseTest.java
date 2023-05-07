import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
    ChromeDriver driver;

    String BASE_URL = "https://www.saucedemo.com/";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/49160/Downloads/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(BASE_URL);   // Поменяли ссылку :)
    }

    @After
    public void tearDown(){
        driver.quit();
    }
    // First Test. Deleted :[ :D

    //    @Test   // Логинимся :D успешно! в Интернет-магазине :)
//    public void loginWithValidData() {
//        WebElement userNameInputField = driver.findElement(By.id("user-name"));
//        userNameInputField.sendKeys("standard_user");
//        WebElement passwordInputField = driver.findElement(By.id("password"));
//        passwordInputField.sendKeys("secret_sauce");
//        WebElement loginButton = driver.findElement(By.id("login-button"));
//        loginButton.click();
//        WebElement inventoryList = driver.findElement(By.className("inventory_list"));
//        assertTrue(inventoryList.isDisplayed());
//    }
    String validUserNameValue = "standard_user";
    String validUserPasswordValue = "secret_sauce";
    User validUser = new User(validUserNameValue, validUserPasswordValue);
    User lockedOutUser = new User("locked_out_user", "secret_sauce");

    User invalidUser = new User("sfbkhithe", validUserPasswordValue);
}
