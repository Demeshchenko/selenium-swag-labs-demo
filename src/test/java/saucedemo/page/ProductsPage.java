package saucedemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.DriverManager;

public class ProductsPage {

    private final WebDriver driver = DriverManager.getInstance();

    private static final String LOGOUT_BUTTON_CSS = "#logout_sidebar_link";
    private static final String SHOPPING_CART_CSS = "#shopping_cart_container";

    public boolean isShoppingCartButtonProvided() {
        return driver.findElement(By.cssSelector(SHOPPING_CART_CSS)).isDisplayed();
    }
}
