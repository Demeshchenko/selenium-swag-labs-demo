package saucedemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.DriverManager;

public class CheckoutCompletePage {

    private final WebDriver driver = DriverManager.getInstance();

    private static final String COMPLETE_IMAGE_CSS = "#checkout_complete_container";

    public boolean isCompleteImageDisplayed() {
        return driver.findElement(By.cssSelector(COMPLETE_IMAGE_CSS)).isDisplayed();
    }
}
