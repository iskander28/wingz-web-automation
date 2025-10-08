@regression @profile
Feature: Profile Page Scenarios

  Background:
    Given I login using valid credentials in SignIn page
    When I click Accounts link in the page
    And I click My Profile menu

  @smoke
  Scenario: Verify if user is able to access My Profile page
    Then the user should be redirected to the My profile page

  @smoke
  Scenario: Verify if user is able to update Profile with valid data
    When user ticks "female" gender option
    And user enters "userfnamenewa" in the first name textfield
    And user enters "userlnamenewa" in the last name textfield
    And user enters "homecitynew2" in the home city textfield
    And user enters "bioinfo_new2" in the bio textarea
    And click Save button in the page
    Then all information in the profile page should be updated
      | firstname     | lastname      | homecity     | bio          | gender |
      | userfnamenewa | userlnamenewa | homecitynew2 | bioinfo_new2 | female |

  Scenario Outline: Verify if user is able to update with invalid user first name
    When user enters "<firstname>" in the first name textfield
    And click Save button in the page
    Then an "<error_message>" should be displayed
    Examples:
      | firstname | error_message                                                                   |
      |           | Please enter your first name.                                                   |
      | 1234      | Your profile could not be saved, please try again later or contact the support. |
      | !@#$%^&*  | Invalid first name                                                              |
      | a         | Invalid first name                                                              |
      | a1        | Invalid first name                                                              |

  Scenario Outline: Verify if user is able to update with invalid user last name
    And user enters "<lastname>" in the last name textfield
    And click Save button in the page
    Then an "<error_message>" should be displayed
    Examples:
      | lastname | error_message                                                                   |
      |          | Please enter your last name.                                                    |
      | 1234     | Your profile could not be saved, please try again later or contact the support. |
      | !@#$%^&* | Invalid last name                                                               |
      | a        | Invalid last name                                                               |
      | a1       | Invalid last name                                                               |