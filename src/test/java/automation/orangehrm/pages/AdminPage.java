package automation.orangehrm.pages;

import automation.orangehrm.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class AdminPage {

    public void clickOnAdminLink(){
        By adminLinkBy = By.xpath("(//a[@class='oxd-main-menu-item'])[1]");
        WebElement adminLink = DriverManager.getDriver().findElement(adminLinkBy);

        adminLink.click();
    }

    public List<String> getFirstRowText(){
        By firstRowBy = By.xpath("(//div[@class='oxd-table-card'])[1]");
        WebElement firstRow = DriverManager.getDriver().findElement(firstRowBy);

        List<String> entries = Arrays.asList(firstRow.getText().split("\n"));

        return entries;
    }




}
