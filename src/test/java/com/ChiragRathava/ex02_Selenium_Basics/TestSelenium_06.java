package com.ChiragRathava.ex02_Selenium_Basics;

public class TestSelenium_06 {
    public static void main(String[] args) {

        // If you are using selenium 3.14

        // Edge
        System.setProperty("webdriver.edge.driver", "C:/Users/Chirag/Downloads/edgedriver_win64/msedgedriver.exe");

        // Chrome
        System.setProperty("webdriver.chrome.driver", "/path/chromedriver");

        // Firefox
        System.setProperty("webdriver.gecko.driver", "/path/geckodriver");

        // Internet Explorer
        System.setProperty("webdriver.ie.driver", "/path/IEDriverServer.exe");

        // Safari
        System.setProperty("webdriver.safari.driver", "/path/safari");

        // Selenium 4.x - Selenium Manager - will download the driver automatically.
        // when needed when you start the Selenium Server.

    }
    // If you are using selenium 3.14
}
