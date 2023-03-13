package saucedemo.step;

import org.openqa.selenium.WebDriver;
import org.selenium.DriverManager;

public class CommonStep {

    private final WebDriver driver = DriverManager.getDriver();

    public void openPage(String pageName) {
        driver.manage().window().maximize();
        driver.get(pageName);
    }
}
