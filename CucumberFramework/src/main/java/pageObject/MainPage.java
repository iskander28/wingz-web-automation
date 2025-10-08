package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.GlobalVars;

public class MainPage extends BasePage{
    // use this constructor to call on the BasePage method inside the BasePage constructor
    public MainPage() {
        super();
    }

    // Page Objects - Main Page
    @FindBy(xpath = "//div[@class='login-buttons']/a")
    public WebElement lnkGetStarted;

    public void navigateToMainPage() {navigateToPage(GlobalVars.DEFAULT_WEBSITE_URL);}
}
