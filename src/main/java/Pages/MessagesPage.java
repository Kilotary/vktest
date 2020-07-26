package Pages;

import data.DataLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagesPage extends MainPage {

    @FindBy(id = "im_dialogs")
    private WebElement dialogs;

    public MessagesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ChatPage selectChatByName() {
        WebElement chat = dialogs.findElement(By.xpath(".//span[text() = \"" + DataLoader.get("chat.name") + "\"]"));
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();"
                                                        + "window.scrollBy(0, -100);", chat);
        chat.click();
        return new ChatPage(getDriver());
    }
}