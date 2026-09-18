package tests;

import base.BaseTest;
import base.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import listeners.TestListener;
import utils.RetryAnalyzer;

@Listeners(TestListener.class)
public class UiSmokeTest extends BaseTest {

    @Test(groups = "smoke", retryAnalyzer = RetryAnalyzer.class)
    public void browserSessionSmokeTest() {
        DriverFactory.getDriver().get("https://example.com");
        Assert.assertTrue(
            DriverFactory.getDriver().getTitle().contains("Example"),
            "Expected demo page title was not found"
        );
    }
}
