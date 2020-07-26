import Pages.AudiosPage;
import Pages.VKLoginPage;
import data.DataLoader;
import data.WebDriverGetter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlayMusic {
    @Test
    public void playMusic() {
        VKLoginPage loginPage = new VKLoginPage(WebDriverGetter.getDriver());
        AudiosPage audioPage = loginPage.login().toAudio().playSong(DataLoader.get("audio.songname"));
        Assert.assertTrue(DataLoader.get("audio.songname").toLowerCase()
                            .contains(audioPage.getNameFirstSong().toLowerCase()));
        audioPage.close();
    }
}
