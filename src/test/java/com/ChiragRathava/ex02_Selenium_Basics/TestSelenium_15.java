package com.ChiragRathava.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium_15 {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        // FirefoxOptions, ChromeOptions, SafariOptions

        // EdgeOptions -> It will help you set the browser
        // options to browser
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // addd extensions - browsers
        // 100+ other , https, http
        // localstorage, download ?

//        edgeOptions.addArguments("--window-size=1280,720");
//        edgeOptions.addArguments("--window-size=800,600");
//        edgeOptions.addArguments("--incognito");
//        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--headless");


        EdgeDriver driver = new EdgeDriver(edgeOptions);

        Thread.sleep(5000);

        driver.quit();


    }
}
