package com.theTestingSDET.ex05_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class TestSelenium23_ExplicitWaits {
    private static final Logger log = LoggerFactory.getLogger(TestSelenium23_ExplicitWaits.class);

    @Description("Verify Ebay print the prices (imac)")
    @Test
    public void test_verify_print_imac_price(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver edgeDriver = new EdgeDriver(edgeOptions);
        edgeDriver.get("https://app.vwo.com/#/login");
        System.out.println(edgeDriver.getTitle());

        WebElement emailInputBox = edgeDriver.findElement(By.xpath("//input[@id=\"login-username\"]"));
        emailInputBox.sendKeys("admin@12.com");

        WebElement passInputBox = edgeDriver.findElement(By.xpath("//input[@id=\"login-password\"]"));
        passInputBox.sendKeys("123edfrt");

        WebElement loginButton = edgeDriver.findElement(By.xpath("//button[@id=\"js-login-btn\"]"));
        loginButton.click();

        WebDriverWait wait = new WebDriverWait(edgeDriver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"js-notification-box-msg\"]")));


        WebElement errorMsg = edgeDriver.findElement(By.xpath("//div[@id=\"js-notification-box-msg\"]"));
        System.out.println(errorMsg.getText());
        Assert.assertEquals(errorMsg.getText(), "Your email, password, IP address or location did not match");
        edgeDriver.quit();

    }
}
