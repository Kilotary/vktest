package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AppsPage extends MainPage {
    public AppsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
