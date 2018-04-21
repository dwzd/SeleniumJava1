package com.da.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GeneralMethod {
    WebDriver driver;

    public GeneralMethod(WebDriver driver){
            this.driver = driver;
    }
    //使用封装的这个方法代替 driver.findElement
    public WebElement getElement(String type, String locator){
        type = type.toLowerCase();
        if(type.equals("id")){
            System.out.println("使用 id 查找元素：" + locator);
            return this.driver.findElement(By.id(locator));
        }
        else if (type.equals("name")) {
            System.out.println("用name查找元素: " + locator);
            return this.driver.findElement(By.name(locator));
        }
        else if (type.equals("xpath")){
            System.out.println("使用 xpath 查找元素：" + locator);
            return this.driver.findElement(By.xpath(locator));
        }
        else if (type.equals("css")) {
            System.out.println("用css查找元素: " + locator);
            return this.driver.findElement(By.cssSelector(locator));
        }
        else if (type.equals("classname")) {
            System.out.println("用classname查找元素: " + locator);
            return this.driver.findElement(By.className(locator));
        }
        else if (type.equals("tagname")) {
            System.out.println("用tagname查找元素: " + locator);
            return this.driver.findElement(By.tagName(locator));
        }
        else if (type.equals("linktext")) {
            System.out.println("用linktext查找元素: " + locator);
            return this.driver.findElement(By.linkText(locator));
        }
        else if (type.equals("partiallinktext")) {
            System.out.println("用partiallinktext查找元素: " + locator);
            return this.driver.findElement(By.partialLinkText(locator));
        }
        else {
            System.out.println("定位的类型不支持");
            return null;
        }

    }

    //封装定位一组元素
    public List<WebElement> getElementList(String type, String locator) {
        type = type.toLowerCase();
        List<WebElement> elementList = new ArrayList<WebElement>();
        if (type.equals("id")) {
            elementList = this.driver.findElements(By.id(locator));
        }
        else if (type.equals("name")) {
            elementList = this.driver.findElements(By.name(locator));
        }
        else if (type.equals("xpath")) {
            elementList = this.driver.findElements(By.xpath(locator));
        }
        else if (type.equals("css")) {
            elementList = this.driver.findElements(By.cssSelector(locator));
        }
        else if (type.equals("classname")) {
            elementList = this.driver.findElements(By.className(locator));
        }
        else if (type.equals("tagname")) {
            elementList = this.driver.findElements(By.tagName(locator));
        }
        else if (type.equals("linktext")) {
            elementList = this.driver.findElements(By.linkText(locator));
        }
        else if (type.equals("partiallinktext")) {
            elementList = this.driver.findElements(By.partialLinkText(locator));
        }
        else {
            System.out.println("定位的类型不支持");
        }
        if (elementList.isEmpty()) {
            System.out.println("用 " + type +": " + locator+" 没有找到元素");

        } else {
            System.out.println("元素用  " + type +": " + locator+" 找到了");
        }
        return elementList;
    }

}
