package automation.orangehrm.pages;

import automation.orangehrm.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPage {

    public String getTitle(){
        return DriverManager.getDriver().getTitle();
    }

    public boolean loginButtonIsDisplayed() throws InterruptedException {
        By loginButtonBy = By.xpath("//button[@type='submit']");
        DriverManager.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement loginButton = DriverManager.getDriver().findElement(loginButtonBy);

        return loginButton.isDisplayed();
    }

    public void userNameInput(String userNameInput){
        By usernameBy = By.xpath("//input[@name='username']");
         WebElement username = DriverManager.getDriver().findElement(usernameBy);

         username.sendKeys(userNameInput);
    }

    public void passwordInput(String passwordInput){
        By passwordBy = By.xpath("//input[@name='password']");
        WebElement password = DriverManager.getDriver().findElement(passwordBy);

        password.sendKeys(passwordInput);
    }

    public void clickLoginButton() {
        By loginButtonBy = By.xpath("//button[@type='submit']");
        WebElement loginButton = DriverManager.getDriver().findElement(loginButtonBy);

        loginButton.click();
    }

    public boolean alertIsDisplayed() {
        By alertBy = By.xpath("//div[@role='alert']");
        WebElement alert = DriverManager.getDriver().findElement(alertBy);

        return alert.isDisplayed();
    }
}
