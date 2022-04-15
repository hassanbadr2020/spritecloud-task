package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loadDelay extends basePage {
    public loadDelay(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "body:nth-child(2) section:nth-child(2) div.container > button.btn.btn-primary:nth-child(6)")
    WebElement btnAppearAfterLoad;

    public boolean isVisibleBtn() {
        return btnAppearAfterLoad.isDisplayed();
    }


}
