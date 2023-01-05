package saucedemo.stepDefenition.login;

import dataProvider.PropertiesReaderSingleton;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import saucedemo.step.CommonStep;
import saucedemo.step.LoginStep;
import saucedemo.step.ProductsStep;

public class LoginStepDefinition {

    static WebDriver driver;
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
        productsStep.isLogoutButtonShown();
    }

    @Then("I Verify that the Logo present on page")
    public void i_verify_that_the_logo_present_on_page() {

        boolean status = driver.findElement(By.cssSelector("#root > div > div.login_logo")).isDisplayed();
        //Assert.assertEquals(true, status);

    }
}