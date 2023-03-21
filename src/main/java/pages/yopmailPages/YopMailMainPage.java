package pages.yopmailPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.time.Duration;

public class YopMailMainPage extends BasePage {

    public YopMailMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[starts-with(@title,'Генератор Одноразовых')]")
    private WebElement emailGenerator;
    @FindBy(xpath = "//span[@class='notmobile'][contains(text(),'Скопировать в буфер обмена')]")
    private WebElement copyEmail;
    @FindBy(xpath = "//span[text()='Проверить почту']")
    private WebElement checkEmailBtn;

    public YopMailMainPage chooseEmailGenerator() {
        waitElement(emailGenerator);
        emailGenerator.click();
        logger.info("Email generator button is clicked");
        return new YopMailMainPage(webDriver);
    }

    public YopMailMainPage copyEmail() {
        copyEmail.click();
        logger.info("Copy email button is clicked");
        return new YopMailMainPage(webDriver);
    }

    public EmailCheckPage emailCheck() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        checkEmailBtn.click();
        logger.info("Check email button is clicked");
        return new EmailCheckPage(webDriver);
    }


}
