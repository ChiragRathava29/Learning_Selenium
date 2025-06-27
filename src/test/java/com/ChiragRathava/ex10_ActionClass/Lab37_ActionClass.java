package com.ChiragRathava.ex10_ActionClass;

import com.ChiragRathava.TestCaseBoilerPlate;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab37_ActionClass extends TestCaseBoilerPlate {

    @Test
    public void test_actions_p5() {

        driver.get("https://courses.thetestingacademy.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

    }
}
