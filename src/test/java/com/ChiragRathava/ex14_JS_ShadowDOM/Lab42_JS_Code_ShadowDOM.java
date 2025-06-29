package com.ChiragRathava.ex14_JS_ShadowDOM;

import com.ChiragRathava.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static com.ChiragRathava.ex07_WaitHelper.WaitHelpers.waitJVM;

public class Lab42_JS_Code_ShadowDOM extends TestCaseBoilerPlate {

    @Test
    public void test_js() {
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement div_to_scroll = driver.findElement(By.cssSelector("[id=\"userName\"]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(div_to_scroll).build().perform();
//        js.executeScript("window.scrollBy(0,500);");

        // It is not work
//        WebElement pizza = driver.findElement(By.id("pizza"));
//        pizza.sendKeys("oniun");

        // Shadow DOM -> js.executeCode
        waitJVM(10000);



        WebElement inputbox_Pizza = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"input#pizza\");");
        inputbox_Pizza.sendKeys("Onion");

    }

}
