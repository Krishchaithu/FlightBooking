package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private Properties properties;
    private final String propertyFilePath = "src/test/resources/configuration.properties";
    public ConfigFileReader(){
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(bufferedReader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public String getDriverPath(){
        String driverPath = properties.getProperty("driverPath");
        if (driverPath != null){
            return driverPath;
        }else {
            throw new RuntimeException("Driver path not found");
        }
    }
    public String getProperty(String value){
        String property = properties.getProperty(value);
        if (property!=null){
            return property;
        }else {
            throw new RuntimeException("property not found");
        }
    }
//    public String
}

