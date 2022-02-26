package waittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestExplicitlyWait {



    WebDriver driver;


    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/drivers/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");


    }

    @Test
    public void testWait(){
        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

        System.out.println(driver.findElement(By.id("message")).getText());
    }


    @Test
    public void test2(){

        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

        System.out.println(driver.findElement(By.id("message")).getText());





    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
