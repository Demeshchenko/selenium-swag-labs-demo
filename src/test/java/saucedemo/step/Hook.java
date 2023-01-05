package saucedemo.step;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.AfterEach;
import org.selenium.DriverManager;

public class Hook {
    static WebDriver driver;

    @After
    public void closeBrowser() {
        driver.close();
    }

}
