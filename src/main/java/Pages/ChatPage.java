package Pages;

import data.DataLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPage extends MainPage {

    @FindBy(id = "im_editable0")
    private WebElement textBox;
    @FindBy(xpath = "//div[@class = \"_im_peer_history im-page-chat-contain\"]")
    private WebElement messages;

    public ChatPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ChatPage sendMessage() {

        textBox.sendKeys(DataLoader.get("chat.message") + Keys.ENTER);
        return this;
    }

    public String getLastMessage() {
        return messages.findElement(By.xpath("./div[last()]/div[2]/ul/li[last()]/div[3]")).getText();
    }
}
