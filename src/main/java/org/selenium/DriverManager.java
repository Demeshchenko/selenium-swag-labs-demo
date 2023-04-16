package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.dataProvider.PropertiesReaderSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static final PropertiesReaderSingleton properties = PropertiesReaderSingleton.getInstance();

    public static void setDriver() {
        String type = properties.getProperty("webdriver.browser");

        switch (type) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver.set(new ChromeDriver(options));
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver.set(new FirefoxDriver());
                break;
        }
    }

    public static WebDriver getDriver()
    {
        return driver.get();
    }

    public static void closeBrowser()
    {
        driver.get().close();
        driver.remove();
    }
}
