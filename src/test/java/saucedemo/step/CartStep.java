package saucedemo.step;

import saucedemo.page.CartPage;

public class CartStep {

    CartPage cartPage = new CartPage();

    public boolean isFleeceJacketShown() {
        return cartPage.isFleeceJacketDisplayed();
    }

    public void clickCheckout() {
        cartPage.clickCheckoutButton();
    }
}
