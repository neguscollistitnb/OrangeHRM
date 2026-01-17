package automation.orangehrm.pages;

import automation.orangehrm.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class TimePage {

    public void clickOnTimeLink(){
        By timeLinkBy = By.xpath("(//a[@class='oxd-main-menu-item'])[4]");
        WebElement timeLink = DriverManager.getDriver().findElement(timeLinkBy);

        timeLink.click();
    }

    public List<String> getTimeFirstRowText(){
        By timeRowBy = By.xpath("(//div[@role='row'])[2]");
        WebElement timeRow = DriverManager.getDriver().findElement(timeRowBy);

        List<String> entries = Arrays.asList(timeRow.getText().split("\n"));

        return entries;
    }
}
