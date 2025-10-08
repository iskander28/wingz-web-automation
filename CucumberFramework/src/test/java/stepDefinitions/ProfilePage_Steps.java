package stepDefinitions;

import io.cucumber.java.en.Then;
import pageObject.BasePage;
import pageObject.DashboardPage;
import pageObject.ProfilePage;

public class ProfilePage_Steps extends BasePage {
    private ProfilePage profilePage;

    // use this constructor to access all methods and page objects in Main Page class
    public ProfilePage_Steps(ProfilePage profilePage) {
        this.profilePage = profilePage;
    }

    @Then("the user should be redirected to the My profile page")
    public void the_user_should_be_redirected_to_the_my_profile_page() {
        profilePage.waitUntilPageLoadIsCompleted("profile");
    }
}
