package base;

import environments.handler.DataManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class Base {
    public WebDriver driver;
    DataManager dataManager = new DataManager();

    public void startBrowser() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        driver = new ChromeDriver(options);

        Dimension initial_size = driver.manage().window().getSize();
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to(dataManager.getUIUrl());

    }

    public void tearBrowser() {
        driver.quit();
    }

}
