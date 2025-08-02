package automation.orangehrm.stepdefs;

import automation.orangehrm.pages.Dashboard;
import automation.orangehrm.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    Dashboard dashboard = new Dashboard();

    @Given("I am on the OrangeHRM login page")
    public void i_am_on_the_orange_hrm_login_page() {
        String actualTitle =  loginPage.getTitle();
        String exceptedTitle = "OrangeHRM";

        Assert.assertEquals(actualTitle, exceptedTitle , "User is not on the login page");

    }
    @And("the login page is fully loaded")
    public void the_login_page_is_fully_loaded() throws InterruptedException {
        Assert.assertTrue(loginPage.loginButtonIsDisplayed(), "Login Page is not fully loaded");
    }
    @When("I enter username {string}")
    public void i_enter_username(String userName) {
        loginPage.userNameInput(userName);
    }
    @And("I enter password {string}")
    public void i_enter_password(String password) {
        loginPage.passwordInput(password);
    }
    @And("I click the Login button")
    public void i_click_the_login_button() {
        loginPage.clickLoginButton();
    }
    @Then("I should be redirected to the dashboard page")
    public void i_should_be_redirected_to_the_dashboard_page() {
        Assert.assertTrue(dashboard.isDashboardDisplayed(), "User is not on the Dashboard page");
    }
    @And("I should see the main navigation menu")
    public void i_should_see_the_main_navigation_menu() {
        Assert.assertTrue(dashboard.isSidePanelDisplayed(), "The side panel menu is not being displayed");
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        Assert.assertTrue(loginPage.alertIsDisplayed(), "No error message found");
    }


}
