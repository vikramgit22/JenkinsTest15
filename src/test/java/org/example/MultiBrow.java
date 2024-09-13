package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiBrow {

    public static void main(String[] args) {

        /*System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Driver\\chromedriver.exe");
        ChromeOptions options1 = new ChromeOptions();
        options1.addArguments("user-data-dir=C:/Users/Admin/AppData/Local/Google/Chrome/User Data/Profile1");
        options1.addArguments("--remote-debugging-port=9222");

        // Start first Chrome instance
        WebDriver chromeDriver1 = new ChromeDriver(options1);
        chromeDriver1.get("https://www.flipkart.com/");

        // Set Chrome options for second instance
        ChromeOptions options2 = new ChromeOptions();
        options2.addArguments("user-data-dir=C:/Users/Admin/AppData/Local/Google/Chrome/User Data/Profile2");
        options2.addArguments("--remote-debugging-port=9223");

        // Start second Chrome instance
        WebDriver chromeDriver2 = new ChromeDriver(options2);
        chromeDriver2.get("https://rahulshettyacademy.com/gq/graphql");


        chromeDriver1.navigate().refresh();
        chromeDriver1.get("https://docs.cypress.io/api/commands/request");*/

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Driver\\chromedriver.exe");
       /* ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        // Open the first website
        driver.get("https://docs.cypress.io/api/commands/request");
        System.out.println("First Tab: " + driver.getTitle());

        // Open a new tab
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open();");

        // Switch to the new tab
        String originalHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Open a website in the new tab
        driver.get("https://mvnrepository.com/");
        System.out.println("Second Tab: " + driver.getTitle());

        // Switch back to the original tab
        driver.switchTo().window(originalHandle);
        System.out.println("Back to First Tab: " + driver.getTitle());

        // Close all browser windows
        driver.quit();
*/

        //-------------------------------------------------------------
        WebDriver driver1 = new ChromeDriver();

        // Open multiple tabs
        driver1.get("https://www.flipkart.com/");
        openNewTab(driver1, "https://www.youtube.com/");
        openNewTab(driver1, "https://mvnrepository.com/");


        // Switch to a specific tab by title
        switchToTabByTitle(driver1, "Youtube");

        // Perform actions on the selected tab...

        // Close all browser windows
        //driver1.quit();
    }

    // Helper method to open a new tab with a specific URL
    private static void openNewTab(WebDriver driver1, String url) {
        ((JavascriptExecutor) driver1).executeScript("window.open();");
        for (String handle : driver1.getWindowHandles()) {
            driver1.switchTo().window(handle);
        }
        driver1.get(url);
    }

    // Helper method to switch to a tab based on its title
    private static void switchToTabByTitle(WebDriver driver1, String title) {
        // Iterate over all window handles
        for (String handle : driver1.getWindowHandles()) {
            driver1.switchTo().window(handle);

            // Check if the title matches
            if (driver1.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Switched to tab with title: " + title);
                return;
            }
        }

        // If no tab with the given title is found
        System.out.println("No tab with title: " + title + " found.");
    }

    }


