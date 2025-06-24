package com.theTestingSDET.ex02_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium14_Id_name_classname {
    private static final Logger log = LoggerFactory.getLogger(TestSelenium14_Id_name_classname.class);

    @Description("Invalid login check in vwo app with error message displayed")
    @Owner("Aiswarya Gopal")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void invalid_Login_vwo() /*throws InterruptedException*/ {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver webDriver = new EdgeDriver(edgeOptions);
        webDriver.get("https://app.vwo.com");
        WebElement email_textBox =  webDriver.findElement(By.id("login-username"));
        email_textBox.sendKeys("aiswarya.gopal21@gmail.com");
        WebElement password_textBox = webDriver.findElement(By.name("password"));
        password_textBox.sendKeys("hsfh23");
        WebElement login_button = webDriver.findElement(By.id("js-login-btn"));
        login_button.click();
        //Thread.sleep(3000); or try and catch
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement error_message = webDriver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");
        webDriver.quit();
    }
}
