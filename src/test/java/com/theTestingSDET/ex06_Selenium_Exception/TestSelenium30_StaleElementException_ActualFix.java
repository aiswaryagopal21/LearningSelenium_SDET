package com.theTestingSDET.ex06_Selenium_Exception;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium30_StaleElementException_ActualFix {
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
            WebElement search = driver.findElement(By.id("APjFqb"));
            driver.navigate().refresh();
            //Actual fix is you need to re find the element
            search = driver.findElement(By.id("APjFqb"));
            search.sendKeys("selenium"+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
    }
    @AfterTest
    public void closeBrowser() throws InterruptedException {
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }driver.quit();
    }

}
