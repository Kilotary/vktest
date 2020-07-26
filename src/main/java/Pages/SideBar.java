package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideBar extends Composite {

    @FindBy(id = "l_pr")
    private WebElement profile;

    @FindBy(id = "l_nwsf")
    private WebElement news;

    @FindBy(id = "l_msg")
    private WebElement messages;

    @FindBy(id = "l_fr")
    private WebElement friends;

    @FindBy(id = "l_gr")
    private WebElement groups;

    @FindBy(id = "l_ph")
    private WebElement photos;

    @FindBy(id = "l_aud")
    private WebElement audios;

    @FindBy(id = "l_vid")
    private WebElement videos;

    @FindBy(id = "l_ap")
    private WebElement apps;

    public SideBar(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void profileClick() {
        profile.click();
    }

    public void newsClick() {
        news.click();
    }

    public void messagesClick() {
        messages.click();
    }

    public void friendsClick() {
        friends.click();
    }

    public void groupsClick() {
        groups.click();
    }

    public void photos() {
        photos.click();
    }

    public void audiosClick() {
        audios.click();
    }

    public void videosClick() {
        videos.click();
    }

    public void appsClick() {
        apps.click();
    }

}
