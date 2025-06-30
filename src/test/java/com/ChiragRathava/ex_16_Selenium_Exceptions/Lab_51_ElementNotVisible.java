package com.ChiragRathava.ex_16_Selenium_Exceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab_51_ElementNotVisible {

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

        driver.get("https://www.netflix.com/in/");

        try {
            WebElement emailInput = driver.findElement(By.name("email"));

            // Forcefully hide the element using JavaScript
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.display='none';", emailInput);

            emailInput.sendKeys("test@example.com");
        } catch (ElementNotInteractableException e) {
            System.out.println("ElementNotInteractableException");;
        }

        // org.openqa.selenium.ElementNotInteractableException: element not interactable

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
