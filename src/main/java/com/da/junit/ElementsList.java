package com.da.junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ElementsList {
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
    public void testElement() throws InterruptedException {
        boolean isChecked = false;
        //把三个单选项同时选上
        List<WebElement> radioButtons = driver.findElements(
                By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
        System.out.println("集合的数量为：" + radioButtons.size());
        for(int i=0; i<radioButtons.size(); i++){
            isChecked = radioButtons.get(i).isSelected();
            if(!isChecked){
                radioButtons.get(i).click();
                Thread.sleep(2000);
            }
        }

    }
}
