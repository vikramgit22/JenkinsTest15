package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SeleniumGridTest {
    public static void main(String[] args) throws Exception {
        // Set desired capabilities for Chrome browser
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");

        // Initialize the remote WebDriver with the Hub URL
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), capabilities);

        // Perform test actions
        driver.get("https://www.flipkart.com/");
        System.out.println("Title: " + driver.getTitle());

        // Clean up
        //driver.quit();
    }
}
