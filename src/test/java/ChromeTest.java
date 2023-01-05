import dataProvider.PropertiesReaderSingleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.selenium.DriverManager;

public class ChromeTest {
    static WebDriver driver;
    private final PropertiesReaderSingleton properties = PropertiesReaderSingleton.getInstance();

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
        String applicationUrl = properties.getProperty("home");

        driver.manage().window().maximize();
        driver.get(applicationUrl);
    }
}
