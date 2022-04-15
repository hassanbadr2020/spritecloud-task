package stepDefinitions.testSteps;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.loginPage;

public class login extends Base {
    loginPage loginPage;
    private Base base;

    public login(Base base) {
        this.base = base;
    }

    @And("try to login with valid user name {string} and password {string}")
    public void tryToLoginWithValidUserNameAndPassword(String userName, String Password) {
        loginPage = new loginPage(base.driver);
        loginPage.sendUserNameAndPassword(userName, Password);
    }

    @When("click on the login button")
    public void clickOnTheLoginButton() {
        loginPage.clickOnLoginBtn();
    }

    @Then("user has been logged in successfully with {string}")
    public void userHasBeenLoggedInSuccessfullyWithWelcomeMessage(String welcomeMessage) {
        Assert.assertEquals(loginPage.getWelcomeText(), welcomeMessage);

    }
}
