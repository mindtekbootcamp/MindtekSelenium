package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicDropDownTest {


    WebDriver driver;

    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.airbnb.com/");
    }


        @Test
        public void test() throws InterruptedException {

        String cityName="Chihuahua, Mexico";

        Thread.sleep(3000);
        driver.findElement(By.id("bigsearch-query-location-input")).sendKeys("CHI");

        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("//div[@role='option']"));

        for (WebElement cities : list) {
           if (cities.getText().contains(cityName)){
               cities.click();
               break;
           }
        }

       boolean b = driver.findElement(By.id("bigsearch-query-location-input")).isDisplayed();
        Assert.assertTrue(b);

        System.out.println("PASS");
    }





}
