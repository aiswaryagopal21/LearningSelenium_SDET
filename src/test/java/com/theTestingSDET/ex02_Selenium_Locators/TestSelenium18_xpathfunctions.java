package com.theTestingSDET.ex02_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium18_xpathfunctions {
    @Description("Using xpaths in orange hrm")
    @Owner("Aiswarya Gopal")
    @Test
    public void orange(){
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        edgeDriver.manage().window().maximize();
        WebElement username = edgeDriver.findElement(By.xpath("//input[@name=\"username\"]"));
        username.sendKeys("aiswraya");
        WebElement password = edgeDriver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("aiswraya123");

    }
}
