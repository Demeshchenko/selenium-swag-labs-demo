package saucedemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.DriverManager;

public class CheckoutStepOnePage {

    private final WebDriver driver = DriverManager.getDriver();

    private static final String FIRST_NAME_CSS = "#first-name";
    private static final String LAST_NAME_CSS = "#last-name";
    private static final String ZIP_POSTAL_CODE_CSS = "#postal-code";
    private static final String CONTINUE_BUTTON_CSS = "#continue";

    public void provideFirstName(String firstName) {
        driver.findElement(By.cssSelector(FIRST_NAME_CSS))
                .sendKeys(firstName);
    }

    public void provideLastName(String lastName) {
        driver.findElement(By.cssSelector(LAST_NAME_CSS))
                .sendKeys(lastName);
    }

    public void providePostalCode(String postalCode) {
        driver.findElement(By.cssSelector(ZIP_POSTAL_CODE_CSS))
                .sendKeys(postalCode);
    }

    public void clickContinueButton() {
        driver.findElement(By.cssSelector(CONTINUE_BUTTON_CSS))
                .click();
    }

}
