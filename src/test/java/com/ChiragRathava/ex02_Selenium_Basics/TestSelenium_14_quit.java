package com.ChiragRathava.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_14_quit {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        Thread.sleep(5000);
//        driver.close();

        // Close - will close the current tab, not the session (not the all tabs)
        // session id != null

        driver.quit();
        // It will close all the tabs. - session id == null

    }
}
