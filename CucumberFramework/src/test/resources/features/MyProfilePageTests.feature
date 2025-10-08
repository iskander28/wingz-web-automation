@regression @profile
Feature: Profile Page Scenarios

  Background:
    Given I login using valid credentials in SignIn page
    When I click Accounts link in the page
    And I click My Profile menu

  @smoke
  Scenario: Verify if user is able to access My Profile page
    Then the user should be redirected to the My profile page

  Scenario: Verify if user is able to update Profile with valid data
    When user enters "userfnamenew" in the first name textfield
    And user enters "userlnamenew" in the last name textfield
    And user enters "homecitynew" in the home city textfield
    And user enters "bioinfo_new" in the bio textarea
    And user ticks "female" gender option
    Then all information in the profile page should be updated
      | firstname    | lastname     | homecity    | bio         |
      | userfnamenew | userlnamenew | homecitynew | bioinfo_new |

  Scenario Outline: Verify if user is able to update with invalid user first name
    When user enters <firstname> in the first name textfield
    Then an <error_message> should be displayed
    And click Save button in the page
    Examples:
      | firstname | error_message                                                                   |
      |           | Your profile could not be saved, please try again later or contact the support. |
      | 1234      | Invalid first name                                                              |
      | !@#$%^&*  | Invalid first name                                                              |
      | a         | Invalid first name                                                              |
      | a1        | Invalid first name                                                              |

  Scenario Outline: Verify if user is able to update with invalid user last name
    And user enters <lastname> in the last name textfield
    And click Save button in the page
    Then an <error_message> should be displayed
    Examples:
      | lastname | error_message                                                                   |
      |          | Your profile could not be saved, please try again later or contact the support. |
      | 1234     | Invalid first name                                                              |
      | !@#$%^&* | Invalid first name                                                              |
      | a        | Invalid first name                                                              |
      | a1       | Invalid first name                                                              |

