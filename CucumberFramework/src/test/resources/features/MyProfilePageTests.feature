@regression @profile
Feature: Profile Page Scenarios
  Background:
    Given I login using valid credentials in SignIn page
    When I click Accounts link in the page
  @smoke
  Scenario: Verify if user is able to access My Profile page
    When I click My Profile menu
    Then the user should be redirected to the My profile page