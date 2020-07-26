package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditPageBasic extends EditPage {

    @FindBy(id = "petite_home_town")
    private WebElement homeTown;

    public EditPageBasic(WebDriver driver) {
        super(driver);
    }
}
