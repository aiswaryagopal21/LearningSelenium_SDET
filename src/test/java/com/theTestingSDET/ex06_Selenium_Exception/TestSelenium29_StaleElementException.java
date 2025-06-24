package com.theTestingSDET.ex06_Selenium_Exception;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium29_StaleElementException {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }
    @Description("Verify RL")
    @Test
    public  void test_actions(){
        try {
            driver.get("https://www.google.com/");
            WebElement search = driver.findElement(By.xpath("By.xpath(\"//textarea[@id='APjFqb']\");"));
            driver.navigate().refresh();
            search.sendKeys("selenium"+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
    }

}
