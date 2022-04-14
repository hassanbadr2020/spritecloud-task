package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;



public class scrollBars extends basePage {

    public scrollBars(WebDriver driver) {
        super(driver);
    }

    public void setScrollTop(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('body:nth-child(2) section:nth-child(2) div.container > div:nth-child(6)').scrollTop=120");
    }

    public void setScrollLeft(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('body:nth-child(2) section:nth-child(2) div.container > div:nth-child(6)').scrollLeft=200");
    }


}
