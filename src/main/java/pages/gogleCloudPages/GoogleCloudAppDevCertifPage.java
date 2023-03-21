package pages.gogleCloudPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class GoogleCloudAppDevCertifPage extends BasePage {

    @FindBy(xpath = "//a[starts-with(@class,' cws-button')][contains(text(),'Register')]")
    private WebElement registerCertification;

    public GoogleCloudAppDevCertifPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudAppDevCertifPage clickRegisterCertification() {
        waitElement(registerCertification);
        registerCertification.click();
        return new GoogleCloudAppDevCertifPage(webDriver);
    }

    public GoogleCloudWebassessorPage switchToNewTab() {
        for (String winHandle : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(winHandle);
        }
        return new GoogleCloudWebassessorPage(webDriver);
    }
}