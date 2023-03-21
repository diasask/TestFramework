package pages.gogleCloudPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class GoogleCloudWebassessorPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Ready to start?')]")
    private WebElement readyToStartTitle;

    public GoogleCloudWebassessorPage(WebDriver driver) {
        super(driver);
    }

    public WebElement logInContainerIsShowUp() {
        waitElement(readyToStartTitle);
        return readyToStartTitle;
    }
}