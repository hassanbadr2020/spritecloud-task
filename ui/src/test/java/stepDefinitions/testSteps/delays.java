package stepDefinitions.testSteps;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.ajax;
import pages.clientDelay;
import pages.homePage;
import pages.loadDelay;


public class delays extends Base {
    homePage homePage;
    ajax ajax;
    clientDelay clientDelay;
    loadDelay loadDelay;
    private Base base;


    public delays(Base base) {
        this.base = base;
    }

    @And("click on the {string} section")
    public void clickOnTheAjaxDelaySection(String flag) {
        homePage = new homePage(base.driver);
        if (flag.equals("ajax delay")) {
            homePage.clickAjaxDelay();
        } else if (flag.equals("Client Side Delay")) {
            homePage.clickClientSideDelay();
        } else if (flag.equals("load delay")) {
            homePage.clickLoadDelay();
        } else if (flag.equals("Sample App")) {
            homePage.clickSampleApp();
        }else if (flag.equals("Visibility")) {
            homePage.clickVisibility();
        }
    }

    @When("click on {string} Button")
    public void clickOnAjaxButton(String flag) {
        if (flag.equals("ajax delay")) {
            ajax = new ajax(base.driver);
            ajax.clickOnAjaxBtn();
        } else if (flag.equals("Client Side Delay")) {
            clientDelay = new clientDelay(base.driver);
            clientDelay.clickClientBtn();

        }
    }

    @Then("the message of {string} {string} is appeared after {int}")
    public void theMessageOfIsAppearedAfter(String expectedMessage, String flag, int numofsecndos) {
        if (flag.equals("ajax delay")) {
            Assert.assertEquals(expectedMessage, ajax.getHiddenText());
        } else if (flag.equals("Client Side Delay")) {
            Assert.assertEquals(expectedMessage, clientDelay.getHiddenText());

        }
    }

    @Then("the page has been loaded")
    public void thePageHasBeenLoaded() {
        loadDelay = new loadDelay(base.driver);
        Assert.assertTrue(loadDelay.isVisibleBtn());
    }
}
