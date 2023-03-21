package pages.pastBinPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AfterCreationPastePage extends BasePage {

    public AfterCreationPastePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='de1']")
    private WebElement afterPostingPaste;
    @FindBy(xpath = "//div[@class='info-top']/child::h1[text()='how to gain dominance among developers']")
    private WebElement pagePasteTitle;
    @FindBy(xpath = "//div[@class='top-buttons']/child::div/child::a[@class='btn -small h_800' and text()='Bash']")
    private WebElement syntaxBash;
    @FindBy(xpath = "//ol[@class='bash']")
    private WebElement createdPaste;


    public WebElement getAfterPostingPaste() {
        waitElement(afterPostingPaste);
        return afterPostingPaste;
    }

    public WebElement checkPasteTitle() {
        waitElement(pagePasteTitle);
        return pagePasteTitle;
    }

    public WebElement syntaxBashCheck() {
        waitElement(syntaxBash);
        return syntaxBash;
    }

    public WebElement createdPasteCheck() {
        waitElement(createdPaste);
        return createdPaste;
    }
}
