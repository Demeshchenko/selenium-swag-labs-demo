package saucedemo.step;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.selenium.DriverManager;

public class Hook {
    private final WebDriver driver = DriverManager.getInstance();

    @After
    public void closeBrowser() {
        driver.close();
    }

}
