package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AudiosPage extends MainPage{
    @FindBy(xpath = "//input[@id = \"audio_search\"]")
    private WebElement searchField;

    @FindBy(xpath = "//div[@data-type = \"music_audios\"]")
    private WebElement audiosList;

    public AudiosPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public AudiosPage findSong(String songName) {
        searchField.sendKeys(songName + Keys.ENTER);
        return this;
    }
    public AudiosPage playFirstSong() {
        WebElement song = getDriver().findElement(
                By.xpath("//div[h2[text() = \"All music\"]]//following-sibling::div//div[@tabindex = \"0\"][1]"));
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(false);", song);
        song.click();
        return this;
    }

    public synchronized AudiosPage playSong(String songName) {
        findSong(songName);
        try {
            wait(2000);
        } catch(InterruptedException ignored) {}
        playFirstSong();
        return this;
    }

    public String getNameFirstSong() {
        return getDriver().findElement(By.xpath("//div[h2[text() = \"All music\"]]" +
                "//following-sibling::div//div[@tabindex = 0][1]//" +
                "span[@class = \"audio_row__title_inner _audio_row__title_inner\"]")).getText();
    }
}
