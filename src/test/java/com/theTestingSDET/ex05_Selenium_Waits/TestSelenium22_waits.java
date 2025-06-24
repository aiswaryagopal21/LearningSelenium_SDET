package com.theTestingSDET.ex05_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class TestSelenium22_waits {
    @Description("Verify Ebay print the prices (imac)")
    @Test
    public void test_verify_print_imac_price(){
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        edgeDriver.get("https://app.vwo.com");
    }
}
