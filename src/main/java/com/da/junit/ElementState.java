package com.da.junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ElementState {
    WebDriver driver;
    String baseUrl;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com";
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    @Test
    public void testElement(){
        driver.get(baseUrl);
        driver.findElement(By.id("lst-ib")).sendKeys("webdriver");


    }
}
