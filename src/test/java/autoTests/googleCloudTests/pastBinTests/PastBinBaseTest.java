package autoTests.googleCloudTests.pastBinTests;

import autoTests.BaseTest;
import driver.ChromeDriverCreator;
import driver.WebDriverCreator;

import static driver.DriverSingleton.webDriver;

public abstract class PastBinBaseTest extends BaseTest {
    public void getPasteBinSiteMainPage() {
        WebDriverCreator creator = new ChromeDriverCreator();// can be edge
        webDriver = creator.createWebDriver();
        webDriver.get("https://pastebin.com/");
    }
}
