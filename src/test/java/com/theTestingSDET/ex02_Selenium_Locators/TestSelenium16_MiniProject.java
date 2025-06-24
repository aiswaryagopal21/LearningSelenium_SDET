package com.theTestingSDET.ex02_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium16_MiniProject {
    @Description("Vwo login free trial")
    @Test
    public void free_trial() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        WebElement freeTrial_click = driver.findElement(By.linkText("Start a free trial"));
        freeTrial_click.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email_Box = driver.findElement(By.id("page-v1-step1-email"));
        email_Box.sendKeys("abc");

        WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        WebElement create_button = driver.findElement(By.tagName("button"));
        create_button.click();
        Thread.sleep(3000);
        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        System.out.println(error_msg.getText());
        driver.quit();

    }
}
