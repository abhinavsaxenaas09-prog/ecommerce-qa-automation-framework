package pages;

import base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver = DriverFactory.getDriver();

    private final By username = By.id("username");
    private final By password = By.id("password");
    private final By loginButton = By.id("login");

    public LoginPage enterUsername(String value) {
        driver.findElement(username).sendKeys(value);
        return this;
    }

    public LoginPage enterPassword(String value) {
        driver.findElement(password).sendKeys(value);
        return this;
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
