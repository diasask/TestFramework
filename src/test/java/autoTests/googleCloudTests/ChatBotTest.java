package autoTests.googleCloudTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.gogleCloudPages.GoogleCloudContactPage;
import pages.gogleCloudPages.GoogleCloudMainPage;

import static driver.DriverSingleton.webDriver;

public class ChatBotTest extends GoogleCloudBaseTest {

    @Test(groups = "Regression")
    public void checkAppearingChatBot() {
        getGoogleCloudSiteMainPage();
        GoogleCloudMainPage googleCloudMainPage = new GoogleCloudMainPage(webDriver);
        GoogleCloudContactPage googleCloudContactPage = googleCloudMainPage
                .talkToUsBtnClick()
                .chooseChatWitsUsBtn();
        Assert.assertTrue(googleCloudContactPage.chatBotIsOpen().isDisplayed(),"ChetBot is not displayed! ");
    }
}
