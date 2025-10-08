package stepDefinitions;

import pageObject.BasePage;
import pageObject.DashboardPage;
import pageObject.LoginPage;

public class DashboardPage_Steps extends BasePage {
    private DashboardPage dashboardPage;

    // use this constructor to access all methods and page objects in Main Page class
    public DashboardPage_Steps(DashboardPage dashboardPage) {
        this.dashboardPage= dashboardPage;
    }
}
