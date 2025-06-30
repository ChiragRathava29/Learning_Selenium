package com.ChiragRathava.ex_16_Selenium_Exceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab_50_ElementClickIntercepted {

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

        driver.get("https://www.airindia.com/");

        try {
            WebElement bookMenu = driver.findElement(By.xpath("//a[contains(text(),'Book')]"));
            bookMenu.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("ElementClickInterceptedException");;
        }
        // org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element <a id="headernav1" href="#" onclick="return false" class="aic ">...</a> is not clickable at point (279, 57). Other element would receive the click: <div class="onetrust-pc-dark-filter ot-fade-in" style="z-index:2147483645;"></div>

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
