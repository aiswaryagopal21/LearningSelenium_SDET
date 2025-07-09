package com.theTestingSDET.ex15_Relative_Locators;

import com.theTestingSDET.commonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Lab42_RL_P1 extends commonToAll {
    @Test
    public void test_RLP1() {
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        WebElement span_elememnt = driver.findElement(By.xpath("//span[text()=\"Years of Experience\"]"));
        driver.findElement((with(By.id("exp-1")).toRightOf(span_elememnt))).click();

    }
}
