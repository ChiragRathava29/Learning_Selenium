package com.ChiragRathava.ex_16_Selenium_Exceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab_49_NoSuchWindow {

    public EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }

    @Test
    public void test_selenium_exceptions() {

        System.out.println("start of program");

        driver.get("https://google.com");

        try {
            WebDriver No_Window = driver.switchTo().window("https://www.bing.com");
        } catch (NoSuchWindowException e) {
            System.out.println("NoSuchWindowException");;
        }
        // org.openqa.selenium.NoSuchWindowException: no such window

        System.out.println("End of program");
    }

    @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
