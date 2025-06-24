package com.theTestingSDET.ex02_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium17_RelativeXpath {
    private static final Logger log = LoggerFactory.getLogger(TestSelenium17_RelativeXpath.class);

    @Description("Make an appointment in the Katalon")
    @Owner("Aiswarya Gopal")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void make_appointment() throws InterruptedException {
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://katalon-demo-cura.herokuapp.com/");
        edgeDriver.manage().window().maximize();
        WebElement make_appointment = edgeDriver.findElement(By.xpath("//a[@id=\'btn-make-appointment\']"));
        make_appointment.click();
        List<WebElement> username = edgeDriver.findElements(By.xpath("//input[@placeholder=\"Username\"]"));
        username.get(1).sendKeys("Aiswarya Gopal");
        List<WebElement> password = edgeDriver.findElements(By.xpath("//input[@placeholder=\"Username\"]"));
        password.get(1).sendKeys("Ashu123");
        WebElement login_click = edgeDriver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        login_click.click();
        Thread.sleep(3000);
        Assert.assertEquals(edgeDriver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");
        edgeDriver.quit();

    }
}
