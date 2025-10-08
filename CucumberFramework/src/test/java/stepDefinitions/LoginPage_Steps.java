package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObject.BasePage;
import pageObject.LoginPage;
import pageObject.MainPage;

import java.io.IOException;

public class LoginPage_Steps extends BasePage {
    private LoginPage loginPage;
    private MainPage mainPage;

    // use this constructor to access all methods and page objects in Main Page class
    public LoginPage_Steps(LoginPage loginPage, MainPage mainPage) {
        this.loginPage = loginPage;
        this.mainPage = mainPage;
    }

    // Step Definitions
    @When("I login using valid credentials")
    public void i_login_using_valid_credentials() {
        loginPage.loginWithValidCredentials();
    }
    @Then("the user should be redirected to the booking page")
    public void the_user_should_be_redirected_to_the_booking_page() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(getDriver().getCurrentUrl().contains("book"));
    }
    @Given("I login using valid credentials in SignIn page")
    public void i_login_using_valid_credentials_in_sign_in_page() throws IOException, InterruptedException {
        mainPage.navigateToMainPage();
        mainPage.waitAndClickElement(mainPage.lnkGetStarted);
        loginPage.loginWithValidCredentials();
        loginPage.waitUntilPageLoadIsCompleted("book");
    }


}
