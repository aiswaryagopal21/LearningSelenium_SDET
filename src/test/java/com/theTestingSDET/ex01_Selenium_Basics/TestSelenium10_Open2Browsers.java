package com.theTestingSDET.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium10_Open2Browsers {
    @Description("Open edge and chrome")
    @Test
    public void multiple_browsers(){
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://www.gmail.com");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.gmail.com");



    }
}
