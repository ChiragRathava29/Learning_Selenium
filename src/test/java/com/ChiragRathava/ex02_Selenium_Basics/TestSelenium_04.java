package com.ChiragRathava.ex02_Selenium_Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSelenium_04 {
    public static void main(String[] args) {

        //Webdriver hierarchy

        // SearchContext(I) -> 2 methods
        // 1. WebDriver(I)(10)
        // 2. RemoteWebDriver(C)(15)
        /// -> ChromiumDriver(C)(25)
        /// -> EdgeDriver(C)(45)

        // SearchContext(I)
        // -> WebElement(I)
        // -> RemoteWebDriver(C)
        // -> ChromiumDriver(C) /* It is open shource project] */
        // -> ChromeDriver(C)
        // -> EdgeDriver(C)

        // SearchContext - Interface - findElement & findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - Class - It also has some functions - F
        // ChromeDriver, FirefoxDriver, edgeDriver, SafariDriver, InternetExplorerDriver - Class - S

        /* All Valid Drivers */

        // SearchContext  driver = new ChromeDriver();
//        SearchContext driver = new EdgeDriver();
//        SearchContext driver1 = new FirefoxDriver();
//        SearchContext driver2 = new InternetExplorerDriver();

//        WebDriver driver = new ChromeDriver();
//        RemoteWebDriver driver1 = new ChromeDriver();
//        ChromeDriver driver2 = new ChromeDriver();

        // Scenarios

        // 1. Do you want to run on Chrome then change to Edge ?
        ChromeDriver driver_1 = new ChromeDriver();

        // 2. Do you want to run on Chrome then change to Edge ?
        WebDriver driver_2 = new ChromeDriver();
        driver_2 = new EdgeDriver(); // 97%
        driver_2 = new FirefoxDriver(); // 97%
        driver_2 = new InternetExplorerDriver(); // 97%

        // 3. Do you want to run on multiple browsers, aws machine, ....? 2%
        // RemoreDriver driver (with GRID) - Advance (Last 2 Sessions)
        RemoteWebDriver driver_3 = new ChromeDriver();
    }
}
