package com.theTestingSDET.ex15_Relative_Locators;

import com.theTestingSDET.commonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab43_RL_P3 extends commonToAll {
    @Test
    public void test_RLP1() {
        driver.get("https://www.aqi.in/in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        searchBox.sendKeys("India"+ Keys.ENTER);

        waitForJVM(5000);
        List<WebElement> cities = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));
        for(WebElement city:cities){
            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(city)).getText();
            String aqi = driver.findElement(with(By.tagName("span")).toRightOf(city)).getText();
            System.out.println("| +" + rank + " | " + city.getText() + " | " + aqi + " | ");
        }
    }
}
