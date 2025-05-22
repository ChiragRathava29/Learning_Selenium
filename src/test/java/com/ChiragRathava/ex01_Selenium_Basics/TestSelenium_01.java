package com.ChiragRathava.ex01_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium_01 {

        @Test
        public void test_VerifyVWOLogin() {

        // Write the code which will execute the perform the ui interactions
        FirefoxDriver driver = new FirefoxDriver(); /* Make a POST to BD -> FirefoxDriver */
        driver.get("https://app.vwo.com");
            System.out.println(driver.getTitle());
            System.out.println(driver.getSessionId());
            driver.quit();

        /* ```
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://sdet.live");
        driver.quit();
        ```


        - `FirefoxDriver - Class Loaded in the JVM as Class Laoder.`
        - driver - instance (object ref) is created. -> null area.
        - `new FirefoxDriver();-> Object of the class FirefoxDriver is created.`
        - POST Request -> New Session in Selenium - New Fresh Firefox Copy(browser's copy) is created - JVM heap area.
        - Unique Session ID is created - 841d18b9c0ec4aaaf1c3baeb1e4b2a83 - 16 digit
        - `Session -> Run the commands - POST Request - [﻿www.w3.org/TR/webdriver2/#new-session](https://www.w3.org/TR/webdriver2/#new-session)`
        -  Open a Fresh copy of thre Edge Browser, POST Request -> Open the URL - https//sdet.live.
        - `Driver - Command (POST) Request - Shutdown the browser.` Session == null.
         */
    }
}
