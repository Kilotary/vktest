package data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class WebDriverGetter {

    public static WebDriver getDriver() {
        WebDriver driver;

        System.setProperty("webdriver." + DataLoader.get("webdriver.name") +".driver",
                DataLoader.get("webdriver.path"));

        if (DataLoader.get("webdriver.name").equals("chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        return driver;
    }
}
