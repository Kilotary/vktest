package Pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends Page {
    private SideBar sideBar;

    public MainPage(WebDriver driver) {
        super(driver);
        sideBar = new SideBar(getDriver());
    }

    public ProfilePage toProfile() {
        sideBar.profileClick();
        return new ProfilePage(getDriver());
    }

    public NewsPage toNews() {
        sideBar.newsClick();
        return new NewsPage(getDriver());
    }

    public MessagesPage toMessage() {
        sideBar.messagesClick();
        return new MessagesPage(getDriver());
    }

    public FriendsPage toFriends() {
        sideBar.friendsClick();
        return new FriendsPage(getDriver());
    }

    public GroupsPage toGroups() {
        sideBar.groupsClick();
        return new GroupsPage(getDriver());
    }

    public PhotosPage toPhotos() {
        sideBar.photos();
        return new PhotosPage(getDriver());
    }

    public AudiosPage toAudio() {
        sideBar.audiosClick();
        return new AudiosPage(getDriver());
    }

    public VideosPage toVideos() {
        sideBar.videosClick();
        return new VideosPage(getDriver());
    }

    public AppsPage toApp() {
        sideBar.appsClick();
        return new AppsPage(getDriver());
    }

}
