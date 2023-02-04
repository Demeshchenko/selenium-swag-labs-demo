package saucedemo.step;

import saucedemo.page.CheckoutStepTwoPage;

public class CheckoutStepTwoStep {
    CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage();

    public boolean isPaymentInformationShown() {
        return checkoutStepTwoPage.isPaymentInformationDisplayed();
    }

    public void clickFinish() {
        checkoutStepTwoPage.clickFinishButton();
    }
}
