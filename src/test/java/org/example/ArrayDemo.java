package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ArrayDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        String parent = driver.getWindowHandle();  // get parent
        //driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();
        driver.findElement(By.id("opentab")).click();
        //driver.wait(2000);

        Set<String> handles= driver.getWindowHandles();

        for(String hand:handles)
        {
            if(!hand.equals(parent))
            {
                driver.switchTo().window(hand);
                driver.manage().window().maximize();
                break;
            }
        }

        System.out.println(driver.getTitle());
        Assert.assertEquals("QAClick Academy - A Testing Academy to Learn, Earn and Shine",driver.getTitle());
        driver.close();
        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());
        //driver.wait(2000);

        driver.findElement(By.xpath("//input[@placeholder=\"Enter Your Name\"]"))
                .sendKeys("Vikram");

        driver.findElement(By.id("alertbtn")).click();
        //driver.wait(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
       /*driver.findElement(By.id("opentab")).click();
       driver.wait(2000);
*/

        // iframes

        driver.switchTo().frame("courses-iframe");

        driver.findElement(By.xpath("(//ul[@class='navigation clearfix'])[1]//child::li[5]")).click();

        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//button[@class='btn btn-primary'][2]")).click();








    }


}
