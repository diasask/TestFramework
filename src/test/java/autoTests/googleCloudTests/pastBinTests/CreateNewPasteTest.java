package autoTests.googleCloudTests.pastBinTests;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.pastBinPages.AfterCreationPastePage;
import pages.pastBinPages.CreationNewPastePage;
import utils.AllureListener;

import static driver.DriverSingleton.webDriver;
@Listeners({AllureListener.class})
public class CreateNewPasteTest extends PastBinBaseTest {

    @Test(groups = "Regression")
    @Step
    public void creationNewPasteWithParamTest() {
        getPasteBinSiteMainPage();
        CreationNewPastePage creationNewPastePage = new CreationNewPastePage(webDriver);
        AfterCreationPastePage afterCreationPastePage = new AfterCreationPastePage(webDriver);
        creationNewPastePage.writeTextOfNewPaste("Hello from WebDriver");
        creationNewPastePage.choosePasteExpiration();
        creationNewPastePage.chooseTimeOfExpiration("10 Minutes");
        creationNewPastePage.writePostFormText("Test");
        creationNewPastePage.createNewPaste();
        Assert.assertTrue(afterCreationPastePage.getAfterPostingPaste().isDisplayed());
    }

    @Test(groups = "Regression")
    @Step
    public void creationNewPasteWithBashSyntaxTest() {
        getPasteBinSiteMainPage();
        CreationNewPastePage creationNewPastePage = new CreationNewPastePage(webDriver);
        AfterCreationPastePage afterCreationPastePage = new AfterCreationPastePage(webDriver);
        creationNewPastePage.writeTextOfNewPaste("git config --global user.name" + " " + "'New Sheriff in Town'" + "\n" +
                "git reset $(git commit-tree HEAD^{tree} -m 'Legacy code')" + "\n" +
                "git push origin master --force");
        creationNewPastePage.highlightTextInPaste();
        creationNewPastePage.chooseBashSyntaxInOptionalSettings();
        creationNewPastePage.writePostFormText("how to gain dominance among developers");
        creationNewPastePage.createNewPaste();
        Assert.assertTrue(afterCreationPastePage.checkPasteTitle().isDisplayed() && afterCreationPastePage.syntaxBashCheck().isDisplayed());
    }

}