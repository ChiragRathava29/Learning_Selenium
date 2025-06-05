package com.ChiragRathava.ex06_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium_26_Input_Checkbox_Radio {
//    @Test
//    public  void Input_type() {

    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        driver.findElement(By.name("firstname")).sendKeys("Chirag");

        // RADIO Box
        driver.findElement(By.id("sex-0")).click();

        //Check Box
        driver.findElement(By.id("tool-2")).click();

    }
}
