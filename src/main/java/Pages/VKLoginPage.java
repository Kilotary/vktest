package Pages;

import data.DataLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VKLoginPage extends Page {

    @FindBy(id = "index_email")
    private WebElement email;

    @FindBy(id = "index_pass")
    private WebElement password;

    @FindBy(id = "index_login_button")
    private WebElement submit;

    public VKLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        getDriver().get("http://vk.com");
    }

    public NewsPage login() {
        sendLogin();
        sendPassword();
        submit.click();
        return new NewsPage(getDriver());
    }

    private void sendLogin() {
       email.sendKeys(DataLoader.get("login"));
    }

    private void sendPassword() {
        password.sendKeys(DataLoader.get("password"));
    }
}
