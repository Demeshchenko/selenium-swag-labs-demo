package org.selenium;

public enum Browsers {
    CHROME("chrome"),
    FIREFOX("firefox");

    private String browserType;

    Browsers(String browserType) {
        this.browserType = browserType;
    }

    public static Browsers fromString(String text) {
        for (Browsers browsers : Browsers.values()) {
            if (browsers.browserType.equalsIgnoreCase(text)) {
                return browsers;
            }
        }
        throw new IllegalArgumentException("No such browser type");
    }
}

