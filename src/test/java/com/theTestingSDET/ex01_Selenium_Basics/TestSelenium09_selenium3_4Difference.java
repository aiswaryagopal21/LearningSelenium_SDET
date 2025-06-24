package com.theTestingSDET.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium09_selenium3_4Difference {
    @Description("Selenium webdriver set")
    @Test
    public void selenium3_4Difference(){
        //Selenium 3
        System.setProperty("WebDriver.Chrome.Drover","path of the chrome driver");
        //Selenium 4
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
    }
}
