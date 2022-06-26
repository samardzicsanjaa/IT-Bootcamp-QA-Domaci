package Domaci_rad_Za_nedelju;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestYouTube {

    /*
    Automatizovati youtube kroz sledece zahteve:
    Otici na sajt youtube
    U search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
     */

    private static WebDriverManager wdm = new ChromeDriverManager();
    private static WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        wdm.setup();
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void goToYouTube() {
        driver.navigate().to("https://www.youtube.com/");
        assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/");

    }


    @Test
    public void searchSong() {
        goToYouTube();

        WebElement search = driver.findElement(By.cssSelector("input[id=\"search\"]"));
        search.click();
        search.sendKeys("Rick Astley");
        assertEquals(search.getAttribute("value"), "Rick Astley");
        search.sendKeys(Keys.ENTER);

    }

    @Test
    public void playSong() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));

        searchSong();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Rick Astley - Never Gonna Give You Up (Official Music Video)")));
        WebElement song = driver.findElement(By.linkText("Rick Astley - Never Gonna Give You Up (Official Music Video)"));
        song.click();
        assertTrue(song.isDisplayed());


    }

    @AfterTest
    public void quit() {
        driver.quit();
    }


}
