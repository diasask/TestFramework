package autoTests.googleCloudTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.gogleCloudPages.GoogleCloudMainPage;
import pages.gogleCloudPages.GoogleCloudPricingCalculatorPage;
import pages.yopmailPages.EmailCheckPage;

import static driver.DriverSingleton.webDriver;

public class HardcoreTest extends GoogleCloudBaseTest{

    @Test(groups = "Smoke")
    public void checkPrisingCalculatorTest() {
        getGoogleCloudSiteMainPage();
        GoogleCloudMainPage googleCloudMainPage = new GoogleCloudMainPage(webDriver);
        GoogleCloudPricingCalculatorPage googleCloudPricingCalculatorPage = new GoogleCloudPricingCalculatorPage(webDriver);
        EmailCheckPage emailCheckPage = new EmailCheckPage(webDriver);
        googleCloudMainPage.inputInSearchField("Google Cloud Platform Pricing Calculator")
                .pricingCalculatorSearch()
                .getFrameInsideFrame()
                .chooseOperatingSystem()
                .chooseMachineType()
                .enterInfoInNumberOfInstField("4")
                .selectDownAddGpusCheckbox()
                .chooseGpuType()
                .chooseNumberOfGpu()
                .chooseSSD()
                .chooseDataCenterLocation("Fran")
                .chooseCommitedUsage()
                .addToEstimate()
                .openNewTab()
                .chooseEmailGenerator()
                .copyEmail();
        googleCloudPricingCalculatorPage.closeNewTab()
                .getFrameInsideFrame()
                .sendEstimateOnEmail()
                .openNewTabAgain()
                .emailCheck()
                .checkBill();
        Assert.assertTrue(emailCheckPage.checkBill().getText().contains("USD 21,894.89"), "Total Estimated Monthly Cost not equals cost in calculator!");

    }


}
