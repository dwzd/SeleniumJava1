package com.da.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioCheck {
    WebDriver driver;
    String baseUrl;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    @Test
    public void test()throws InterruptedException{
        WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
        bmwRadio.click();
        Thread.sleep(1500);

        WebElement benzRadio = driver.findElement(By.id("benzradio"));
        benzRadio.click();
        Thread.sleep(1500);

        WebElement bmwCheck = driver.findElement(By.id("bmwcheck"));
        bmwCheck.click();
        Thread.sleep(1000);
        WebElement benzCheck = driver.findElement(By.id("benzcheck"));
        benzCheck.click();

        System.out.println("Is bmw radio choosed? "+bmwRadio.isSelected());
        System.out.println("Is benz radio choosed? "+benzRadio.isSelected());
        System.out.println("Is bmw check choosed? "+bmwCheck.isSelected());
        System.out.println("Is benz check choosed? "+benzCheck.isSelected());

    }
    @After
    public void tearDown(){

    }
}
