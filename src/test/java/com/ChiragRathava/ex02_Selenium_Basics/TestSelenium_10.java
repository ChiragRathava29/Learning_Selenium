// CURA Healthcare Service website

package com.ChiragRathava.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSelenium_10 {

    @Description("Open the URL")
    @Test
    public void test_Selenium_01() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("CURA Healthcare Service is visbile");
            Assert.assertTrue(true);
        } else {
//            System.out.println("CURA Healthcare Service is not visbile");
//            Assert.assertTrue(false);
            throw new Exception("CURA Healthcare Service is not visible");
        }

        driver.quit();

    }
}
