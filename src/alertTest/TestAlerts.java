package alertTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAlerts {



    WebDriver driver;


    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://demo.guru99.com/test/delete_customer.php");
    }

    @Test
    public void test1() throws InterruptedException {

        driver.findElement(By.cssSelector("input[name='submit']")).click();

       String text = driver.switchTo().alert().getText();

        System.out.println(text);

        Thread.sleep(2000);

       driver.switchTo().alert().dismiss();

        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

    }


}
