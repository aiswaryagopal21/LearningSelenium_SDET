package com.theTestingSDET.ex02_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Practice {
    private static final Logger log = LoggerFactory.getLogger(Practice.class);

    @Description("Using xpath only in app vwo for invalid login")
    @Owner("Aiswarya Gopal")
    @Severity(SeverityLevel.MINOR)
    @Test
    public void app_vwo(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement appointment = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
        appointment.click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");
        List<WebElement> username = driver.findElements(By.xpath("//input[@placeholder=\"Username\"]"));
        username.get(1).sendKeys("aishu@gmail.com");
        List<WebElement> password = driver.findElements(By.xpath("//input[@placeholder=\"Password\"]"));
        password.get(1).sendKeys("aisw223");
        WebElement login = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        login.click();
        driver.quit();
    }

}
