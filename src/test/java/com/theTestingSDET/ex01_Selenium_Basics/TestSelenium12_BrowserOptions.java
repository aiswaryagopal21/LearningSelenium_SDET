package com.theTestingSDET.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.Test;

public class TestSelenium12_BrowserOptions {
    @Description("Open vwo and use options classs")
    @Test
    public void browser_options(){
        EdgeOptions edgeOptions = new EdgeOptions();
        //ChromeOptions chromeOptions = new ChromeOptions();
        //FirefoxOptions firefoxOptions = new FirefoxOptions();
        //SafariOptions safariOptions = new SafariOptions();
        //edgeOptions.addArguments(("--incognito"));
        edgeOptions.addArguments("--window-size=280,700");
        //edgeOptions.addArguments("--start-maximize");
        EdgeDriver edgeDriver = new EdgeDriver(edgeOptions);
        edgeDriver.get("https://app.vwo.com");



    }
}
