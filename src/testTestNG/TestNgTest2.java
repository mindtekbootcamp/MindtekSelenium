package testTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNgTest2 {

    WebDriver driver;



    @BeforeMethod
    public void test1(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }


    @Test
    public void test2(){

        WebElement checkBox1= driver.findElement(By.id("isAgeSelected"));
        checkBox1.click();
        System.out.println(checkBox1.isSelected());
    }

    @Test
    public void test5(){

        WebElement option1= driver.findElement(By.xpath("(//input[@class='cb1-element'])[1]"));
        option1.click();
        System.out.println("Option 1 is selected "+ option1.isSelected());
    }


    @AfterMethod
    public void test3(){
        driver.quit();

    }

}
