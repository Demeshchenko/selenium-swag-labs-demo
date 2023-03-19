package saucedemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium.DriverManager;

import java.util.List;
import java.util.NoSuchElementException;

public class CartPage {

    private final WebDriver driver = DriverManager.getDriver();

    private static final String FLEECE_JACKET_CSS = "#item_5_title_link";
    private static final String REMOVE_CSS = "#remove-sauce-labs-fleece-jacket";
    private static final String CHECKOUT_CSS = "#checkout";

    public boolean isFleeceJacketDisplayed() {
        try {
            WebElement element = driver.findElement(By.cssSelector(FLEECE_JACKET_CSS));
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isFleeceJacketIsNotDisplayed() {
        List<WebElement> elements = driver.findElements(By.cssSelector(FLEECE_JACKET_CSS));
        return elements.isEmpty();
    }

    public void clickRemove() {
        driver.findElement(By.cssSelector(REMOVE_CSS))
                .click();
    }

    public void clickCheckoutButton() {
        driver.findElement(By.cssSelector(CHECKOUT_CSS))
                .click();
    }
}
