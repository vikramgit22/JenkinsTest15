package ExceptionH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseDriver {

    private static WebDriver driver;

    private BaseDriver()
    {

    }

    public static WebDriver getInstance()
    {
        if(driver==null)
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Driver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Reset the instance
        }
    }

}
