package saucedemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.DriverManager;

public class CheckoutStepTwoPage {

    private final WebDriver driver = DriverManager.getDriver();

    private static final String PAYMENT_INFORMATION_CSS = "#checkout_summary_container > div > div.summary_info > div:nth-child(2)";
    private static final String FINISH_BUTTON_CSS = "#finish";

    public boolean isPaymentInformationDisplayed() {
        String paymentInformation = driver.findElement(By.cssSelector(PAYMENT_INFORMATION_CSS)).getText();
        String[] tokens = paymentInformation.split(" ");
        String number = tokens[tokens.length - 1].replace("#", "");
        return String.valueOf(number).length() == 5;
    }

    public void clickFinishButton() {
        driver.findElement(By.cssSelector(FINISH_BUTTON_CSS))
                .click();
    }
}
