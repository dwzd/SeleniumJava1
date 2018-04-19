package com.da;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTest {
    @Test
    public void linktext() throws InterruptedException {
        WebDriver driver;
        String baseUrl = "https://www.yahoo.com";
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.linkText("Mail")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Sign")).click();
    }
}
