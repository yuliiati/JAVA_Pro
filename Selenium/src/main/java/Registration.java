import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Registration {
    ChromeDriver driver;

    @Before // Порядок выполнения @Аннотаций: 1.
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/49160/Downloads/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--disable-extensions");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   // Ждун :)))))
        driver.get("https://suninjuly.github.io/registration1.html");   // Поменяли ссылку :)

    }
//    @Test 2.

    @After  // 3.
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void placeholdersTest(){ // All placeholders check
        String expectedFirstNamePlaceholder = "Input your first name";
        WebElement firstNameInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your first name']"));
        assertEquals("Placeholder has not text:" + expectedFirstNamePlaceholder, expectedFirstNamePlaceholder,
                firstNameInputField.getAttribute("placeholder"));

        WebElement lastNameInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your last name']"));
        lastNameInputField.sendKeys(" :)");
        assertEquals("Input your last name", lastNameInputField.getAttribute("placeholder"));

        WebElement emailInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your email']"));
        emailInputField.sendKeys("qwerty@gmail.com");
        assertEquals("Input your email", emailInputField.getAttribute("placeholder"));

        WebElement phoneInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your phone:']"));
        phoneInputField.sendKeys("+491602361835");
        assertEquals("Input your phone:", phoneInputField.getAttribute("placeholder"));

        WebElement addressInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your address:']"));
        addressInputField.sendKeys("Berlin, 23");
        assertEquals("Input your address:", addressInputField.getAttribute("placeholder"));


    }

    @Test   // Проверяет, что мы успешно зарегистрировались "successfulRegAllFields"
    public void successfulRegAllFields() throws InterruptedException {
        WebElement firstNameInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your first name']"));
        firstNameInputField.sendKeys("RRrr");

        WebElement lastNameInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your last name']"));
        lastNameInputField.sendKeys(" :)");

        WebElement emailInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your email']"));
        emailInputField.sendKeys("qwerty@gmail.com");

        WebElement phoneInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your phone:']"));
        phoneInputField.sendKeys("+491602361835");

        WebElement addressInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your address:']"));
        addressInputField.sendKeys("Berlin, 23");

        WebElement submitButton =
                driver.findElement(By.cssSelector("[type='submit']"));
        sleep(10000);
        submitButton.click();
//        sleep(10000);
        WebElement headerSuccess =
                driver.findElement(By.tagName("h1"));
        assertEquals("Congratulations! You have successfully registered!",
                headerSuccess.getText());
        assertTrue(headerSuccess.getText().contains("Congratulations!"));
        System.out.println(driver.getCurrentUrl());
        //registration_result in URL
        assertTrue(driver.getCurrentUrl().contains("registration_result"));
    }

    @Test
    public void withoutFirstName(){
        WebElement lastNameInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your last name']"));
        lastNameInputField.sendKeys(" :)");

        WebElement emailInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your email']"));
        emailInputField.sendKeys("qwerty@gmail.com");

        WebElement phoneInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your phone:']"));
        phoneInputField.sendKeys("+491602361835");

        WebElement addressInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your address:']"));
        addressInputField.sendKeys("Berlin, 23");

        WebElement submitButton =
                driver.findElement(By.cssSelector("[type='submit']"));
//        sleep(2000);
        submitButton.click();
//        sleep(10000);
        WebElement firstNameInputField =
                driver.findElement(By.cssSelector("input[placeholder='Input your first name']"));
        assertEquals("Заповніть це поле.", firstNameInputField.getAttribute("validationMessage"));  // Заповніть це поле.
    }

}
