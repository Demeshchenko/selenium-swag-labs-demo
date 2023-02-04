package saucedemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.DriverManager;

public class ProductsPage {

    private final WebDriver driver = DriverManager.getInstance();

    private static final String LOGOUT_BUTTON_CSS = "#logout_sidebar_link";
    private static final String SHOPPING_CART_BUTTON_CSS = "#shopping_cart_container";
    private static final String ADD_TO_CART_CSS = "#add-to-cart-sauce-labs-fleece-jacket";
    private static final String CART_COUNTER = "#shopping_cart_container";

    public boolean isShoppingCartButtonDisplayed() {
        return driver.findElement(By.cssSelector(SHOPPING_CART_BUTTON_CSS))
                .isDisplayed();
    }

    public void clickAddToCart() {
        driver.findElement(By.cssSelector(ADD_TO_CART_CSS))
                .click();
    }

    public boolean isCartCounterDisplayed() {
        return driver.findElement(By.cssSelector(CART_COUNTER))
                .isDisplayed();
    }

    public void clickCartButton() {
        driver.findElement(By.cssSelector(SHOPPING_CART_BUTTON_CSS))
                .click();
    }

}
