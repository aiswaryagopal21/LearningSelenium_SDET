package com.theTestingSDET.ex05_Selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium26_Input_Check_RadioBoxes {
    @Test
    public void boxes(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        //Input Box
        driver.findElement(By.name("firstname")).sendKeys("Aiswarya Gopal");
        //Check Box
        driver.findElement(By.id("profession-1")).click();
        //Radio Button
        driver.findElement(By.id("exp-5")).click();
    }
}
