import Pages.VKLoginPage;
import data.DataLoader;
import data.WebDriverGetter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {

    @Test
    public void login() {
        VKLoginPage page = new VKLoginPage(WebDriverGetter.getDriver());
        String name = page.login().toProfile().getName();
        Assert.assertEquals(DataLoader.get("profile.name"), name);
        page.close();
    }

}
