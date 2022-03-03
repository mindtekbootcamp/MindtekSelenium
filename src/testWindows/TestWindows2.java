package testWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestWindows2 {


    WebDriver driver;

    @BeforeMethod
    public void launchApp(){
        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/drivers/chromedriver");

        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    public void getChildWindowTitle(){

        WebElement link = driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']"));
        link.click();



        Set<String> windIDS = driver.getWindowHandles();

        Iterator<String> iterator =windIDS.iterator();

        String pId = iterator.next();
        String cId= iterator.next();

        driver.switchTo().window(cId);

        System.out.println(driver.getTitle());

        // switch to parent window
        // verify Parent window logo is displayed

         driver.switchTo().window(pId);
//
//        WebElement logo = driver.findElement(By.id("divLogo"));
//       // boolean logoDisplayed = logo.isDisplayed();
//
//        Assert.assertTrue(logo.isDisplayed());
//
//
//        System.out.println("ASSERTION PASSED");

    }


    @Test
    public void test2(){

        //open the web
        // click link below
        // close the window which title is OrangeHRM

        WebElement link = driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']"));
        link.click();

        Set<String> windowIds = driver.getWindowHandles();

        for (String winiD :  windowIds  ) {
           String title = driver.switchTo().window(winiD).getTitle();

           if (title.equals("OrangeHRM")){
               driver.close();
           }
        }



    }


    @AfterMethod
    public void tearDown(){

       // driver.close();   // it closes current window
        driver.quit();   // it closes all windows

    }
}
