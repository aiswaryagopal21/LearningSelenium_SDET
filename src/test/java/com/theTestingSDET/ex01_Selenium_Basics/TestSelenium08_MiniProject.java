package com.theTestingSDET.ex01_Selenium_Basics;


import com.theTestingSDET.commonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium08_MiniProject extends commonToAll {
    @Description("Open the URL")
    @Test
    public void katalonProject() throws Exception {
        WebDriver driver = new EdgeDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/");


        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Testcase Passed!");
            Assert.assertTrue(true);
        }else{
            throw new Exception("CURA Healthcare Service is not visible");
            //Assert.assertFalse("CURA Healthcare Service is not visible");
        }
        closeBrowser(driver);
    }

}
