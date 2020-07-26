package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewsPage extends MainPage {

    public NewsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
