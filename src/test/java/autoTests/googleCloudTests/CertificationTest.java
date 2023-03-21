package autoTests.googleCloudTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.gogleCloudPages.GoogleCloudMainPage;
import pages.gogleCloudPages.GoogleCloudWebassessorPage;

import static driver.DriverSingleton.webDriver;

public class CertificationTest extends GoogleCloudBaseTest {

    @Test(groups = "Smoke")
    public void checkingAbilityToRegistrOnCertificationTest() throws InterruptedException {
        getGoogleCloudSiteMainPage();
        GoogleCloudMainPage googleCloudMainPage = new GoogleCloudMainPage(webDriver);
        GoogleCloudWebassessorPage googleCloudWebassessorPageg =  googleCloudMainPage.gettingStartTabClick()
                .chooseTraining()
                .learningPathBtnClick()
                .appDevChoose()
                .chooseDevPath()
                .getCertification()
                .clickRegisterCertification()
                .switchToNewTab();
        Assert.assertTrue(googleCloudWebassessorPageg.logInContainerIsShowUp().isDisplayed(),"Login is nor showing up!");


    }
}
