package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginPage extends BasePage {
    // use this constructor to call on the BasePage method inside the BasePage constructor
    private String username = "";
    private String password = "";

    public LoginPage() {
        super();
    }

    // Page Objects - Login Page
    @FindBy(id = "username")
    public WebElement txtUsername;
    @FindBy(id = "password")
    public WebElement txtPasswprd;
    @FindBy(xpath = "//button[@wz-loading='ctrl.loading']")
    public WebElement btnSignIn;

    public void loginWithValidCredentials() {
        txtUsername.sendKeys(getUserName());
        txtPasswprd.sendKeys(getPassword());
        btnSignIn.click();
    }

    public String getUserName() {
        try {
            Properties properties = new Properties();
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/user.properties");
            properties.load(file);
            username  = properties.getProperty("username");
            System.out.println("username value:" + username );
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return username;
    }

    public String getPassword() {
        try {
            Properties properties = new Properties();
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/user.properties");
            properties.load(file);
            password  = properties.getProperty("password");
            System.out.println("Password value:" + password );
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return password;
    }

}
