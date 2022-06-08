package DomaciRadbr1_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;


public class TestTest0 {

    private static WebDriverManager wdm = new ChromeDriverManager();
    private static WebDriver driver;


    @BeforeTest
    public void beforeTest() {
        wdm.setup();
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void testNoteApp() {
        driver.navigate().to("http://localhost:3001/");
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");
    }

    @Test
    public void testClickOnSignUp() {

        driver.navigate().to("http://localhost:3001/");
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");
        driver.navigate().to("http://localhost:3001/signup");
        driver.findElement(By.xpath("//*[@id=\"signup-link\"]"));
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/signup");
    }

    @Test
    public void testSignUp() {

        driver.navigate().to("http://localhost:3001/");
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        driver.navigate().to("http://localhost:3001/signup");
        WebElement signUpButton = driver.findElement(By.xpath("//*[@id=\"signup-link\"]"));
        signUpButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/signup");

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Sanja");
        assertEquals(firstName.getAttribute("value"), "Sanja");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Samardzic");
        assertEquals(lastName.getAttribute("value"), "Samardzic");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("samardzicsanja994@gmail.com");
        assertEquals(email.getAttribute("value"), "samardzicsanja994@gmail.com");

        WebElement username = driver.findElement(By.id("uniqueId"));
        username.sendKeys("sanja994");
        assertEquals(username.getAttribute("value"), "sanja994");

        WebElement password = driver.findElement(By.id("pwdPlaintext"));
        password.sendKeys("sanja1234@");
        assertEquals(password.getAttribute("value"), "sanja1234@");

        WebElement registerButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/button"));
        registerButton.click();

    }


    @Test
    public void testClickOnLogIn() {
        driver.navigate().to("http://localhost:3001/");
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement logInButton = driver.findElement(By.id("login-link"));
        logInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/login");
    }

    @Test
    public void testLogIn() {

        driver.navigate().to("http://localhost:3001/");
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement logInButton = driver.findElement(By.id("login-link"));
        logInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/login");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("sanja994");
        assertEquals(username.getAttribute("value"), "sanja994");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("sanja1234@");
        assertEquals(password.getAttribute("value"), "sanja1234@");

        WebElement signIn = driver.findElement(By.xpath("/html/body/div/form/button"));
        signIn.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

    }

    @Test
    public void testAddTitleAddContent() {
        driver.navigate().to("http://localhost:3001/");
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement logInButton = driver.findElement(By.id("login-link"));
        logInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/login");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("sanja994");
        assertEquals(username.getAttribute("value"), "sanja994");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("sanja1234@");
        assertEquals(password.getAttribute("value"), "sanja1234@");

        WebElement signInButton = driver.findElement(By.xpath("/html/body/div/form/button"));
        signInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement addTitle = driver.findElement(By.id("title"));
        addTitle.sendKeys("Domaci rad");
        assertEquals(addTitle.getAttribute("value"), "Domaci rad");

        WebElement addContent = driver.findElement(By.id("content"));
        addContent.sendKeys("Test0");
        assertEquals(addContent.getAttribute("value"), "Test0");

        WebElement postNoteButton = driver.findElement(By.id("postNote-btn"));
        postNoteButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");
    }

    @Test
    public void testSanja994Note() {
        driver.navigate().to("http://localhost:3001/");
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement logInButton = driver.findElement(By.id("login-link"));
        logInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/login");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("sanja994");
        assertEquals(username.getAttribute("value"), "sanja994");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("sanja1234@");
        assertEquals(password.getAttribute("value"), "sanja1234@");

        WebElement signInButton = driver.findElement(By.xpath("/html/body/div/form/button"));
        signInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement sanja994NoteButton = driver.findElement(By.id("user-note-link"));
        sanja994NoteButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/note");


    }

    @Test
    public void testClickOnEditNote() {
        driver.navigate().to("http://localhost:3001/");
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement logInButton = driver.findElement(By.id("login-link"));
        logInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/login");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("sanja994");
        assertEquals(username.getAttribute("value"), "sanja994");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("sanja1234@");
        assertEquals(password.getAttribute("value"), "sanja1234@");

        WebElement signInButton = driver.findElement(By.xpath("/html/body/div/form/button"));
        signInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement addTitle = driver.findElement(By.id("title"));
        addTitle.sendKeys("Domaci rad");
        assertEquals(addTitle.getAttribute("value"), "Domaci rad");

        WebElement addContent = driver.findElement(By.id("content"));
        addContent.sendKeys("Test0");
        assertEquals(addContent.getAttribute("value"), "Test0");

        WebElement postNoteButton = driver.findElement(By.id("postNote-btn"));
        postNoteButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement sanja994NoteButton = driver.findElement(By.id("user-note-link"));
        sanja994NoteButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/note");

        WebElement clickOnEditNote = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/table/tbody/tr/td[5]/span/a"));
        clickOnEditNote.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/note/edit/9");

    }

    @Test
    public void testEditNote() {
        driver.navigate().to("http://localhost:3001/");
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement logInButton = driver.findElement(By.id("login-link"));
        logInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/login");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("sanja994");
        assertEquals(username.getAttribute("value"), "sanja994");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("sanja1234@");
        assertEquals(password.getAttribute("value"), "sanja1234@");

        WebElement signInButton = driver.findElement(By.xpath("/html/body/div/form/button"));
        signInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement addTitle = driver.findElement(By.id("title"));
        addTitle.sendKeys("Domaci rad");
        assertEquals(addTitle.getAttribute("value"), "Domaci rad");

        WebElement addContent = driver.findElement(By.id("content"));
        addContent.sendKeys("Test0");
        assertEquals(addContent.getAttribute("value"), "Test0");

        WebElement postNoteButton = driver.findElement(By.id("postNote-btn"));
        postNoteButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement sanja994NoteButton = driver.findElement(By.id("user-note-link"));
        sanja994NoteButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/note");

        WebElement clickOnEditNote = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/table/tbody/tr/td[5]/span/a"));
        clickOnEditNote.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/note/edit/9");

        WebElement editNote = driver.findElement(By.id("title"));
        editNote.sendKeys(" - automatsko testiranje");
        // assertEquals(editNote.getAttribute("value"), " - automatsko testiranje");

        WebElement clickOnUpdateNote = driver.findElement(By.xpath("//*[@id=\"updateNote-btn\"]"));
        clickOnUpdateNote.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/note/");

    }

    @Test
    public void testDeleteNote() {
        driver.navigate().to("http://localhost:3001/");
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement logInButton = driver.findElement(By.id("login-link"));
        logInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/login");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("sanja994");
        assertEquals(username.getAttribute("value"), "sanja994");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("sanja1234@");
        assertEquals(password.getAttribute("value"), "sanja1234@");

        WebElement signInButton = driver.findElement(By.xpath("/html/body/div/form/button"));
        signInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement addTitle = driver.findElement(By.id("title"));
        addTitle.sendKeys("Domaci rad");
        assertEquals(addTitle.getAttribute("value"), "Domaci rad");

        WebElement addContent = driver.findElement(By.id("content"));
        addContent.sendKeys("Test0");
        assertEquals(addContent.getAttribute("value"), "Test0");

        WebElement postNoteButton = driver.findElement(By.id("postNote-btn"));
        postNoteButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement sanja994NoteButton = driver.findElement(By.id("user-note-link"));
        sanja994NoteButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/note");

        WebElement clickOnDelete = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/table/tbody/tr/td[6]/span/a"));
        clickOnDelete.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

    }

    @Test
    public void testClickOnSanja994() {
        driver.navigate().to("http://localhost:3001/");
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement logInButton = driver.findElement(By.id("login-link"));
        logInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/login");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("sanja994");
        assertEquals(username.getAttribute("value"), "sanja994");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("sanja1234@");
        assertEquals(password.getAttribute("value"), "sanja1234@");

        WebElement signInButton = driver.findElement(By.xpath("/html/body/div/form/button"));
        signInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement clickOnSanja994 = driver.findElement(By.id("navbarDropdownMenuLink"));
        clickOnSanja994.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

    }


    @Test
    public void testLogOut() {
        driver.navigate().to("http://localhost:3001/");
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement logInButton = driver.findElement(By.id("login-link"));
        logInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/login");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("sanja994");
        assertEquals(username.getAttribute("value"), "sanja994");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("sanja1234@");
        assertEquals(password.getAttribute("value"), "sanja1234@");

        WebElement signInButton = driver.findElement(By.xpath("/html/body/div/form/button"));
        signInButton.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement clickOnSanja994 = driver.findElement(By.id("navbarDropdownMenuLink"));
        clickOnSanja994.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/");

        WebElement logOut = driver.findElement(By.id("logout-link"));
        logOut.click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:3001/?logout");

    }

    @AfterMethod
    public void tearDown() {
        //  driver.close();
    }

    @AfterClass
    public void afterTest() {
        //   wdm.quit();
    }

}
