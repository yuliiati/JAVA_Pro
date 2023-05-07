import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InventoryTest extends BaseTest{

    @Test
     public void itemElementsTest(){    // находит баг, заведомо валится. И видим индекс элемента проблемы
         LoginPage loginPage = new LoginPage(driver); // Экземпляр класса основного Логин Пейдж
         loginPage.successLogin(validUser);
         InventoryPage inventoryPage = new InventoryPage(driver);
         assertTrue(inventoryPage.inventoryListIsDisplayed());
         // assert item quantity equals 6   // Матрешка.Тест.:))
         assertEquals(6, inventoryPage.getItemsQuantity());
         assertTrue(inventoryPage.allItemsAreDisplayed());  // Проверка отображения всех карточек
         assertTrue(inventoryPage.allItemNamesAreDisplayedNotEmpty()); // ОТОБРАЖАЮТСЯ
//         assertTrue(inventoryPage.allNamesAreNotEmpty());   // не пустые
//         // all item names contains start with "Sauce Labs"
         assertTrue("Not all names starts with Sauce Labs", inventoryPage.allNamesAreStartWithSauceLabs());

     }

}
