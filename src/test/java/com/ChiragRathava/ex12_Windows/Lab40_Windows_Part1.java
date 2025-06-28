package com.ChiragRathava.ex12_Windows;

import com.ChiragRathava.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab40_Windows_Part1 extends TestCaseBoilerPlate {

    @Test
    public void test_fileupload_p5() {

        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent);

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("window handles: " + windowHandles);

        for (String handle: windowHandles){
            driver.switchTo().window(handle);
            if (driver.getPageSource().contains("New Window"))
            { System.out.println("test case Passed"); }
            driver.switchTo().window(parent);
        }

    }

}
