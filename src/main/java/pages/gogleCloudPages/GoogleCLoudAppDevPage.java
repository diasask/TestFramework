package pages.gogleCloudPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class GoogleCLoudAppDevPage extends BasePage {

    @FindBy(xpath = "//button[starts-with(@class,'cloud-button')]")
    private WebElement pickYourPathBtn;
    @FindBy(xpath = "//a[@track-name='Cloud Developer']")
    private WebElement dropDownMenuCloudDevs;
    @FindBy(xpath = "//span[starts-with(@class,'cloud-link')][contains(text(),'Learn more')][1]")
    private WebElement certificationBtn;

    public GoogleCLoudAppDevPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCLoudAppDevPage chooseDevPath() {
        waitElement(pickYourPathBtn);
        pickYourPathBtn.click();
        waitElement(dropDownMenuCloudDevs);
        dropDownMenuCloudDevs.click();
        return new GoogleCLoudAppDevPage(webDriver);
    }

    public GoogleCloudAppDevCertifPage getCertification() {
        certificationBtn.click();
        return new GoogleCloudAppDevCertifPage(webDriver);
    }
}