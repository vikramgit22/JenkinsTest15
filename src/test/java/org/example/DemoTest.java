package org.example;

import ExceptionH.BaseDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DemoTest implements ITestListener {

    private WebDriver driver;


    @BeforeClass
    public void setup()
    {
        driver = BaseDriver.getInstance();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void fail()
    {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        Actions actions = new Actions(driver);
        WebElement hove = driver.findElement(By.id("mousehover"));
        actions.moveToElement(hove).perform();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("return document.readystate").equals("complete");
        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        webDriverWait.until(driver->js.executeScript("return document.readystate").equals("complete"));
         webDriverWait.until(ExpectedConditions.visibilityOf(hove));

        Wait<WebDriver> fluentWaitWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2))
                                .ignoring(NoSuchElementException.class);

        WebElement ele = fluentWaitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
        ele.click();

        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='mouse-hover-content']//a"));

         for(WebElement e:list)
         {
             if(e.getText().equalsIgnoreCase("Reload"))
             {
                 e.click();
             }
         }

    }

    @Test(priority = 0)
    public void sbrower()
    {
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/gq/graphql");
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot(result.getMethod().getMethodName());
    }

    private void takeScreenshot(String methodName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("screenshots/" + methodName + ".png");

        try {
            FileHandler.createDir(new File("screenshots")); // Create directory if not exists
            FileHandler.copy(source, destination);
            System.out.println("Screenshot saved to: " + destination.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
