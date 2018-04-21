package com.da.junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ElementHide {
    WebDriver driver;
    String baseUrl;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        baseUrl = "D:\\Java\\SeleniumJava\\src\\main\\resources\\PracticePage.html";
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    @Test
    public void testSelect() throws InterruptedException {
        WebElement textBox = driver.findElement(By.id("displayed-text"));
        System.out.println(textBox.isDisplayed());
        Thread.sleep(2500);

        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        hideButton.click();
        Thread.sleep(3000);
        System.out.println("文本框显示为： " + textBox.isDisplayed());

        WebElement showButton = driver.findElement(By.id("show-textbox"));
        showButton.click();
        Thread.sleep(3000);
        System.out.println("文本框显示为： " + textBox.isDisplayed());

    }
}
