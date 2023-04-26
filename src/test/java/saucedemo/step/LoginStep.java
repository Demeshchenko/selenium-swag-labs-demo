package saucedemo.step;

import saucedemo.page.LoginPage;

public class LoginStep {

    public boolean verifyValidationMessage(String message){
        return loginPage.isValidationMessageDisplayed(message);
    }
    LoginPage loginPage = new LoginPage();

    public void enterUsername(String username) {
        loginPage.provideUsername(username);
    }

    public void enterPassword(String password) {
        loginPage.providePassword(password);
    }

    public void clickLogin() {
        loginPage.clickLoginButton();
    }
}
