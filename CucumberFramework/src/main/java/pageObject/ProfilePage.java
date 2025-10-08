package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{
    // use this constructor to call on the BasePage method inside the BasePage constructor
    public ProfilePage() {
        super();
    }

    // Page Objects - Main Page
    @FindBy(xpath = "//a[@ui-sref='profile.my-profile']")
    public WebElement lnkMyProfile;

}
