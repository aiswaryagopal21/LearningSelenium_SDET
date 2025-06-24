package com.theTestingSDET.ex01_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium03_Driver {
    public static void main(String[] args) {
        //chrome or edge any 1
        ChromeDriver driver = new ChromeDriver();

        //chrome sometime I change to edge
        WebDriver driver1 = new ChromeDriver();
        //driver1 = new EdgeDriver();
        //driver1 = new FirefoxDriver();
    }

}
