package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverFactory {
    private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();

    private DriverFactory() {}

    public static void startDriver() {
        DRIVER.set(new ChromeDriver());
        getDriver().manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return DRIVER.get();
    }

    public static void quitDriver() {
        if (getDriver() != null) {
            getDriver().quit();
            DRIVER.remove();
        }
    }
}
