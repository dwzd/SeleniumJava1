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

public class MultipleSelect {
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
        WebElement element = driver.findElement(By.id("fruitselect"));
        //用Select 类可以选取select 标签
        Select select = new Select(element);
        select.selectByValue("peach");
        Thread.sleep(2500);
        select.selectByIndex(0);
        Thread.sleep(1500);
        select.selectByVisibleText("桔子");
        Thread.sleep(2000);

        //打印所有元素的text 内容
        List<WebElement> options = select.getOptions();
        for(int i=0; i<options.size(); i++){
            String optionText = options.get(i).getText();
            System.out.println(optionText);

        }
    }
}
