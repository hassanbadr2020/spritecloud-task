package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class visibilityPage extends basePage {
    public visibilityPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "hideButton")
    WebElement hideButton;


    @FindBy(id = "notdisplayedButton")
    WebElement invisibleButton;

    public void clickHideBtn() {
        clickButton(hideButton);
    }

    public boolean isVisible() {
        return invisibleButton.isDisplayed();

    }

}
