/* Mini Project */

// Locators - Find the Web elements
// Open the URL https://app.vwo.com/#/login
// Find the Email id** and enter the email as admin@admin.com
// Find the Pass inputbox** and enter passwrod as admin.
// Find and Click on the submit button
// Verify that the error message is shown "Your email, password, IP address or location did not match"

package com.ChiragRathava.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

// How to find the elements
// Selenium
// ID, NAME, CLASS NAME,LinkText, PartialText, TAGName,
// Advance -> Css Selector, Xpath

public class TestSelenium_17_Project_1 {

    @Description("Verify that with invalid email, pass, error message is shown on the")
    @Test
    public void test_negative_vwo_login() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
//        driver.manage().window().maximize();
        // drive.navigate().to("https://app.vwo.com/#/login");
        driver.get("https://app.vwo.com");

        // 1. Find the email input box & enter the email
        // <input /* open Tag */
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // > /*  */

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        // 2. Find the password input box & enter the password

        // <input
        // type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // >

        Thread.sleep(2000);

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("admin");

        // 3. Find the submit button & click on it
        // <button
        // class="primary-button"
        // data-qa="jobodapuxe"
        // >
        // Login
        // </button>

        // <button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
        // onclick="login.login(event)"
        // data-qa="sibequkica"
        // >
        //

        WebElement submitButton = driver.findElement(By.id("js-login-btn"));
        submitButton.click();

        Thread.sleep(3000);

        // 4. Find the invalid error message & verify.
        // <div
        // class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match</div>

        // <p
        // class="error-message"
        // data-qa="jobodapuxe"
        // >
        // Your email, password, IP address or location did not match
        // </p>

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");


        driver.quit();

    }
}
