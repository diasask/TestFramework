package pages.gogleCloudPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.CustomActionDriver;
import pages.yopmailPages.YopMailMainPage;


public class GoogleCloudPricingCalculatorPage extends BasePage {

    @FindBy(xpath = "//input[@ng-model='listingCtrl.soleTenant.nodesCount']")
    private WebElement numbOfInstancesField;
    @FindBy(xpath = "//*[@id='cloud-site']/devsite-iframe/iframe")
    private WebElement checkingFrame;
    @FindBy(xpath = "//*[@id='myFrame']")
    private WebElement insideFrameFrame;
    @FindBy(xpath = "//md-select[@ng-model='listingCtrl.computeServer.os']")
    private WebElement operatingSystemField;
    @FindBy(xpath = "//div[@class='md-text'][contains(text(),'Ubuntu Pro')]")
    private WebElement chooseUbuntuPro;
    @FindBy(xpath = "//md-select[@ng-model='listingCtrl.computeServer.instance']")
    private WebElement machineTypeField;
    @FindBy(xpath = "//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-E2-STANDARD-8']")
    private WebElement chooseStandardMachineType;
    @FindBy(xpath = "//md-checkbox[@ng-model='listingCtrl.soleTenant.addGPUs'][starts-with(@ng-disabled,'!(listingCtrl.soleTenant.nodeType')]")
    private WebElement addGpusCheckbox;
    @FindBy(xpath = "//h2[@class='md-title' and text()='Sole-tenant nodes']")
    private WebElement titleSoleTenantNodes;
    @FindBy(xpath = "//md-select[@placeholder='GPU type']")
    private WebElement gpuTypeField;
    @FindBy(xpath = "//md-option[@value='NVIDIA_TESLA_P4']")
    private WebElement nvidiaGpuType;
    @FindBy(xpath = "//md-select[@placeholder='Number of GPUs']")
    private WebElement numberOfGpuField;
    @FindBy(xpath = "//md-option[@ng-value='item.value' and @value='4']")
    private WebElement chooseNumberOfGpu;
    @FindBy(xpath = "//md-select[@ng-model='listingCtrl.soleTenant.ssd']")
    private WebElement localSSDField;
    @FindBy(xpath = "//div[@class='md-text'][contains(text(),'24x375 GB')]")
    private WebElement chooseLocalSSD;
    @FindBy(xpath = "//md-select[@ng-model='listingCtrl.soleTenant.location']")
    private WebElement dataCenterLocationField;
    @FindBy(xpath = "//label[@ng-click='delegateClick()']/following-sibling::input[@ng-model='listingCtrl.inputRegionText.soleTenant']")
    private WebElement searchRegionField;
    @FindBy(xpath = "//md-option[@value='europe-west3' and @id='select_option_285']/child::div[@class='md-text ng-binding'][contains(text(),'Frankfurt')]")
    private WebElement chooseFrankfurt;
    @FindBy(xpath = "//md-select-value[@id='select_value_label_130']")
    private WebElement commitedUsageField;
    @FindBy(xpath = "//md-option[@id='select_option_150']/div[@class='md-text']")
    private WebElement chooseCommitedUsage;
    @FindBy(xpath = "//button[@aria-label='Add to Estimate'][starts-with(@ng-click,'listingCtrl.soleTenant.submitted = true')]")
    private WebElement addToEstimateBtn;
    @FindBy(xpath = "//div[starts-with(@class,'md-list-item-text')][contains(text(),'Instance type: n1-node-96-624')]")
    private WebElement estimateListInstanceTypeField;
    @FindBy(xpath = "//md-list-item[@role='listitem']/child::div[@class='md-list-item-text ng-binding'][contains(text(),'Region: Frankfurt')]")
    private WebElement estimateListRegionField;
    @FindBy(xpath = "//div[starts-with(@class,'md-list-item-text')][contains(text(),' Local SSD: 24x375 GiB')]")
    private WebElement estimateListLocalSSDField;
    @FindBy(xpath = "//md-list-item[@role='listitem']/child::div[@class='md-list-item-text ng-binding'][contains(text(),'Commitment term: 1 Year')]")
    private WebElement estimateListCommitedTermField;
    @FindBy(xpath = "//h2[@class='md-title']/b[@class='ng-binding'][contains(text(),'USD 22,535.76')]")
    private WebElement totalCostManualTest;
    @FindBy(xpath = "//*[@id='email_quote']")
    private WebElement emailBtn;
    @FindBy(xpath = "//input[@name='description' and @type='email']")
    private WebElement enterEmail;
    @FindBy(xpath = "//button[@aria-label='Send Email']")
    private WebElement sendEmailInWindow;

    public GoogleCloudPricingCalculatorPage(WebDriver webDriver) {
        super(webDriver);
    }

    public YopMailMainPage openNewTab() {
        webDriver.switchTo().newWindow(WindowType.TAB).get("https://yopmail.com/ru/");
        logger.info("New tab Yopmail.com is opened");
        return new YopMailMainPage(webDriver);
    }

