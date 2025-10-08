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

    // Page Object - Profile Page
    @FindBy(xpath = "//wz-radio[@name='gender' and @value='M']/label")
    public WebElement radMale;
    @FindBy(xpath = "//wz-radio[@name='gender' and @value='F']/label")
    public WebElement radFemale;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement txtFirstName;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement txtLastName;
    @FindBy(xpath = "//input[@name='location']")
    public WebElement txtHomeCity;
    @FindBy(xpath = "//textarea[@name='bio']")
    public WebElement txtBio;
    @FindBy(xpath = "//button[@wz-loading='profile.saving']")
    public WebElement btnSave;
    @FindBy(xpath = "//div[@role='alert']/div/span")
    public WebElement lblErrorMessage;

}
