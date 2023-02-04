package saucedemo.step;
import saucedemo.page.ProductsPage;

public class ProductsStep {

    ProductsPage productsPage = new ProductsPage();

    public boolean isShoppingCartButtonShown() {
        return productsPage.isShoppingCartButtonDisplayed();
    }

    public void clickAddToCart() {
        productsPage.clickAddToCart();
    }

    public boolean isCartCounterIsDisplayedWithValueShown() {
        return productsPage.isCartCounterDisplayed();
    }

    public void clickCart() {
        productsPage.clickCartButton();
    }
}
