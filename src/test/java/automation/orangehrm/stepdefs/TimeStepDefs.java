package automation.orangehrm.stepdefs;

import automation.orangehrm.pages.TimePage;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class TimeStepDefs {
TimePage timePage = new TimePage();
    @When("I click on the Time tab")
    public void i_click_on_the_time_tab() {
            timePage.clickOnTimeLink();

    }

    @When("get the first row text of Time")
    public void get_the_first_row_text_of_time() {
        List<String> exceptedResults = Arrays.asList("jarin tasnim user", "2023-16-01 - 2023-22-01", "View");

        Assert.assertEquals(timePage.getTimeFirstRowText() , exceptedResults, "Time Page First Row Did Not Match");

    }
}
