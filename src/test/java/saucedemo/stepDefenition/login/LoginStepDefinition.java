package saucedemo.stepDefenition.login;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.dataProvider.PropertiesReaderSingleton;
import org.openqa.selenium.WebDriver;
import org.selenium.DriverManager;
import saucedemo.step.CommonStep;
import saucedemo.step.LoginStep;
import saucedemo.step.ProductsStep;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepDefinition {

    private final WebDriver driver = DriverManager.getDriver();

    private final PropertiesReaderSingleton properties = PropertiesReaderSingleton.getInstance();

    private CommonStep commonStep = new CommonStep();
    private LoginStep loginStep = new LoginStep();
    private ProductsStep productsStep = new ProductsStep();

    @When("^I open \"([^\"]*)\" page$")
    public void i_open_page(String pageName) {
        commonStep.openPage(properties.getProperty(pageName));
    }

    @Then("^I provide \"([^\"]*)\" userName$")
    public void i_provide_username(String userName) {
        loginStep.enterUsername(properties.getProperty(userName));
    }

    @Then("^I provide \"([^\"]*)\" password$")
    public void i_provide_password(String password) {
        loginStep.enterPassword(properties.getProperty(password));
    }

    @Then("I click Login button")
    public void i_click_login_button() {
        loginStep.clickLogin();
    }

    @Then("I verify that Products page is opened")
    public void i_verify_that_products_page_is_opened() {
        assertThat(productsStep.isShoppingCartButtonShown()).isTrue();
    }
}
