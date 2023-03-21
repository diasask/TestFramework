package autoTests;

import driver.DriverSingleton;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.AllureListener;

import static driver.DriverSingleton.webDriver;

@Listeners({AllureListener.class})
public abstract class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void browserSetUp() {
        webDriver = DriverSingleton.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void browserQuite() {
        DriverSingleton.closeDriver();
    }
}