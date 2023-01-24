package saucedemo.step;

import saucedemo.page.LoginPage;

public class LoginStep {

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
