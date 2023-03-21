package autoTests.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.pastBinPages.AfterCreationPastePage;
import pages.pastBinPages.CreationNewPastePage;

import static driver.DriverSingleton.webDriver;

public class PasteBinStepDefs {

   public CreationNewPastePage creationNewPastePage = new CreationNewPastePage(webDriver);
   public AfterCreationPastePage afterCreationPastePage = new AfterCreationPastePage(webDriver);

    @Given("User open pastBin site")
    public void openPastBinSite() {
      creationNewPastePage.openPasteBinWebsite();
    }

    @When("User write text in paste {string}")
    public void writeTextInPaste(String textOfPaste) {
        creationNewPastePage.writeTextOfNewPaste(textOfPaste);
    }

    @And("^User choose paste expiration ([^\\\"]*)$")
    public void choosePasteExpiration(String expiration) {
        creationNewPastePage.choosePasteExpiration();
        creationNewPastePage.chooseTimeOfExpiration(expiration);
    }

    @And("User write title of the paste {string}")
    public void writeTitleOfThePaste(String title) {
        creationNewPastePage.writePostFormText(title);
    }

    @And("User create new paste")
    public void createNewPaste() {
        creationNewPastePage.createNewPaste();
    }

    @Then("New paste is created")
    public void verifyPasteIsCreated() {
        Assert.assertTrue(afterCreationPastePage.getAfterPostingPaste().isDisplayed());
    }

    @And("User choose highlight syntax in bash")
    public void userChooseHighlightSyntaxInBash() {
        creationNewPastePage.highlightTextInPaste();
        creationNewPastePage.chooseBashSyntaxInOptionalSettings();
    }
}
