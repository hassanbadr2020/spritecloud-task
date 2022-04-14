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

    public void clickScrollBar() {
        clickButton(scrollBar);
    }
}