    public GoogleCloudPricingCalculatorPage getFrameInsideFrame() {
        waitElement(checkingFrame);
        webDriver = new CustomActionDriver(webDriver);
        webDriver.switchTo().frame(checkingFrame);
        webDriver.switchTo().frame(insideFrameFrame);
        return new GoogleCloudPricingCalculatorPage(webDriver);
    }

    public GoogleCloudPricingCalculatorPage enterInfoInNumberOfInstField(String number) {
        numbOfInstancesField.click();
        numbOfInstancesField.sendKeys(number);
        logger.info("Number of instances field is filled! ");
        return new GoogleCloudPricingCalculatorPage(webDriver);
    }

    public GoogleCloudPricingCalculatorPage chooseOperatingSystem() {
        operatingSystemField.click();
        waitElement(chooseUbuntuPro);
        chooseUbuntuPro.click();
        logger.info("Operation system field is filled! ");
        return new GoogleCloudPricingCalculatorPage(webDriver);
    }

    public GoogleCloudPricingCalculatorPage chooseMachineType() {
        machineTypeField.click();
        waitElement(chooseStandardMachineType);
        chooseStandardMachineType.click();
        logger.info("Machine type field is filled! ");
        return new GoogleCloudPricingCalculatorPage(webDriver);
    }

    public GoogleCloudPricingCalculatorPage selectDownAddGpusCheckbox() {
        waitElement(addGpusCheckbox);
        addGpusCheckbox.click();
        logger.info("Add GPU checkbox is marked!");
        return new GoogleCloudPricingCalculatorPage(webDriver);
    }

    public GoogleCloudPricingCalculatorPage chooseGpuType() {
        scrollTO(titleSoleTenantNodes);
        logger.info("Page is scroll to Sole Tenant Nodes field");
        gpuTypeField.click();
        waitElement(nvidiaGpuType);
        nvidiaGpuType.click();
        logger.info("Gpu type field is filled!");
        return new GoogleCloudPricingCalculatorPage(webDriver);
    }

    public GoogleCloudPricingCalculatorPage chooseNumberOfGpu() {
        scrollTO(titleSoleTenantNodes);
        logger.info("Page is scroll to Sole Tenant Nodes field");
        numberOfGpuField.click();
        waitElement(chooseNumberOfGpu);
        chooseNumberOfGpu.click();
        logger.info("Number of GPU field is filled!");
        return new GoogleCloudPricingCalculatorPage(webDriver);
    }

    public GoogleCloudPricingCalculatorPage chooseSSD() {
        localSSDField.click();
        waitElement(chooseLocalSSD);
        chooseLocalSSD.click();
        logger.info("Local SSD field is filled!");
        return new GoogleCloudPricingCalculatorPage(webDriver);
    }

    public GoogleCloudPricingCalculatorPage chooseDataCenterLocation(String region) {
        dataCenterLocationField.click();
        waitElement(searchRegionField);
        searchRegionField.click();
        searchRegionField.sendKeys(region);
        chooseFrankfurt.click();
        logger.info("Region field is filled!");
        return new GoogleCloudPricingCalculatorPage(webDriver);
    }

    public GoogleCloudPricingCalculatorPage chooseCommitedUsage() {
        waitElement(dataCenterLocationField);
        commitedUsageField.click();
        waitElement(chooseCommitedUsage);
        chooseCommitedUsage.click();
        logger.info("Commited usage field is filled!");
        return new GoogleCloudPricingCalculatorPage(webDriver);
    }

    public GoogleCloudPricingCalculatorPage addToEstimate() {
        waitElement(addToEstimateBtn);
        addToEstimateBtn.click();
        logger.info("Add estimate button is clicked");
        return new GoogleCloudPricingCalculatorPage(webDriver);
    }

    public GoogleCloudPricingCalculatorPage sendEstimateOnEmail() {
        waitElement(emailBtn);
        emailBtn.click();
        enterEmail.click();
        logger.info("Email button is clicked and email field is trigger");
        enterEmail.sendKeys(Keys.CONTROL, "v");
        logger.info("Email is paste in email field");
        sendEmailInWindow.click();
        logger.info("Bill is sending on email");
        return new GoogleCloudPricingCalculatorPage(webDriver);
    }

    public GoogleCloudPricingCalculatorPage closeNewTab() {
        for (String winHandle : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(winHandle);
            break;
        }
        logger.info("Yopmail window is switched back to pricing calculator page");
        return new GoogleCloudPricingCalculatorPage(webDriver);
    }


    public YopMailMainPage openNewTabAgain() {
        for (String winHandle : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(winHandle);
        }
        logger.info("Window is switched on Yopmail page again");
        return new YopMailMainPage(webDriver);
    }

    public WebElement estimateFieldInstanceTypeCheck() {
        return estimateListInstanceTypeField;
    }

    public WebElement estimateFieldRegionCheck() {
        return estimateListRegionField;
    }

    public WebElement estimateFieldSSDCheck() {
        return estimateListLocalSSDField;
    }

    public WebElement estimateFieldCommitedTermCheck() {
        return estimateListCommitedTermField;
    }

    public WebElement checkCurrentTotalCostAndManualTotalCost() {
        return totalCostManualTest;
    }

}