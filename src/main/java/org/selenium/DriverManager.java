package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.dataProvider.PropertiesReaderSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private static WebDriver instance;
    private static final PropertiesReaderSingleton properties = PropertiesReaderSingleton.getInstance();

    public static WebDriver getInstance() {
        if ( instance == null ) {
            instance = createDriver(properties.getProperty("webdriver.browser"));
        }

        return instance;
    }

    private static WebDriver createDriver(String type) {

        switch (Browsers.fromString(type)) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
        }
        throw new IllegalArgumentException("Not valid browser type");
    }
}
