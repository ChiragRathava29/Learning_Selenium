package com.ChiragRathava.ex_16_Selenium_Exceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab_48_InvalidSelector {

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
            WebElement Invalid_xpath  = driver.findElement(By.xpath("//textarea[@id='abc']"));
        } catch (InvalidSelectorException e) {
            System.out.println("InvalidSelectorException");
        }

        // org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //textarea[@id='abc'] because of the following error:

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
