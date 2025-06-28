package com.ChiragRathava.ex11_File_Upload;

import com.ChiragRathava.TestCaseBoilerPlate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Lab39_FileUpload extends TestCaseBoilerPlate {

    @Test
    public void test_fileupload_p5() {

        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        String working_dir = System.getProperty("user.dir");
        System.out.println(working_dir);

//        uploadFileInput.sendKeys("C:\\Users\\Chirag\\IdeaProjects\\Learning_Selenium\\src\\test\\java\\com\\ChiragRathava\\ex11_File_Upload\\TestData.txt");
        uploadFileInput.sendKeys("C:/Users/Chirag/IdeaProjects/Learning_Selenium/src/test/java/com/ChiragRathava/ex11_File_Upload/TestData.txt");

        // use this but get a error because of working_dir like C:\Users but source like src/
//        uploadFileInput.sendKeys(working_dir+"src/test/java/com/ChiragRathava/ex11_File_Upload/TestData.txt");

        driver.findElement(By.cssSelector("input[type='submit']")).click();

    }
}
