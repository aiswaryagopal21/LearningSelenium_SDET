package com.theTestingSDET.ex06_Selenium_Exception;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium32_TimeOutException {
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
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("APjFq")));
            WebElement search = driver.findElement(By.id("APjFq"));
            search.sendKeys("selenium"+ Keys.ENTER);
        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("The End of the Code");

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
