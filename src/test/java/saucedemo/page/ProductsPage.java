package saucedemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium.DriverManager;

import java.util.List;
import java.util.NoSuchElementException;

public class ProductsPage {

    private final WebDriver driver = DriverManager.getDriver();

    private static final String LOGOUT_BUTTON_CSS = "#logout_sidebar_link";
    private static final String SHOPPING_CART_BUTTON_CSS = "#shopping_cart_container";
    private static final String ADD_TO_CART_CSS = "#add-to-cart-sauce-labs-fleece-jacket";
    private static final String REMOVE_CSS = "#remove-sauce-labs-fleece-jacket";
    private static final String CART_COUNTER_CSS = ".shopping_cart_badge";

    public boolean isShoppingCartButtonDisplayed() {
        try {
            WebElement element = driver.findElement(By.cssSelector(SHOPPING_CART_BUTTON_CSS));
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickAddToCart() {
        driver.findElement(By.cssSelector(ADD_TO_CART_CSS))
                .click();
    }

    public void clickRemove() {
        driver.findElement(By.cssSelector(REMOVE_CSS))
                .click();
    }
    

    public boolean isCartCounterDisplayed() {
        WebElement element = driver.findElement(By.cssSelector(CART_COUNTER_CSS));
        String value = element.getText();
        return value.equals("1");
    }

    public boolean isCartCounterIsNotDisplayed() {
        List<WebElement> elements = driver.findElements(By.cssSelector(CART_COUNTER_CSS));
        return elements.isEmpty();
    }

    public void clickCartButton() {
        driver.findElement(By.cssSelector(SHOPPING_CART_BUTTON_CSS))
                .click();
    }
}
