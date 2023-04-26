package saucedemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium.DriverManager;

import java.util.Objects;

public class LoginPage {

    private final WebDriver driver = DriverManager.getDriver();

    private static final String LOGO_CSS = ".login_logo";
    private static final String USERNAME_CSS = "input[placeholder='Username']";
    private static final String PASSWORD_CSS = "input[placeholder='Password']";
    private static final String LOGIN_BUTTON_CSS = ".submit-button";
    private static final String LOGIN_ERROR_CSS = "div.error-message-container.error";

    public Boolean isLogoDisplayed() {
        return driver.findElement(By.cssSelector(LOGO_CSS)).isDisplayed();
    }

    public void provideUsername(String userName) {
        driver.findElement(By.cssSelector(USERNAME_CSS))
                .sendKeys(userName);
    }

    public void providePassword(String password) {
        driver.findElement(By.cssSelector(PASSWORD_CSS))
                .sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.cssSelector(LOGIN_BUTTON_CSS))
                .click();
    }

    public boolean isValidationMessageDisplayed(String message) {
        String validationMessage = driver.findElement(By.cssSelector(LOGIN_ERROR_CSS)).getText();
        return message.equals(validationMessage);
    }
}
