package MultiThreadDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class BrowserThread implements Runnable {
    private String url;
    private String browserName;

    public BrowserThread(String url, String browserName) {
        this.url = url;
        this.browserName = browserName;
    }

    @Override
    public void run() {
        // Set up the WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the URL
            driver.get(url);
            System.out.println(browserName + " - Page title: " + driver.getTitle());

            // Interact with elements (example: clicking a button, entering text)
            WebElement inputField = driver.findElement(By.name("q")); // Assuming there's an input with name 'q'
            inputField.sendKeys("Hello from " + browserName);

            WebElement searchButton = driver.findElement(By.name("btnK")); // Assuming there's a search button with name 'btnK'
            searchButton.click();

            System.out.println(browserName + " - Performed actions successfully.");
        } catch (Exception e) {
            System.err.println(browserName + " - Error: " + e.getMessage());
        } finally {
            // Clean up
            driver.quit();
        }
    }

    public static void main(String[] args) {
        // Creating threads for two different browser sessions
        Thread browser1 = new Thread(new BrowserThread("https://www.google.com", "Browser 1"));
        Thread browser2 = new Thread(new BrowserThread("https://www.bing.com", "Browser 2"));

        // Start the threads
        browser1.start();
        browser2.start();
    }
}

