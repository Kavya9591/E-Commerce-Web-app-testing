package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    private By productSearch = By.id("searchBox");
    private By addToWishlist = By.id("wishlist");
    private By addToCart = By.id("cart");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {
        driver.findElement(productSearch).sendKeys(productName);
    }

    public void addToWishList() {
        driver.findElement(addToWishlist).click();
    }

    public void addToCart() {
        driver.findElement(addToCart).click();
    }
}