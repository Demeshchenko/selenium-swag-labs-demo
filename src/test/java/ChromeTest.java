import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.selenium.DriverManager;

public class ChromeTest {
    static WebDriver driver;

    @BeforeEach
    void setup() {
        driver = DriverManager.createDriver("chrome");
    }

    @AfterEach
    void teardown() {
        driver.close();
        driver.quit();
    }

    @Test
    void shouldOpenWebsite() {
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com");
    }
}
