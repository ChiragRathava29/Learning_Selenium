package com.ChiragRathava.ex_15_Relative_locators;

import com.ChiragRathava.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab43_RL_P2 extends TestCaseBoilerPlate {

    @Test
    public void test_js() {
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        //iframe
        driver.switchTo().frame("result");

        WebElement submit =  driver.findElement(By.xpath("//form[@id='form']/button"));
        submit.click();

        WebElement username_element = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement error_element = driver.findElement(with(By.tagName("small")).below(username_element));

        String errorText = error_element.getText();
        Assert.assertEquals(errorText,"Username must be at least 3 characters");

    }

}
