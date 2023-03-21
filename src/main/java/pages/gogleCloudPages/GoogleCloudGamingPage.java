package pages.gogleCloudPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;


public class GoogleCloudGamingPage extends BasePage {

    @FindBy(xpath = "//div[starts-with(@class,'cloud-body-text__small') and text()='Take the next step']")
    private WebElement takeNextStepTab;
    @FindBy(xpath = "//div[@class='ankle-module__buttons']/a[@track-name='contact sales']")
    private WebElement contactSalesBtn;

    public GoogleCloudGamingPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudGamingPage clickTakeNextStepTab() {
        waitElement(takeNextStepTab);
        takeNextStepTab.click();
        return new GoogleCloudGamingPage(webDriver);
    }

    public GoogleCloudContactSalesPage clickContactSalesBtn() {
        contactSalesBtn.click();
        return new GoogleCloudContactSalesPage(webDriver);
    }
}