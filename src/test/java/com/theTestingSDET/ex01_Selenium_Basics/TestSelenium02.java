package com.theTestingSDET.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {
    @Description("Open app.vwo.com and validate the title")
    @Test
    public void test_openVWOLoginPage(){
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://app.vwo.com");
        Assert.assertEquals(edgeDriver.getCurrentUrl(),"https://app.vwo.com/#/login");
        edgeDriver.quit();

    }
}
