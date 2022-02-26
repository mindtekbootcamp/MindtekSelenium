package testActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestDragDrop {



    WebDriver driver;


    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/drivers/chromedriver");

        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

    }

   // @Test
    public void  dragDrop(){

        WebElement source = driver.findElement(By.id("box3"));
        WebElement target = driver.findElement(By.id("box103"));

        Actions actions = new Actions(driver);

        actions.clickAndHold(source).moveToElement(target).release().build().perform();
    }


    @Test
    public void test2(){

        WebElement a = driver.findElement(By.id("box1"));
        WebElement b = driver.findElement(By.id("box101"));

        Actions act = new Actions(driver);


      //  act.clickAndHold(a).moveToElement(b).release().build().perform();

        act.dragAndDrop(a, b).build().perform();


    }


}
