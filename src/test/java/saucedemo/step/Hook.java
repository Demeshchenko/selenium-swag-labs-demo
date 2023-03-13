package saucedemo.step;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.dataProvider.PropertiesReaderSingleton;
import org.selenium.DriverManager;

public class Hook {
    //private final WebDriver driver = DriverManager.getDriver();
    private final PropertiesReaderSingleton properties = PropertiesReaderSingleton.getInstance();

    @Before
    public void setup() {
        DriverManager.setDriver();
    }

    @After
    public void closeBrowser() {
        DriverManager.closeBrowser();
    }
}
