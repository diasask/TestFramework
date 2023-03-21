package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class CustomActionDriver implements WebDriver{

    public Logger logger = LogManager.getRootLogger();

    protected WebDriver driver;

    public CustomActionDriver(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void get(String url) {
        logger.info("Webdriver is open url.");
        driver.get(url);
    }

    @Override
    public String getCurrentUrl() {
        logger.info("Return url of the currently opened web page in the browser.");
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        logger.info("Return title of currently opened web page.");
        return driver.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        logger.info("Return an object of type WebElement.");
        return driver.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        logger.info("Return an object of type WebElement.");
        return driver.findElement(by);
    }

    @Override
    public String getPageSource() {
        logger.info("Return Page source of currently opened web page.");
        return driver.getPageSource();
    }

    @Override
    public void close() {
        logger.info("Webdriver is closed current window.");
        driver.close();
    }

    @Override
    public void quit() {
        logger.info("Webdriver is disabled");
        driver.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        logger.info("Returns GU ID of all the browsers present at the moment, which are opened by the current driver.");
        return driver.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        logger.info("Returns address of the active browser.");
        return driver.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        logger.info("Switching between frames.");
        return driver.switchTo();
    }

    @Override
    public Navigation navigate() {
        logger.info("Navigate to particular URL and does not wait to page load.");
        return driver.navigate();
    }

    @Override
    public Options manage() {
        logger.info("Manage browser.");
        return driver.manage();
    }

}
