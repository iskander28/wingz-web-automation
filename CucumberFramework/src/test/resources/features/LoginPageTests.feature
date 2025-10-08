@regression @login
Feature: Login Page Scenarios

  @smoke
  Scenario: Successful Login with Valid Credentials
    Given I open Wingz Website
    And I navigate to the login page
    When I login using valid credentials
    Then the user should be redirected to the booking page