package iframeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframeTest2 {


    WebDriver driver;


    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
    }

    @Test
    public void test1(){

        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));

        driver.findElement(By.id("fname")).clear();

        driver.findElement(By.id("fname")).sendKeys("Emrah");

        driver.switchTo().defaultContent();
        //driver.switchTo().parentFrame();


        // print size of frames in this app

        int sizeoFFrame = driver.findElements(By.tagName("iframe")).size();
        System.out.println("There are " + sizeoFFrame);



    }




}
