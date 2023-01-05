package saucedemo.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.DriverManager;

public class CommonStep {

    static WebDriver driver;
    public void openPage(String pageName) {

        driver.get(pageName);
    }

}
