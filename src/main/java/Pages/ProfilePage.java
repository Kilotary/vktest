package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends Page {

    @FindBy(className = "page_name")
    private WebElement page_name;

    @FindBy(id = "profile_edit_act")
    private WebElement profileEditButton;
    public ProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getName() {
        return page_name.getText();
    }
    public EditPageBasic toEditPageBasic() {
        profileEditButton.click();
        return new EditPageBasic(getDriver());
    }
}
