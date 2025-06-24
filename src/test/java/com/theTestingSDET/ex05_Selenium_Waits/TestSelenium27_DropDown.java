package com.theTestingSDET.ex05_Selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium27_DropDown {
    @Test
    public void select_static(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
        Select select = new Select(element);
        select.selectByIndex(1);
        //select.selectByVisibleText("Option 1");
        //select.selectByValue("1");

    }
}
