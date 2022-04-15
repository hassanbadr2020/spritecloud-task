package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class clientDelay extends basePage {
    public clientDelay(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "ajaxButton")
    WebElement delayBtn;
    @FindBy(xpath = "//p[contains(text(),'Data calculated on the client side.')]")
    WebElement hiddenElement;

    public void clickClientBtn() {
        clickButton(delayBtn);
    }

    public String getHiddenText() {
        return getTextElement(hiddenElement);
    }
}
