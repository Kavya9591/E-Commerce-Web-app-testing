package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest {
    WebDriver driver;
    HomePage home;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://example.com/home");
        home = new HomePage(driver);
    }

    @Test
    public void testSearchAndAddToCart() {
        home.searchProduct("Shirt");
        home.addToWishList();
        home.addToCart();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}