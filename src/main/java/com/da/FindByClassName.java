package com.da;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByClassName {
    @Test
    public void testClassName(){
        WebDriver driver;
        String baseUrl = "https://demostore.x-cart.com";
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.className("title")).click();

    }
}
