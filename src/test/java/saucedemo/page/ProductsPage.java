package saucedemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.DriverManager;

public class ProductsPage {

    private final WebDriver driver = DriverManager.getInstance();

    private static final String LOGOUT_BUTTON_CSS = "#logout_sidebar_link";

    public Boolean isLogoutButtonProvided() {
        return driver.findElement(By.cssSelector(LOGOUT_BUTTON_CSS)).isDisplayed();
    }
}
