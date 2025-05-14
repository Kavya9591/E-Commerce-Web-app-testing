package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    WebDriver driver;
    LoginPage login;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
        login = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        login.enterUsername("user1");
        login.enterPassword("password123");
        login.clickLogin();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}