package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ajax extends basePage {
    public ajax(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "ajaxButton")
    WebElement ajaxBtn;
    @FindBy(xpath = "//p[contains(text(),'Data loaded with AJAX get request.')]")
    WebElement hiddenElement;

    public void clickOnAjaxBtn() {
        clickButton(ajaxBtn);
    }

    public String getHiddenText() {
        return getTextElement(hiddenElement);
    }
}
