package org.dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReaderSingleton {

    private Properties properties;
    private final String propertyFilePath = "src/main/configs/configuration.properties";
    private static final PropertiesReaderSingleton instance = new PropertiesReaderSingleton();


    private PropertiesReaderSingleton() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("configuration.properties not found at " + propertyFilePath);
        }
    }

    public static PropertiesReaderSingleton getInstance() {
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
