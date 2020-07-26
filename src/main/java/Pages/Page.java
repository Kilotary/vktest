package Pages;

import org.openqa.selenium.WebDriver;

public class Page {
    private WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void close() {
        driver.close();
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
