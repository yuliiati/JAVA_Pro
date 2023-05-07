import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;   // driver

    public BasePage(WebDriver driver) {    // constructor
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
