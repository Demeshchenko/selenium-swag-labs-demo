package saucedemo.stepDefenition.order;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.dataProvider.PropertiesReaderSingleton;
import saucedemo.step.*;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderStepDefinition {

    private final PropertiesReaderSingleton properties = PropertiesReaderSingleton.getInstance();

    private ProductsStep productsStep = new ProductsStep();
    private CartStep cartStep = new CartStep();
    private CheckoutStepOneStep checkoutStepOneStep = new CheckoutStepOneStep();
    private CheckoutStepTwoStep checkoutStepTwoStep = new CheckoutStepTwoStep();
    private CheckoutCompleteStep checkoutCompleteStep = new CheckoutCompleteStep();

    @When("I add Fleece Jacket to cart")
    public void iAddFleeceJacketToCart() {
        productsStep.clickAddToCart();
    }

    @Then("I verify that Cart counter is displayed with value 1")
    public void iVerifyThatCartCounterIsDisplayedWithValue() {
        assertThat(productsStep.isCartCounterIsDisplayedWithValueShown()).isTrue();
    }

    @When("I click Cart button")
    public void iClickCartButton() {
        productsStep.clickCart();
    }

    @And("I Verify that Fleece Jacket is displayed in the Cart")
    public void iVerifyThatFleeceJacketIsDisplayedInTheCart() {
        assertThat(cartStep.isFleeceJacketShown()).isTrue();
    }

    @When("I click Checkout button")
    public void iClickCheckoutButton() {
        cartStep.clickCheckout();
    }

    @Then("^I provide \"([^\"]*)\" First Name$")
    public void iProvideFirstName(String firstName) {
        checkoutStepOneStep.enterFirstName(properties.getProperty(firstName));
    }

    @And("^I provide \"([^\"]*)\" Last Name$")
    public void iProvideLastName(String lastName) {
        checkoutStepOneStep.enterLastName(properties.getProperty(lastName));
    }

    @And("^I provide \"([^\"]*)\" Zip\\/Postal Code$")
    public void iProvideZipPostalCode(String postalCode) {
        checkoutStepOneStep.enterPostalCode(properties.getProperty(postalCode));
    }

    @And("I click Continue button")
    public void iClickContinueButton() {
        checkoutStepOneStep.clickContinue();
        
    }

    @Then("I verify that payment Information is displayed")
    public void iVerifyThatPaymentInformationIsDisplayed() {
        assertThat(checkoutStepTwoStep.isPaymentInformationShown()).isTrue();
    }

    @When("I click Finish button")
    public void iClickFinishButton() {
        checkoutStepTwoStep.clickFinish();
    }

    @Then("I verify that Checkout: complete page is opened")
    public void iVerifyThatCheckoutCompletePageIsOpened() {
        assertThat(checkoutCompleteStep.isCompleteImageShown()).isTrue();
    }
}
