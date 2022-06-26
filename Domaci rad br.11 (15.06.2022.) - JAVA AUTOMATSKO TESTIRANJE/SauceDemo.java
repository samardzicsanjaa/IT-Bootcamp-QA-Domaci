package Domaci_rad_Sreda;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class SauceDemo {

    public static WebDriverManager wdm = new ChromeDriverManager();
    public static WebDriver driver;
    public static WebDriverWait wdw;

    @BeforeTest
    public void beforeTest() {
        wdm.setup();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }


    @Test(priority = 1)
    public void logInUsername1() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

    }

    @Test(priority = 2)
    public void logInUsername2() {
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement err = driver.findElement(By.className("error-button"));
        err.getText();
        Assert.assertTrue(err.isDisplayed());

    }

    @Test(priority = 3)
    public void logInUsername3() {
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

    }

    @Test(priority = 4)
    public void logInUsername4() {
        driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }


    @Test(priority = 5)
    public void sortBy() {
        logInUsername1();

        Select sorting = new Select(driver.findElement(By.className("product_sort_container")));
        sorting.selectByVisibleText("Price (low to high)");

    }

    @Test(priority = 6)
    public void add() {
        sortBy();

        //  wdw.until(ExpectedConditions.presenceOfElementLocated(By.name("add-to-cart-sauce-labs-bike-light")));
        driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();

        // wdw.until(ExpectedConditions.presenceOfElementLocated(By.className("shopping_cart_badge")));
        WebElement cart = driver.findElement(By.className("shopping_cart_badge"));
        cart.click();

        //  wdw.until(ExpectedConditions.presenceOfElementLocated(By.name("continue-shopping")));
        driver.findElement(By.name("continue-shopping")).click();

        //  wdw.until(ExpectedConditions.presenceOfElementLocated(By.name("add-to-cart-sauce-labs-onesie")));
        driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();

        //  wdw.until(ExpectedConditions.presenceOfElementLocated(By.name("add-to-cart-sauce-labs-bolt-t-shirt")));
        driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();

        //  wdw.until(ExpectedConditions.presenceOfElementLocated(By.className("shopping_cart_badge")));
        WebElement cart1 = driver.findElement(By.className("shopping_cart_badge"));
        cart1.click();

    }

    @Test(priority = 7)
    public void remove() {
        add();

        //   wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("remove-sauce-labs-bolt-t-shirt")));
        driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();

    }

    @Test(priority = 8)
    public void cancelCheckout() {
        remove();

        //  wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("checkout")));
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("sanja");
        driver.findElement(By.id("last-name")).sendKeys("samardzic");
        driver.findElement(By.id("postal-code")).sendKeys("11000");
        driver.findElement(By.id("cancel")).click();
    }

    @Test(priority = 9)
    public void checkOut() {
        remove();


        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("sanja");
        driver.findElement(By.id("last-name")).sendKeys("samardzic");
        driver.findElement(By.id("postal-code")).sendKeys("11000");

        driver.findElement(By.id("continue")).click();

        driver.findElement(By.id("finish"));
        driver.findElement(By.id("finish")).click();

        driver.findElement(By.id("back-to-products"));
        driver.findElement(By.id("back-to-products")).click();
    }

    @Test(priority = 10)
    public void button() {
        logInUsername1();

        driver.findElement(By.id("react-burger-menu-btn")).click();

    }

    @Test(priority = 11)
    public void closeX() {
        button();

        driver.findElement(By.id("react-burger-cross-btn")).click();
    }

    /*
     Ne znam zasto, ali kada pokrenem sve testove od jednom, allItems i logOut ne radi,
     i nekad radi nekad ne radi test closeX. A kada ih pokrenem odvojeno, onda svi rade. Ne znam zbog cega je tako.
    */

    @Test(priority = 12)
    public void allItems() {
        button();
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("inventory_sidebar_link")));
        driver.findElement(By.id("inventory_sidebar_link")).click();
    }

    @Test(priority = 13)
    public void logOut() {
        button();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("logout_sidebar_link")));
        driver.findElement(By.id("logout_sidebar_link")).click();
    }


    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}


