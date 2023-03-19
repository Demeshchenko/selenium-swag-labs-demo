package saucedemo.stepDefenition.clearCart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.dataProvider.PropertiesReaderSingleton;
import saucedemo.step.CartStep;
import saucedemo.step.ProductsStep;

import static org.assertj.core.api.Assertions.assertThat;

public class ClearCartStepDefinition {

    private final PropertiesReaderSingleton properties = PropertiesReaderSingleton.getInstance();

    private ProductsStep productsStep = new ProductsStep();
    private CartStep cartStep = new CartStep();

    @When("I click Remove button")
    public void iClickRemoveButton() {
        if(productsStep.isShoppingCartButtonShown()) {
            productsStep.clickRemove();
        }
        else if (cartStep.isFleeceJacketShown()) {
            cartStep.clickRemove();
        }
    }

    @Then("I verify that Cart is empty")
    public void iVerifyThatCartIsEmpty() {
        assertThat(productsStep.isCartCounterIsDisplayedWithValueIsNotShown()).isTrue();
    }

    @Then("I Verify that Fleece Jacket is not displayed in the Cart")
    public void iVerifyThatFleeceJacketIsNotDisplayedInTheCart() {
        assertThat(cartStep.isFleeceJacketIsNoShown()).isTrue();
    }
}
