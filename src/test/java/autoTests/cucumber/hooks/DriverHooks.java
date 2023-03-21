package autoTests.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import static driver.DriverSingleton.webDriver;

public class DriverHooks {

    @Before
    public void setUpDriver(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        //  webDriver = new RemoteWebDriver(new URL("http://192.168.100.5:4455/wd/hub"), chromeOptions);
        webDriver.manage().window().maximize();
    }

    @After
    public void quiteDriver(){
        webDriver.quit();
        webDriver = null;
    }
}
