Feature: Admin Functionality Tests

  We will be testing the search, add, and
  table on the Admin tab of the OrangeHRM site

  Background:
    Given I am on the OrangeHRM login page
    And the login page is fully loaded
    When I enter username "Admin"
    And I enter password "admin123"
    And I click the Login button
    Then I should be redirected to the dashboard page
    And I should see the main navigation menu


  Scenario: Testing the records table
    When I click on the admin tab
    And get the first row text