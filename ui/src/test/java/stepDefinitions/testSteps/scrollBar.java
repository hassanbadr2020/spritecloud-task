package stepDefinitions.testSteps;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.homePage;
import pages.scrollBars;

public class scrollBar extends Base {
    private Base base;
    pages.homePage homePage;
    pages.scrollBars scrollBars;

    public scrollBar(Base base) {
        this.base = base;
    }

    @Given("User in the home age of {string}")
    public void userInTheHomeAgeOf(String urlText) {
        System.out.println(base.driver.getCurrentUrl());
        Assert.assertTrue(base.driver.getCurrentUrl().contains(urlText));
    }

    @And("click on the ScrollBar section")
    public void clickOnTheScrollBarSection() {
        homePage = new homePage(base.driver);
        homePage.clickScrollBar();
    }


    @When("Update scrollTop and scrollRight automatically of the hidden area.")
    public void updateScrollTopAndScrollRightAutomaticallyOfTheHiddenArea() {
        scrollBars = new scrollBars(base.driver);
        scrollBars.setScrollTop(base.driver);
        scrollBars.setScrollLeft(base.driver);

    }

    @Then("the button is visible now")
    public void theButtonIsVisibleNow() {
        Assert.assertTrue(scrollBars.checkVisibilityBtn());

    }
}
