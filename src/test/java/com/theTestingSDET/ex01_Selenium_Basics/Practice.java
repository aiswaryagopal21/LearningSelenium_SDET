package com.theTestingSDET.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Practice {
    @Description("Open the url")
    @Test
    public void vwo_app() {
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://app.vwo.com");
        System.out.println(webDriver.getCurrentUrl());
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://app.vwo.com/#/login");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().to("https://app.vwo.com/#/login");
        webDriver.navigate().refresh();
        System.out.println(webDriver.getTitle());
        if(webDriver.getPageSource().contains("Sign in to VWO platform")){
            System.out.println("Sign in to VWO platform is available");
            Assert.assertTrue(true);
        }else{
            Assert.assertFalse(false);
            System.out.println("Sign in to VWO platform is not available");
        }
webDriver.quit();

    }
}
