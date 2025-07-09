package com.theTestingSDET.ex12_Windows;

import com.theTestingSDET.commonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab38_Window_Part1 extends commonToAll {
    @Test
    public void test_Windows(){
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent);
        //DFBBFF5AB9DF939FD870E7705D66E4D6 - session id

        WebElement link_parent = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        link_parent.click();

        Set<String> child = driver.getWindowHandles();
        System.out.println(child);
        //[61F7D85EAED6D60ED966FE6F7390D245, AB2C680F1C75272731B03CD09936B51F] - 2 unique session
        //iterating through set
        for(String handle:child){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("TC Passed");
            }driver.switchTo().window(parent);

        }
    }
}
