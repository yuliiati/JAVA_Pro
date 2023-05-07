import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Cats {
    ChromeDriver driver;

    @Before // Устанавливает перед тестами ВСЕ НАСТРОЙКИИИ *(Можно много всякого накрутить!)
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/49160/Downloads/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--disable-extensions");
        driver = new ChromeDriver(options);
        driver.get("http://suninjuly.github.io/cats.html");
    }

    @Test // Проверяет, что хэдер содержит именно этот текст: "Cat memes"
    public void checkHeaderText(){
        WebElement header = driver.findElement(By.tagName("h1"));
//        System.out.println(header.getText());
        assertEquals("Cat memes", header.getText());
    }

    @Test   // Проверяет время добавления последнего котика ^^
    public void timeOfLastCat() throws InterruptedException{
        WebElement timeOfLastCat =
                driver.findElement(By.xpath("//div[@class='col-sm-4'][6]//small"));
        assertEquals("9 mins", timeOfLastCat.getText());    // Метод Get текст
//        sleep(10000);   // идет в комплекте с throws InterruptedException в названии метода
    }

    @Test   // Проверяет количество элементов
    public void checkCardsQuantity(){
        List<WebElement> cards =
                driver.findElements(By.xpath("//div[@class='col-sm-4']"));
        assertEquals(6, cards.size());  //кол-во эл.
    }

    @Test   // Проверяет кнопку Edit у 2 котика ^^
    public void editButtonSecondIsDisplayed(){
        WebElement editBtnScndCat = driver.findElement(By.xpath("//div[@class='col-sm-4'][2]//button"));
//        editBtnScndCat.isDisplayed() - должен вернуть true
        assertTrue(editBtnScndCat.isDisplayed());
    }

    @Test
    public void allCardsAreDisplazed(){
        List<WebElement> cards =
                driver.findElements(By.className("col-sm-4"));
        // 1. for
//        for (int i=0; i<cards.size(); i++){
//            assertTrue(cards.get(i).isDisplayed());  // К списку cards нельзя обращаться, только к итому элементу этого списка
//        }
        // 2. foreach
        // WebElement до : указ какой элемент списка, после : какой список <3.
        // для каждого card из списка cards делай то, что написано в фигурных скобках!)
        for (WebElement card:cards) {
            assertTrue(card.isDisplayed());
        }
        // 3. ЛЯМБДА!!!!!!!!!!!!!!)))) ахахах круто! самый быстрый и интересный способ! Ещё и со стрелочкой
//        Программирование - это сплошной мем! Жалко, я в универе не учила его..)
//        cards.forEach(card->assertTrue(card.isDisplayed()));
    }

    @After  // Закрывает после теста все и всех :DDD (Все окна!)
    public void tearDown(){
        driver.quit();
    }

}
