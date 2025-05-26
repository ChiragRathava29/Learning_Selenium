// Verify that invalid email give thes error on singup page


package com.ChiragRathava.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_19_Mini_Project_2 {

    @Owner("Chirag")
    @Severity(SeverityLevel.BLOCKER)
//    @TmsLink("Jira Bug_id Link")
    @Description("Verify that invalid email give thes error on singup page")
    @Test
    public void vwo_free_trail_error_verify() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
        a_tag_partial_match.click();

        System.out.println(driver.getCurrentUrl());

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement input_email = driver.findElement(By.id("page-v1-step1-email"));
        input_email.sendKeys("abc");

        //<input class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)" type="checkbox" name="gdpr_consent_checkbox" id="page-free-trial-step1-cu-gdpr-consent-checkbox" value="true" data-qa="page-free-trial-step1-gdpr-consent-checkbox">
        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        // Create a Free Trial Account
        // <button type="submit" disabled="" class="button button--disabled-primary W(100%) btn-modal-form-submit" data-qa="page-su-submit">Create a Free Trial Account</button>
        /* As you can see the ID, classname, name, type ; is not working */
        // then we use the Tag name.

        List<WebElement> button_List = driver.findElements(By.tagName("button"));
        button_List.get(0).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // <div
        // class="C($color-red) Fz($font-size-12)
        // Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        // </div>

        // Option - 1
//        WebElement error_message = driver.findElement(By.className("invalid-reason"));
//        Assert.assertTrue(error_message.isDisplayed());
//        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");

        // Option - 2
        List<WebElement> error_message = driver.findElements(By.className("invalid-reason"));
//        Assert.assertTrue(error_message.isDisplayed());
        Assert.assertEquals(error_message.get(0).getText(), "The email address you entered is incorrect.");


        driver.quit();

    }

}
