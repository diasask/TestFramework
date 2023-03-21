package autoTests.googleCloudTests;

import autoTests.BaseTest;
import driver.ChromeDriverCreator;
import driver.WebDriverCreator;

import static driver.DriverSingleton.webDriver;

public abstract class GoogleCloudBaseTest extends BaseTest {

    public static final String URL = "test.url";

    public void getGoogleCloudSiteMainPage() {
        WebDriverCreator creator = new ChromeDriverCreator(); //can be edge
        webDriver = creator.createWebDriver();
        webDriver.get("https://cloud.google.com/");
    }
}