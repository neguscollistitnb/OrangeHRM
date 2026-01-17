package automation.orangehrm.stepdefs;

import automation.orangehrm.pages.MyInfoPage;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class MyInfoStepDefs {
    MyInfoPage myInfoPage = new MyInfoPage();

    @When("I click on the My Info tab")
    public void i_click_on_the_my_info_tab() {
        myInfoPage.clickOnMyInfoLink();
    }

    @When("get the first row text of My Info")
    public void get_the_first_row_text_of_my_info() {
        List<String> exceptedResults = Arrays.asList("test.png", "test", "53.16 kB",
                                                    "image/png", "2024-06-02", "Admin");

        Assert.assertEquals(myInfoPage.getMyInfoFirstRowText(), exceptedResults, "My Info first row does not match");
    }

}
