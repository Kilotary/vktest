import Pages.ChatPage;
import Pages.VKLoginPage;
import data.DataLoader;
import data.WebDriverGetter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SendMessage {
    @Test
    public void sendMessageTest() {
         VKLoginPage loginPage = new VKLoginPage(WebDriverGetter.getDriver());
         ChatPage chatPage = loginPage.login()
                            .toMessage()
                            .selectChatByName()
                             .sendMessage();

         Assert.assertEquals(DataLoader.get("chat.message"), chatPage.getLastMessage());

    }
}
