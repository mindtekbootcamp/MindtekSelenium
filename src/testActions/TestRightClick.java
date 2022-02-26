package testActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestRightClick {



    WebDriver driver;


    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/drivers/chromedriver");

        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
    }

    @Test
    public void rightClick(){

        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        Actions act = new Actions(driver);

        act.contextClick(button).build().perform();

        WebElement copyButton = driver.findElement(By.xpath("/html/body/ul/li[3]"));

        copyButton.click();

        String text = driver.switchTo().alert().getText();

        System.out.println(text);

        driver.switchTo().alert().accept();




    }


    @Test
    public void search(){

        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        Actions act = new Actions(driver);

        act.contextClick(button).build().perform();

        WebElement copyButton = driver.findElement(By.xpath("/html/body/ul/li[3]"));

        copyButton.click();

        String text = driver.switchTo().alert().getText();

        System.out.println(text);

        driver.switchTo().alert().accept();




    }


    @AfterMethod
    public void close(){
        driver.quit();
    }




}
