package com.da.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NavigatingPages {
    WebDriver driver;
    String baseUrl;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        baseUrl = "https://www.yahoo.com";
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    @Test
    public void testNavigate() throws InterruptedException {
        driver.get(baseUrl);
        //获取页面的标题
        String title = driver.getTitle();
        System.out.println("此网站的标题为： " + title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("现在网址为：" + currentUrl);
        String nextUrl = "https://login.yahoo.com/config/login?.src=fpctx&.intl=ca&.lang=en-CA&.done=https%3A%2F%2Fca.yahoo.com";
        driver.navigate().to(nextUrl);
        System.out.println("进入登录邮箱页面");

        currentUrl = driver.getCurrentUrl();
        System.out.println("现在网址为：" + currentUrl);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().refresh();
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

    }
    @After
    public void tearDown(){

    }
}
