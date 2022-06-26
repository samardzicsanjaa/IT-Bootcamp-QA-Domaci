package Domaci_rad_Sreda;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class KatalonShop {


    WebDriverManager wdm;
    WebDriver driver;
    WebDriverWait wdw;


    @BeforeTest
    public void beforeTest() {
        wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
        wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.navigate().to("https://cms.demo.katalon.com/cart/");
    }


    @Test
    public void shop() {
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"primary-menu\"]/ul/li[5]/a")));
        driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[5]/a")).click();

        //  wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"select2-orderby-1j-container\"]"))).click();

        Select sorting = new Select(driver.findElement(By.name("orderby")));

        // sorting.selectByVisibleText("Sort by latest");
        sorting.selectByVisibleText("Sort by popularity");
    }

    @Test
    public void add() throws InterruptedException {
        shop();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body.home.archive.post-type-archive.post-type-archive-product.theme-ellie.woocommerce.woocommerce-page.woocommerce-js.hfeed.woocommerce-active.ellie-menu-align-center.ellie-logo-position-center.ellie-header-menu-under.ellie-layout-left:nth-child(2) div.site-viewport:nth-child(1) div.site div.site-content div.content-area main.site-main div.columns-3 ul.products.columns-3 li.product.type-product.post-27.status-publish.first.instock.product_cat-clothing.product_cat-hoodies.has-post-thumbnail.taxable.shipping-taxable.purchasable.product-type-simple:nth-child(1) div.ellie-thumb-wrapper > a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")));
        driver.findElement(By.cssSelector("body.home.archive.post-type-archive.post-type-archive-product.theme-ellie.woocommerce.woocommerce-page.woocommerce-js.hfeed.woocommerce-active.ellie-menu-align-center.ellie-logo-position-center.ellie-header-menu-under.ellie-layout-left:nth-child(2) div.site-viewport:nth-child(1) div.site div.site-content div.content-area main.site-main div.columns-3 ul.products.columns-3 li.product.type-product.post-27.status-publish.first.instock.product_cat-clothing.product_cat-hoodies.has-post-thumbnail.taxable.shipping-taxable.purchasable.product-type-simple:nth-child(1) div.ellie-thumb-wrapper > a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")).click();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body.home.archive.post-type-archive.post-type-archive-product.theme-ellie.woocommerce.woocommerce-page.woocommerce-js.hfeed.woocommerce-active.ellie-menu-align-center.ellie-logo-position-center.ellie-header-menu-under.ellie-layout-left:nth-child(2) div.site-viewport:nth-child(1) div.site div.site-content div.content-area main.site-main div.columns-3 ul.products.columns-3 li.product.type-product.post-27.status-publish.first.instock.product_cat-clothing.product_cat-hoodies.has-post-thumbnail.taxable.shipping-taxable.purchasable.product-type-simple:nth-child(1) div.ellie-thumb-wrapper > a.added_to_cart.wc-forward")));
        driver.findElement(By.cssSelector("body.home.archive.post-type-archive.post-type-archive-product.theme-ellie.woocommerce.woocommerce-page.woocommerce-js.hfeed.woocommerce-active.ellie-menu-align-center.ellie-logo-position-center.ellie-header-menu-under.ellie-layout-left:nth-child(2) div.site-viewport:nth-child(1) div.site div.site-content div.content-area main.site-main div.columns-3 ul.products.columns-3 li.product.type-product.post-27.status-publish.first.instock.product_cat-clothing.product_cat-hoodies.has-post-thumbnail.taxable.shipping-taxable.purchasable.product-type-simple:nth-child(1) div.ellie-thumb-wrapper > a.added_to_cart.wc-forward")).click();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class=\"quantity\"]")));
        WebElement num = driver.findElement(By.cssSelector("div[class=\"quantity\"]"));


        Actions actions = new Actions(driver);
        actions.moveToElement(num).click().sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build().perform();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.className("woocommerce-notices-wrapper")));

        wdw.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".checkout-button.button.alt.wc-forward")));
        wdw.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".cart_totals.processing"))));
        driver.findElement(By.cssSelector(".checkout-button.button.alt.wc-forward")).click();
    }

    @Test
    public void order() throws InterruptedException {
        add();
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#billing_first_name")));
        WebElement input = driver.findElement(By.cssSelector("#billing_first_name"));
        input.click();
        input.sendKeys("Sanja");

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#billing_last_name")));
        WebElement input1 = driver.findElement(By.cssSelector("#billing_last_name"));
        input1.click();
        input1.sendKeys("Samardzic");

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#billing_company")));
        WebElement input2 = driver.findElement(By.cssSelector("#billing_company"));
        input2.click();
        input2.sendKeys("IT Bootcamp");

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#billing_address_1")));
        WebElement input3 = driver.findElement(By.cssSelector("#billing_address_1"));
        input3.click();
        input3.sendKeys("Kralja Petra");

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#billing_city")));
        WebElement input4 = driver.findElement(By.cssSelector("#billing_city"));
        input4.click();
        input4.sendKeys("Beograd");

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#billing_postcode")));
        WebElement input5 = driver.findElement(By.cssSelector("#billing_postcode"));
        input5.click();
        input5.sendKeys("11000");

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#billing_phone")));
        WebElement input6 = driver.findElement(By.cssSelector("#billing_phone"));
        input6.click();
        input6.sendKeys("0600000111");

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#billing_email")));
        WebElement input7 = driver.findElement(By.cssSelector("#billing_email"));
        input7.click();
        input7.sendKeys("sanjasam@gmail.com");

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("place_order"))).click().build().perform();

    }

    @Test
    public void recentPosts() {
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"primary-menu\"]/ul/li[5]/a")));
        driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[5]/a")).click();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Hello world!")));
        driver.findElement(By.linkText("Hello world!")).click();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("comment")));
        WebElement comm = driver.findElement(By.id("comment"));
        comm.click();
        comm.sendKeys("Ovo je komentar!");

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("author")));
        WebElement name = driver.findElement(By.id("author"));
        name.click();
        name.sendKeys("Sanja");

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        WebElement email = driver.findElement(By.id("email"));
        email.click();
        email.sendKeys("sanjasam@gmail.com");

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("url")));
        WebElement website = driver.findElement(By.id("url"));
        website.click();
        website.sendKeys("Katalon");

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("wp-comment-cookies-consent")));
        WebElement click = driver.findElement(By.id("wp-comment-cookies-consent"));
        click.click();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.id("submit")));
        WebElement sumbit = driver.findElement(By.id("submit"));
        sumbit.click();
    }

    @Test
    public void search() {
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"primary-menu\"]/ul/li[5]/a")));
        driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[5]/a")).click();

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.className("search-field")));
        WebElement search = driver.findElement(By.className("search-field"));
        search.click();
        search.sendKeys("Patient Ninja");

        wdw.until(ExpectedConditions.presenceOfElementLocated(By.className("ellie-icon-search")));
        driver.findElement(By.className("ellie-icon-search")).click();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }


}
