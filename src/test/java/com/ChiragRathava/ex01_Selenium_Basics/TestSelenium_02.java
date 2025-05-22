package com.ChiragRathava.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_02 {

    @Description("Open the app.vwo.com and verify the titel!")
    @Test
    public void test_Selenium_02() {
        // Steps

        // 1. Open the URL
        EdgeDriver driver = new EdgeDriver();
        // new EdgeDriver() -> POST Request(Browser Driver) (localhost:xxxxx), create a new session Endpoint

        // 2. Navigate the URL -> get the URL
        driver.get("https://app.vwo.com");

        // 3. Assert the URL - Validation - TestNG Assertion
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        driver.quit();

    }
}
