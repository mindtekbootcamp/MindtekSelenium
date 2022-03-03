package testWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WindowTest1 {

    WebDriver driver;

    @BeforeMethod
    public void launchApp(){
        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/drivers/chromedriver");

        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
    }

    @Test
    public void test1(){

       String windowId = driver.getWindowHandle();

       System.out.println(windowId);
        //CDwindow-E102F1B6A0904FABE62E041174889AB3
        //CDwindow-C96ADA7D4A01115D88FDD84C330DB245
    }


}
