package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    public DashboardPage() {
        super();
    }
    // Main Menu Page Objects
    @FindBy(xpath = "//nav[@id='main-navbar']//a[@ui-sref='profile.edit-profile']")
    public WebElement lnkAccounts;

    // Left Menu Page Objects
    @FindBy(xpath = "//a[@ui-sref='profile.my-profile']")
    public WebElement lnkMyProfile;
}
