package saucedemo.step;

import saucedemo.page.CheckoutCompletePage;

public class CheckoutCompleteStep {

    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    public boolean isCompleteImageShown() {
        return checkoutCompletePage.isCompleteImageDisplayed();
    }
}
