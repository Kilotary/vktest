package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Composite {
    private WebDriver driver;

    public Composite(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return  driver;
    }
}
