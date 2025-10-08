package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.BasePage;
import pageObject.ProfilePage;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ProfilePage_Steps extends BasePage {
    private ProfilePage profilePage;

    // use this constructor to access all methods and page objects in Main Page class
    public ProfilePage_Steps(ProfilePage profilePage) {
        this.profilePage = profilePage;
    }

    @Then("the user should be redirected to the My profile page")
    public void the_user_should_be_redirected_to_the_my_profile_page() {
        profilePage.waitUntilPageLoadIsCompleted("profile");
        getDriver().navigate().refresh();
    }

    @When("user enters {string} in the first name textfield")
    public void user_enters_in_the_first_name_textfield(String firstname) {
        profilePage.txtFirstName.clear();
        profilePage.sendKeysByWebElement(profilePage.txtFirstName, firstname);
    }
    @When("user enters {string} in the last name textfield")
    public void user_enters_in_the_last_name_textfield(String lastname) {
        profilePage.txtLastName.clear();
        profilePage.sendKeysByWebElement(profilePage.txtLastName, lastname);
    }
    @When("user enters {string} in the home city textfield")
    public void user_enters_in_the_home_city_textfield(String homecity) {
        profilePage.txtHomeCity.clear();
        profilePage.sendKeysByWebElement(profilePage.txtHomeCity, homecity);
    }
    @When("user enters {string} in the bio textarea")
    public void user_enters_in_the_bio_textarea(String bio) {
        profilePage.txtBio.clear();
        profilePage.sendKeysByWebElement(profilePage.txtBio, bio);
    }
    @When("user ticks {string} gender option")
    public void user_ticks_gender_option(String gender) throws IOException, InterruptedException {
        if(gender.equalsIgnoreCase("male")) {
            profilePage.waitAndClickElement(profilePage.radMale);
        } else {
            profilePage.waitAndClickElement(profilePage.radFemale);
        }
    }
    @When("click Save button in the page")
    public void click_save_button_in_the_page() throws IOException, InterruptedException {
        profilePage.waitAndClickElement(profilePage.btnSave);
    }
    @Then("all information in the profile page should be updated")
    public void all_information_in_the_profile_page_should_be_updated(DataTable dataTable) {
        getDriver().navigate().refresh();
        profilePage.waitUntilPageLoadIsCompleted("profile");

        List<Map<String, String>> expectedData = dataTable.asMaps(String.class, String.class);

        Map<String, String> expected = expectedData.get(0);

        String actualFirstName = profilePage.getTextFromElement(profilePage.txtFirstName);
        String actualLastName = profilePage.getTextFromElement(profilePage.txtLastName);
        String actualHomeCity = profilePage.getTextFromElement(profilePage.txtHomeCity);
        String actualBio = profilePage.getTextFromElement(profilePage.txtBio);

        Assert.assertEquals(actualFirstName.toLowerCase(), expected.get("firstname"));
        Assert.assertEquals(actualLastName.toLowerCase(), expected.get("lastname"));
//        Assert.assertEquals(actualHomeCity.toLowerCase(), expected.get("homecity"));
        Assert.assertEquals(actualBio.toLowerCase(), expected.get("bio"));
        if(expected.get("gender").equalsIgnoreCase("male")) {
            System.out.println("Male Gender is selected!");
            Assert.assertTrue(profilePage.radMale.getAttribute("class").contains("checked"));
        } else {
            System.out.println("Female Gender is selected!");
            Assert.assertTrue(profilePage.radFemale.getAttribute("class").contains("checked"));
        }
    }

    @Then("an {string} should be displayed")
    public void an_error_message_should_be_displayed(String error_message) {
        Assert.assertEquals(profilePage.lblErrorMessage.getText(), error_message);
    }
}
