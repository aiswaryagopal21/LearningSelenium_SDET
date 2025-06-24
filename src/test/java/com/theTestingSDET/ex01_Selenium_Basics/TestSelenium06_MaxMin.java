package com.theTestingSDET.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium06_MaxMin {
    @Description("Open the URL")
    @Test
    public void opeurl(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        //driver.manage().window().minimize();
        driver.quit();
    }
}
