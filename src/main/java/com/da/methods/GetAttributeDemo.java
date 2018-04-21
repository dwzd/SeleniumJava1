package com.da.methods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GetAttributeDemo {
    WebDriver driver;
    String baseUrl;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        baseUrl = "D:\\Java\\SeleniumJava\\src\\main\\resources\\PracticePage.html";
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }
    @Test
    public void testElement() throws InterruptedException {
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.id("name"));
        String elementAttribute = element.getAttribute("type");
        System.out.println("此元素上的属性值为： " + elementAttribute);
        elementAttribute = element.getAttribute("placeholder");
        System.out.println("此元素上的属性值为： " + elementAttribute);
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
