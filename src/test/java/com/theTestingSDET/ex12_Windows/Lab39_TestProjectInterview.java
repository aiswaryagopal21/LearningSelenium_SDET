package com.theTestingSDET.ex12_Windows;

import com.theTestingSDET.commonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Lab39_TestProjectInterview extends commonToAll {
    @Test
    public void test_interview_Quetsion() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1&accountId=666400");
        Thread.sleep(5000);

        String parent = driver.getWindowHandle();
        System.out.println(parent);

        List<WebElement> list_heatmaps = driver.findElements(By.xpath("//img[@data-qa=\"danawobuqa\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(list_heatmaps.get(1)).click().build().perform();
        Thread.sleep(1500);

        Set<String> allHandles = driver.getWindowHandles();
        for(String handle:allHandles){
            if(!handle.equals(parent)){
                driver.switchTo().window(handle);
                driver.switchTo().frame("heap-iframe");
                WebElement click_map_button = driver.findElement(By.xpath("data-qa=\refoyekife\""));
                click_map_button.click();
            }
        }

    }
}