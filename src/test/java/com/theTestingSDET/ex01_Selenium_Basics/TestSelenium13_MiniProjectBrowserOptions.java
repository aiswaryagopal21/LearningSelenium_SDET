package com.theTestingSDET.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium13_MiniProjectBrowserOptions {
    @Description("Blocking the youtube adds")
    @Test
    public void addBlocker_youtube(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
       // chromeOptions.addArguments(new file("path of the file"));
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("any youtube page link");
    }
}
