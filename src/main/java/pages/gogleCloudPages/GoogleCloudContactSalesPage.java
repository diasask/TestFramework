package pages.gogleCloudPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class GoogleCloudContactSalesPage extends BasePage {

    @FindBy(xpath = "//button[@name='SubmitButton']")
    private WebElement submitBtn;
    @FindBy(xpath = "//span[@slot='error-text-required']")
    private WebElement errorText;

    public GoogleCloudContactSalesPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudContactSalesPage clickSubmitButton() {
        waitElement(submitBtn);
        submitBtn.click();
        return new GoogleCloudContactSalesPage(webDriver);
    }

    public WebElement errorTextAppears() {
        return errorText;
    }

}