package saucedemo.step;

import saucedemo.page.CartPage;

public class CartStep {

    CartPage cartPage = new CartPage();

    public boolean isFleeceJacketShown() {
        return cartPage.isFleeceJacketDisplayed();
    }

    public  boolean isFleeceJacketIsNoShown() {
        return cartPage.isFleeceJacketIsNotDisplayed();
    }

    public void clickRemove() {
        cartPage.clickRemove();
    }

    public void clickCheckout() {
        cartPage.clickCheckoutButton();
    }
}
