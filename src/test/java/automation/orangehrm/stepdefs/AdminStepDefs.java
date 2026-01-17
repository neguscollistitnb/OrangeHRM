package automation.orangehrm.stepdefs;

import automation.orangehrm.pages.AdminPage;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class AdminStepDefs {

    AdminPage admin = new AdminPage();

    @When("I click on the admin tab")
    public void i_click_on_the_admin_tab() {
        admin.clickOnAdminLink();
    }

    @When("get the first row text")
    public void get_the_first_row_text() {
        List<String> exceptedEntry = Arrays.asList("Admin", "Admin", "first name user", "Enabled");
        Assert.assertEquals(admin.getFirstRowText(), exceptedEntry, "Admin table entry does not match");

    }
}
