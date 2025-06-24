package com.theTestingSDET.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium11_navigation {
    @Description("All navigation in app vwo")
    @Test
    public void all_navigation() throws InterruptedException {
        WebDriver webDriver = new EdgeDriver();
        //webDriver.get("app.vwo.com");//it will be failed if I run
        webDriver.get("https://www.gmail.com");
        Thread.sleep(2000);
        webDriver.navigate().to("https://app.vwo.com");
        Thread.sleep(2000);
        webDriver.navigate().refresh();
        Thread.sleep(2000);
        webDriver.navigate().forward();
        Thread.sleep(2000);
        Thread.sleep(2000);
        System.out.println(webDriver.getCurrentUrl());
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://app.vwo.com/#/login");
        if(webDriver.getPageSource().contains("Sign in to VWO platform")){
            System.out.println("Sign in to VWO platform is present");
            Assert.assertTrue(true);
        }else{
            Assert.assertFalse(false);
            System.out.println("Sign in to VWO platform is not present");
        }
        webDriver.navigate().back();
        webDriver.quit();
    }
}
