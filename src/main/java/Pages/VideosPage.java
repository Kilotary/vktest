package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class VideosPage extends MainPage {
    public VideosPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
