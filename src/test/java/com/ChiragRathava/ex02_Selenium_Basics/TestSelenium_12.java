package com.ChiragRathava.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_12 {

    @Description("Open the URL")
    @Test
    public void test_Selenium_01() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        // Use Navigation Commands
        // driver.get("url") -> Navigate to a URl

        // Use navigation methods
        driver.navigate().to("https://bing.com");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();

        Thread.sleep(5000);

        driver.quit();

    }
}
