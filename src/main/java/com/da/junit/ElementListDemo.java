package com.da.junit;

import com.da.methods.GeneralMethod;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ElementListDemo {
    private WebDriver driver;
    private String baseUrl;
    private GeneralMethod gMethod;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        baseUrl = "D:\\Java\\SeleniumJava\\src\\main\\resources\\PracticePage.html";
        gMethod = new GeneralMethod(driver);
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }

    @Test
    public void testMethods() throws InterruptedException {
        driver.get(baseUrl);
        List<WebElement> elementList = gMethod.getElementList("xpath", "//input[@type='text']");
        //集合的个数
        int size = elementList.size();
        System.out.println("此集合的数量为："+ size);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        // driver.quit();
    }

}
