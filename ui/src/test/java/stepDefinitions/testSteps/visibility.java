package stepDefinitions.testSteps;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.visibilityPage;

public class visibility extends Base {
    visibilityPage visibility;
    private Base base;

    public visibility(Base base) {
        this.base = base;
    }


    @And("click on hide button")
    public void clickOnHideButton() {
        visibility = new visibilityPage(base.driver);
        visibility.clickHideBtn();

    }

    @Then("the visibility button not displayed")
    public void theVisibilityButtonNotDisplayed() {
        Assert.assertFalse(visibility.isVisible());
    }
}
