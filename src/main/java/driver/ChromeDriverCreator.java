package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static driver.DriverSingleton.webDriver;

public class ChromeDriverCreator implements WebDriverCreator  {

    protected static ChromeOptions chromeOptions = new ChromeOptions();

    @Override
    public WebDriver createWebDriver()  {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        //  webDriver = new RemoteWebDriver(new URL("http://192.168.100.5:4455/wd/hub"), chromeOptions);
        webDriver.manage().window().maximize();
        return webDriver;
    }

}
