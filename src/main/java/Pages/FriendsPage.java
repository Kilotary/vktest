package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FriendsPage extends MainPage {
    public FriendsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
