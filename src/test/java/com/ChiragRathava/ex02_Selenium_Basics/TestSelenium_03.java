package com.ChiragRathava.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_03 {

    @Description("Open the app.vwo.com and Get the titel!")
    @Test
    public void test_Selenium_02() {

        // Selenium 3
        // You need to set the Driver(browser)
        //System.getProperty("webdriver.gecko.driver", "/path/geckodriver");

        // Selenium 4
        // Selenium Manager - utility - which can dowload the driver automatically.
        // start and stop itself.
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");

    }
}
