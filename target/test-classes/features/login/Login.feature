Feature: OrangeHRM Login Functionality

  As a user of the OrangeHRM system
  I want to be able to log into the application
  So that I can access the HR management features

  Background:
    Given I am on the OrangeHRM login page
    And the login page is fully loaded

  Scenario: Successful login with valid credentials
    When I enter username "Admin"
    And I enter password "admin123"
    And I click the Login button
    Then I should be redirected to the dashboard page
    And I should see the main navigation menu

  Scenario Outline: Login with different credentials
    When I enter username "<username>"
    And I enter password "<password>"
    And I click the Login button
    Then I should see an error message

    Examples:
      | username | password |
      | Admin    | wrong    |
      | wrong    | admin123 |
      | wrong    | wrong    |