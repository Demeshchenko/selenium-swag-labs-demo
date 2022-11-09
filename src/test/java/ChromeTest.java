import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.DriverManager;

public class ChromeTest {
    static WebDriver driver;
    static DriverManager driverManager = new DriverManager();

    @BeforeAll
    public static void setupAll() {
        driver = driverManager.createDriver("chrome");
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
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
