package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends basePage {
    public loginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "UserName")
    WebElement userName;
    @FindBy(name = "Password")
    WebElement Password;
    @FindBy(id = "login")
    WebElement loginBtn;
    @FindBy(id = "loginstatus")
    WebElement loginStatus;


    public void sendUserNameAndPassword(String user_name, String password) {
        userName.sendKeys(user_name);
        Password.sendKeys(password);
    }

    public void clickOnLoginBtn() {
        loginBtn.click();
    }
    public String getWelcomeText(){
        return loginStatus.getText();
    }
}
