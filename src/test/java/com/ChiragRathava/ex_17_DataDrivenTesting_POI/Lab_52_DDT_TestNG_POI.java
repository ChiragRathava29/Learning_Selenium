package com.ChiragRathava.ex_17_DataDrivenTesting_POI;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab_52_DDT_TestNG_POI {

    public EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }

    @Test(dataProvider = "getData")
    public void test_vwo_login(String email, String password) {
        System.out.println(email + " - " + password);
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][] {
                new Object[]{"admin@gmail.com","pass123"},
                new Object[]{"admin123@gmail.com","pass123"},
                new Object[]{"admin123@gmail.com","pass124"}
        };
    }

    @DataProvider
    public Object[][] getDataxlsx() {
        // READ THE DATA FROM THE EXCEL FILE
        // GIVE THEM IN THE 2D ARRAY
        return new Object[][]{};
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
