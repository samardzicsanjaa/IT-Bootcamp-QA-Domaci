package Domaci_rad_Za_nedelju;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

public class Demoblaza {


    private static WebDriverManager wdm;
    private static WebDriver driver;
    private static WebDriverWait wdw;

    @BeforeTest
    public void setUpTest() {
        wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
        wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @BeforeMethod
    public void setUpMethod() {
        driver.navigate().to("https://www.demoblaze.com/index.html");
    }

    @Test
    public void addPhone() throws InterruptedException {
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Samsung galaxy s6")));
        WebElement click = driver.findElement(By.linkText("Samsung galaxy s6"));
        click.click();
        assertEquals(driver.getCurrentUrl(), "https://www.demoblaze.com/prod.html?idp_=1");

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add to cart")));
        Thread.sleep(3000);
        WebElement add = driver.findElement(By.linkText("Add to cart"));
        add.click();
        Assert.assertTrue(true);
        Thread.sleep(1000);
        driver.switchTo().alert().accept();


    }


    @Test
    public void goToCart() throws InterruptedException {
        addPhone();
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Cart")));
        WebElement cart = driver.findElement(By.linkText("Cart"));
        cart.click();
        assertEquals(driver.getCurrentUrl(), "https://www.demoblaze.com/cart.html");

    }

    @Test
    public void deletePhone() throws InterruptedException {
        goToCart();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Delete")));
        WebElement delete = driver.findElement(By.linkText("Delete"));
        delete.click();
        Assert.assertTrue(true);
    }

    @Test
    public void clickMonitors() {
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Monitors")));
        WebElement monitors = driver.findElement(By.linkText("Monitors"));
        monitors.click();
        assertEquals(driver.getCurrentUrl(), "https://www.demoblaze.com/index.html#");
    }

    @Test
    public void addMonitor() throws InterruptedException {
        clickMonitors();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("ASUS Full HD")));
        WebElement monitor = driver.findElement(By.linkText("ASUS Full HD"));
        monitor.click();
        assertEquals(driver.getCurrentUrl(), "https://www.demoblaze.com/prod.html?idp_=14");

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add to cart")));
        WebElement add = driver.findElement(By.linkText("Add to cart"));
        add.click();
        Assert.assertTrue(true);
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    }

    @Test
    public void goToCart2() throws InterruptedException {
        addMonitor();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Cart")));
        WebElement cart = driver.findElement(By.linkText("Cart"));
        cart.click();
        assertEquals(driver.getCurrentUrl(), "https://www.demoblaze.com/cart.html");
    }

    @Test
    public void deleteMonitor() throws InterruptedException {
        goToCart2();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Delete")));
        WebElement delete = driver.findElement(By.linkText("Delete"));
        delete.click();
        Assert.assertTrue(true);

    }


    @AfterTest
    public void quit() {
        driver.quit();
    }


}

