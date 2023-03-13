package saucedemo.step;

import saucedemo.page.CheckoutStepOnePage;

public class CheckoutStepOneStep {
    CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage();

    public void enterFirstName(String firstName) {
        checkoutStepOnePage.provideFirstName(firstName);
    }

    public void enterLastName(String lastName) {
        checkoutStepOnePage.provideLastName(lastName);
    }

    public void enterPostalCode(String postalCode) {
        checkoutStepOnePage.providePostalCode(postalCode);
    }

    public void clickContinue() {
        checkoutStepOnePage.clickContinueButton();
    }
}
