package com.the224.orbital.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigUtils {

    public static void main(String[] args) {
        System.out.println(readConfiguration());
    }

    public static Map<String, String> readConfiguration() {
        Properties prop = new Properties();
        InputStream input = null;

        Map<String, String> config = new HashMap<>();

        try {
            input = new FileInputStream("./config.properties");
            prop.load(input);

            if (prop.getProperty(ConfigField.ROOT_PATH) != null) {
                config.put(ConfigField.ROOT_PATH, prop.getProperty(ConfigField.ROOT_PATH));
            } else {
                throw new Exception("Root folder path not found in the config file \n Add 'root_path' to your config");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return config;
        }
    }

}
