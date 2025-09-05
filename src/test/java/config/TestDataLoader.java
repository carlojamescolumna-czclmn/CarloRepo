package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataLoader {
    private Properties props = new Properties();

    public TestDataLoader(String fileName) {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/" + fileName);
            props.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load test data file: " + fileName, e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}