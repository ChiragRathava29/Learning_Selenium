package com.ChiragRathava.ex10_ActionClass;

import com.ChiragRathava.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab35_ActionClass extends TestCaseBoilerPlate {

    @Test
    public void test_actions(){

        String URL = "https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        //Keys - Action classes
        WebElement source = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']"));
//        source.click();

        Actions actions = new Actions(driver);
        // move to element
        // click
        // send keys - BLR

        actions.moveToElement(source).click().sendKeys("BLR").build().perform();


    }

}
