package automation.orangehrm.pages;

import automation.orangehrm.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dashboard {

    public boolean isDashboardDisplayed(){
        By dashboardTextBy = By.xpath("//span[@class='oxd-topbar-header-breadcrumb']");
        WebElement dashboardText = DriverManager.getDriver().findElement(dashboardTextBy);

        return  dashboardText.isDisplayed();
    }

    public boolean isSidePanelDisplayed(){
        By sidePanelBy = By.xpath("//div[@class='oxd-sidepanel-body']");
        WebElement sidePanel = DriverManager.getDriver().findElement(sidePanelBy);

        return  sidePanel.isDisplayed();
    }

}
