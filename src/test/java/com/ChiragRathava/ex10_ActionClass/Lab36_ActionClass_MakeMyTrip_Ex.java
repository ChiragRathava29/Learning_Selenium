package com.ChiragRathava.ex10_ActionClass;

import com.ChiragRathava.TestCaseBoilerPlate;
import com.ChiragRathava.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static com.ChiragRathava.ex07_WaitHelper.WaitHelpers.waitJVM;

public class Lab36_ActionClass_MakeMyTrip_Ex extends TestCaseBoilerPlate {

    @Test
    public void test_actions_p4(){

        String URL = "https://www.makemytrip.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        // Wait for the popup to come and click the x icon
        // span[@data-cy='closeModal']

        // option - 1
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        // option - 2
        WaitHelpers.checkVisibility(driver,By.xpath("//span[@data-cy='closeModal']"));

        // This will close the modal
        WebElement model = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        model.click();

        WebElement fromCity = driver.findElement(By.id("fromCity"));
//        fromCity.sendKeys("IXC");

        Actions actions = new Actions(driver);
        actions
                .moveToElement(fromCity)
                .click()
                .sendKeys("BKK")
                .build()
                .perform();

        waitJVM(3000);

        List<WebElement> list_autocomplete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        for (WebElement e: list_autocomplete){
            if (e.getText().contains("Mumbai"))
            { e.click(); }
        }


    }

}
