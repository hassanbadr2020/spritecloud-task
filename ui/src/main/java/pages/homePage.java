package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage {

    public homePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Scrollbars")
    WebElement scrollBar;

    @FindBy(linkText = "AJAX Data")
    WebElement ajaxDelay;

    @FindBy(linkText = "Client Side Delay")
    WebElement clientSideDelay;

    @FindBy(linkText = "Load Delay")
    WebElement loadDelay;

    @FindBy(linkText = "Sample App")
    WebElement SampleApp;


    public void clickScrollBar() {
        clickButton(scrollBar);
    }

    public void clickAjaxDelay() {
        clickButton(ajaxDelay);
    }

    public void clickClientSideDelay() {
        clickButton(clientSideDelay);
    }

    public void clickLoadDelay() {
        clickButton(clientSideDelay);
    }

    public void clickSampleApp() {
        clickButton(SampleApp);
    }
}
