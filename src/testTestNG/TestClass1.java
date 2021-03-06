package testTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {

    WebDriver driver;
    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    @Test
    public void testCheckBox(){


        WebElement checkBox1= driver.findElement(By.id("isAgeSelected"));

        Assert.assertFalse(checkBox1.isSelected());

        checkBox1.click();
        System.out.println(checkBox1.isSelected());

        Assert.assertTrue(checkBox1.isSelected());

    }


    @Test
    public void checkBox2(){

        WebElement option1= driver.findElement(By.xpath("(//input[@class='cb1-element'])[1]"));

        //Assert.assertFalse(option1.isSelected());
        Assert.assertTrue(option1.isSelected());

        option1.click();
        System.out.println("Option 1 is selected "+ option1.isSelected());

        Assert.assertTrue(option1.isSelected());

    }


    @AfterMethod
    public void tearDown(){
       // driver.quit();
    }





}
