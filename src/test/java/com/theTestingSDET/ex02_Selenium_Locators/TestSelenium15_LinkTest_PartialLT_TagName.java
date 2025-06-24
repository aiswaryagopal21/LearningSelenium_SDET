package com.theTestingSDET.ex02_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium15_LinkTest_PartialLT_TagName {
    @Description("Login VWO")
    @Test
    public void test_login_vwo() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://app.vwo.com");

       // WebElement freeTrial_click = webDriver.findElement(By.linkText("Start a free trial"));
       // freeTrial_click.click();

        WebElement freeTrial_click = webDriver.findElement(By.partialLinkText("Start a free"));
        freeTrial_click.click();
        webDriver.quit();
    }
}
