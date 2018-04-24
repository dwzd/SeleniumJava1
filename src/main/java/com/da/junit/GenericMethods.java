package com.da.junit;

import com.da.methods.GeneralMethod;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GenericMethods {
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
        WebElement element = gMethod.getElement("id", "name");
        element.sendKeys("encapsulation method");
        Thread.sleep(2000);
        gMethod.getElement("id", "alertbtn").click();

    }
}
