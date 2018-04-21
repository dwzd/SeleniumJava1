package com.da.junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultiSelect2 {
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
        WebElement element = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(element);
        Thread.sleep(2500);
        select.selectByIndex(2);
        Thread.sleep(2500);
        select.selectByVisibleText("苹果");
        Thread.sleep(2500);
        select.selectByValue("orange");


        List<WebElement> options = select.getAllSelectedOptions();
        for(WebElement option:options){
            System.out.println(option.getText());
        }

        Thread.sleep(3000);
        select.deselectByIndex(1);
    }
}
