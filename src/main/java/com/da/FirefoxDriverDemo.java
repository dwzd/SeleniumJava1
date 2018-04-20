package com.da;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;

public class FirefoxDriverDemo {
    @Test
    public void testSogou() throws InterruptedException {
        WebDriver driver;
        String baseUrl;
        System.setProperty("webdriver.firefox.bin","C:\\Users\\darwin\\Downloads\\firefox-sdk\\bin\\firefox.exe");
        System.setProperty("webdriver.gecko.driver", "D:\\AT\\geckodriver.exe");
        driver = new FirefoxDriver();
        //driver = new ChromeDriver();
        baseUrl = "https://www.sogou.com";
        driver.get(baseUrl);
        driver.findElement(By.xpath("//input[@id='query']")).sendKeys("selenium java");
        Thread.sleep(2000);
        driver.findElement(By.id("stb")).click();
        assertTrue(driver.getPageSource().contains("selenium"));
        //assertEquals("自动化测试工具",driver.findElement(By.xpath(".//*[@id='uigs__0']")).getText());

    }
}
