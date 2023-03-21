package pages.yopmailPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;


public class EmailCheckPage extends BasePage {

    public EmailCheckPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//td[starts-with(@style,'margin-left: 11px !important') and text()='USD 21,894.89']")
    private WebElement check;


    public WebElement checkBill() {
        waitElement(check);
        logger.info("Bill in email is not equals bill in calculator");
        return check;
    }
}
