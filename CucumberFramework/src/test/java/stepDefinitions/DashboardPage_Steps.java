package stepDefinitions;

import io.cucumber.java.en.When;
import pageObject.BasePage;
import pageObject.DashboardPage;
import pageObject.LoginPage;

import java.io.IOException;

public class DashboardPage_Steps extends BasePage {
    private DashboardPage dashboardPage;

    // use this constructor to access all methods and page objects in Main Page class
    public DashboardPage_Steps(DashboardPage dashboardPage) {
        this.dashboardPage= dashboardPage;
    }

    @When("I click Accounts link in the page")
    public void i_click_accounts_link_in_the_page() throws IOException, InterruptedException {
        dashboardPage.waitAndClickElement(dashboardPage.lnkAccounts);
    }

    @When("I click My Profile menu")
    public void i_click_my_profile_menu() throws IOException, InterruptedException {
        dashboardPage.waitAndClickElement(dashboardPage.lnkMyProfile);
    }
}
