package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.BasePage;
import pageObject.MainPage;

// NOTE: for dependency injection use picocontainer api on mvn repository
public class MainPage_Steps extends BasePage {
    // specify the class needed for dependency injection
    private MainPage mainPage;
    // use this constructor to access all methods and page objects in Main Page class
    public MainPage_Steps(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    @Given("I visit the website")
    public void i_visit_back_market_website() {
        mainPage.navigateToMainPage();
    }
}
