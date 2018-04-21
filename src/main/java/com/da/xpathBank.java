package com.da;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathBank {
    @Test
    public void testXpath() throws InterruptedException {
        WebDriver driver;
        String baseUrl = "https://p2p.migang.com/help/help_content_recharge";
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.xpath("//li[@id=\"z_k\"]")).click();
//        Thread.sleep(3000);
        //driver.findElement(By.xpath("//div[@id='zc_k']//td[text()='中国银行']//following-sibling::td")).click();

    }
}
