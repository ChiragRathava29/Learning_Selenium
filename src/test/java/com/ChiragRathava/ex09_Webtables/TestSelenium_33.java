// Dynamic Table

package com.ChiragRathava.ex09_Webtables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_33 {

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void test_web_table_login() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));

        // rows and columns
        List<WebElement> row_tables = table.findElements(By.tagName("tr"));

        for (int i = 0; i < row_tables.size(); i++){
            List<WebElement> col = row_tables.get(i).findElements(By.tagName("td"));

            for (WebElement c : col){
                System.out.println(c.getText());
            }
        }
        driver.quit();
    }
}

