/* Use Case Selenium */
// QA Lead has given, that You need to start the browser with the ad blocker extension installed.

package com.ChiragRathava.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium_16_Task_Add_Extension {

    @Description("Options Class")
    @Test
    public void test_Selenium_01() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addExtensions(new File("src/test/java/com/ChiragRathava/ex02_Selenium_Basics/AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx"));

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=a9Hxkc9YxGE&list=RDa9Hxkc9YxGE&start_radio=1&ab_channel=YRF");

//        driver.manage().deleteAllCookies();
    }
}
