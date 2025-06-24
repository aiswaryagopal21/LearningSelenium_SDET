package com.theTestingSDET.ex01_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium04_WebDriver {
    @Test
    public void test_driver() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
    }
}
