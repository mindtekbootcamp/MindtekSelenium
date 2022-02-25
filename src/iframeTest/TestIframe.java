package iframeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestIframe {

    WebDriver driver;


    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/frames");
    }


   // @Test
    public void test1(){

        driver.findElement(By.linkText("iFrame")).click();
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        String text = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();

        System.out.println(text);

        driver.switchTo().defaultContent();
        //driver.switchTo().parentFrame();
        driver.findElement(By.linkText("Elemental Selenium")).click();

    }

    @Test
    public void getSizeOfFrame(){

        driver.findElement(By.linkText("iFrame")).click();

       int sizeofFrames = driver.findElements(By.tagName("iFrame")).size();

        System.out.println(sizeofFrames);
    }






}
