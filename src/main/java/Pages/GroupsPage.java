package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GroupsPage extends MainPage{
    public GroupsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
