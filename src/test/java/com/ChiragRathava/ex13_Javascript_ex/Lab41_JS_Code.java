package com.ChiragRathava.ex13_Javascript_ex;

import com.ChiragRathava.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

public class Lab41_JS_Code extends TestCaseBoilerPlate {

    @Test
    public void test_js() {
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement div_to_scroll = driver.findElement(By.cssSelector("[id=\"userName\"]"));


//        js.executeScript("arguments[0].scrollIntoView(true);",div_to_scroll);
//        js.executeScript("alert(1);");

        // normal sendkeys -> action class -> js.executeScript

        // another option to scroll
        js.executeScript("window.scrollBy(0,500);");

        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);

    }

}
