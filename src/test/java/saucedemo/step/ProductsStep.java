package saucedemo.step;
import saucedemo.page.ProductsPage;

public class ProductsStep {

    ProductsPage productsPage = new ProductsPage();

    public boolean isLogoutButtonShown() {
        return productsPage.isShoppingCartButtonProvided();
    }
}
