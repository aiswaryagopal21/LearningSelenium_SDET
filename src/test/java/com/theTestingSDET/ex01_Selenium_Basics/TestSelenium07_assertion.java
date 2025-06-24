package com.theTestingSDET.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium07_assertion {
    @Description("Open URL")
    @Test
    public void assertion(){
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://google.com");
        //Assert.assertEquals(edgeDriver.getCurrentUrl(),"https://www.google.com/");
        assertThat(edgeDriver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com");


    }

    
}
