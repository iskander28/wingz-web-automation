package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.BasePage;
import pageObject.MainPage;

import java.io.IOException;

// NOTE: for dependency injection use picocontainer api on mvn repository
public class MainPage_Steps extends BasePage {
    private MainPage mainPage;

    // use this constructor to access all methods and page objects in Main Page class
    public MainPage_Steps(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    // Step Definitions
    @Given("I open Wingz Website")
    public void i_open_wingz_website() {
        mainPage.navigateToMainPage();
    }
    @When("I navigate to the login page")
    public void i_navigate_to_the_login_page() throws IOException, InterruptedException {
        mainPage.waitAndClickElement(mainPage.lnkGetStarted);
    }
}
