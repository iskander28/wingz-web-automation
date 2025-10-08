package stepDefinitions;

import pageObject.BasePage;
import pageObject.DashboardPage;
import pageObject.ProfilePage;

public class ProfilePage_Steps extends BasePage {
    private ProfilePage profilePage;

    // use this constructor to access all methods and page objects in Main Page class
    public ProfilePage_Steps(ProfilePage profilePage) {
        this.profilePage = profilePage;
    }
}
