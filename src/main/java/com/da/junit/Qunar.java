package com.da.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Qunar {
    WebDriver driver;
    String baseUrl;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        baseUrl = "https://dujia.qunar.com";
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    @Test
    public void testClick() throws InterruptedException {
        driver.get(baseUrl);
        driver.findElement(By.id("__headerInfo_login__")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//form[@id=\"loginForm\"]//input[@name='username']")).clear();
        driver.findElement(By.xpath("//form[@id=\"loginForm\"]//input[@name='username']")).sendKeys("ddd");
        driver.findElement(By.xpath("//form[@id=\"loginForm\"]//input[@name='password']")).sendKeys("aaaaaaaa");


    }
    @After
    public void tearDown(){

    }
}
