package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PhotosPage extends MainPage {
    public PhotosPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
