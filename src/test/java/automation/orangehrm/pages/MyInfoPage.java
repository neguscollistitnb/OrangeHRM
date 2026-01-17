package automation.orangehrm.pages;

import automation.orangehrm.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class MyInfoPage {

    public void clickOnMyInfoLink(){
        By myInfoLinkBy = By.xpath("(//a[@class='oxd-main-menu-item'])[6]");
        WebElement myInfoLink = DriverManager.getDriver().findElement(myInfoLinkBy);

        myInfoLink.click();
    }

    public List<String> getMyInfoFirstRowText(){
        By firstRowBy = By.xpath("(//div[@class='oxd-table-card'])[1]");
        WebElement firstRow = DriverManager.getDriver().findElement(firstRowBy);

        List<String> entries = Arrays.asList(firstRow.getText().split("\n"));

        return entries;
    }


}
