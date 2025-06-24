package com.theTestingSDET.ex05_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;


public class TestSelenium25_FluentWaits {
    private static final Logger log = LoggerFactory.getLogger(TestSelenium25_FluentWaits.class);

    @Description("Verify Ebay print the prices (imac)")
    @Test
    public void test_verify_print_imac_price() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());

        WebElement emailInputBox = driver.findElement(By.xpath("//input[@id=\"login-username\"]"));
        emailInputBox.sendKeys("admin@12.com");

        WebElement passInputBox = driver.findElement(By.xpath("//input[@id=\"login-password\"]"));
        passInputBox.sendKeys("123edfrt");

        WebElement loginButton = driver.findElement(By.xpath("//button[@id=\"js-login-btn\"]"));
        loginButton.click();


        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
        WebElement errorMessage = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver edgeDriver) {
                return edgeDriver.findElement(By.className("notification-box-description"));
            }
        });

        WebElement errorMsg = driver.findElement(By.xpath("//div[@id=\"js-notification-box-msg\"]"));
        System.out.println(errorMsg.getText());
        Assert.assertEquals(errorMsg.getText(), "Your email, password, IP address or location did not match");
        driver.quit();

    }
}
