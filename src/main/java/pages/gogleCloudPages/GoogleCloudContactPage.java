package pages.gogleCloudPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class GoogleCloudContactPage extends BasePage {

    @FindBy(xpath = "//a[@track-name='chat online with us']")
    private WebElement chatWithUsBtn;
    @FindBy(xpath = "//div[@id='cloud-chatbot-header']")
    private WebElement chatBot;

    public GoogleCloudContactPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudContactPage chooseChatWitsUsBtn() {
        pause(chatWithUsBtn);
        highlightElement(chatWithUsBtn);
        doubleClick(chatWithUsBtn);
        return new GoogleCloudContactPage(webDriver);
    }

    public WebElement chatBotIsOpen() {
        waitElement(chatBot);
        highlightElement(chatBot);
        return chatBot;
    }
}