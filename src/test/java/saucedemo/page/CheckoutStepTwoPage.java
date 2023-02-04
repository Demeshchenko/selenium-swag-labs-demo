package saucedemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.DriverManager;

public class CheckoutStepTwoPage {

    private final WebDriver driver = DriverManager.getInstance();

    private static final String PAYMENT_INFORMATION_CSS = "#checkout_summary_container > div > div.summary_info > div:nth-child(2)";
    private static final String FINISH_BUTTON_CSS = "#finish";

    public boolean isPaymentInformationDisplayed() {
        return driver.findElement(By.cssSelector(PAYMENT_INFORMATION_CSS))
                .isDisplayed();
    }

    public void clickFinishButton() {
        driver.findElement(By.cssSelector(FINISH_BUTTON_CSS))
                .click();
    }
}
