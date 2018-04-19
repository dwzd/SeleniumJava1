package com.da;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Java\\SeleniumJava\\src\\main\\resources\\test1.properties";
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(path);
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("course"));
    }
}
