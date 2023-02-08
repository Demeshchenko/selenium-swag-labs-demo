package saucedemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.DriverManager;

public class CartPage {

    private final WebDriver driver = DriverManager.getDriver();

    private static final String FLEECE_JACKET_CSS = "#item_5_title_link";
    private static final String CHECKOUT_CSS = "#checkout";

    public boolean isFleeceJacketDisplayed() {
        return driver.findElement(By.cssSelector(FLEECE_JACKET_CSS))
                .isDisplayed();
    }

    public void clickCheckoutButton() {
        driver.findElement(By.cssSelector(CHECKOUT_CSS))
                .click();
    }
}
