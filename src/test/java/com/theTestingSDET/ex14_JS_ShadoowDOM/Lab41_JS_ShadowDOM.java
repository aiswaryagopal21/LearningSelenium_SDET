package com.theTestingSDET.ex14_JS_ShadoowDOM;

import com.theTestingSDET.commonToAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Lab41_JS_ShadowDOM extends commonToAll {
    @Test
    public void JS_test_sDOM(){
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        //WebElement pizza = driver.findElement(By.id("pizza"));
        //pizza.sendKeys("farmhouse");
        //Directly it will not work bez this is under the shadowDOM so use JS
        waitForJVM(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza')");
        inputboxPizza.sendKeys("farmhouse");

    }
}
