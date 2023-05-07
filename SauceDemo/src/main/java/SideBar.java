import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SideBar extends BasePage{
    public SideBar(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "inventory_sidebar_link")
    private WebElement allItems;

    @FindBy(id = "about_sidebar_link")
    private WebElement about;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logout;

    @FindBy(id = "reset_sidebar_link")
    private WebElement resetAppState;

    @FindBy(id = "login-button" )
    private WebElement loginButton;

    public boolean allItemsIsEnabled(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(allItems));
        return allItems.isEnabled();
    }
    public void clickOnLogoutBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(logout));
        logout.click();
    }
    public boolean allItemsIsDisplayed(){
        return allItems.isDisplayed();
    }
    public boolean aboutIsEnabled(){
        return about.isEnabled();
    }
    public boolean logoutIsDisplayed(){
        return logout.isDisplayed();
    }
    public boolean logoutIsEnabled(){
        return logout.isEnabled();
    }
    //isClickable
    public boolean logoutIsSelected(){
        return logout.isSelected();
    }
    public boolean resetAppStateIsEnabled(){
        return resetAppState.isEnabled();
    }

}
