package testWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
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
    public void getWindowId(){
        String windowId = driver.getWindowHandle();
         System.out.println(windowId);
        //CDwindow-E102F1B6A0904FABE62E041174889AB3
        //CDwindow-C96ADA7D4A01115D88FDD84C330DB245
    }

    @Test
    public void getWindowIds(){

        //1
        WebElement link = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        link.click();

       Set<String> windowIds = driver.getWindowHandles();

       Iterator<String> it = windowIds.iterator();
       String parentId = it.next();
       String childId = it.next();

       System.out.println("Parent window ID "+ parentId);
       System.out.println("Child window ID "+ childId);

       driver.switchTo().window(parentId);
       System.out.println( "This is parent window title "+driver.getTitle());

       driver.switchTo().window(childId);
        System.out.println(driver.getTitle());

    }


    @Test
    public void verifyChildWindowLogo(){
        // OPEN SECOND WINDOW
        // VERIFY "NEW WINDOW" IS DISPLAYED
        // use only css when you inspect NEW WINDOW
        // assertion should be assertEqual

        WebElement link = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        link.click();

       Set<String> windowIds = driver.getWindowHandles();

       Iterator<String> iterator =  windowIds.iterator();

       String parentWindowId = iterator.next();
       String childWindowId=iterator.next();

       driver.switchTo().window(childWindowId);

       String  expectedResult ="New Window";
       String actualResult = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();

        Assert.assertEquals(actualResult, expectedResult);






    }






}
