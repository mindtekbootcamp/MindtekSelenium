package iframeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestIframe1 {



    WebDriver driver;


    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/drivers/chromedriver");

        driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/WebDriver.html");
    }


    @Test
    public void test1(){

        // index
        // by name
        // Webelement

        //driver.switchTo().frame(0);

        driver.switchTo().frame("packageListFrame");

        WebElement b = driver.findElement(By.linkText("org.openqa.selenium"));
        b.click();


        driver.switchTo().defaultContent();

        driver.switchTo().frame(2);

        System.out.println("PASSED");


    }



}
