package com.theTestingSDET.ex15_Relative_Locators;

import com.theTestingSDET.commonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab42_RL_P2 extends commonToAll {
    @Test
    public void test_RLP1() {
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();
        driver.switchTo().frame("result");
        driver.findElement(By.xpath("//form[@id=\"form\"]/button")).click();
        WebElement username_element = driver.findElement(By.xpath("//input[@id=\"username\"]"));
        WebElement error_element = driver.findElement((with(By.tagName("small")).below(username_element)));
        String error_Message = error_element.getText();
        System.out.println(error_Message);
        Assert.assertEquals(error_Message,"Username must be at least 3 characters");
    }
}
