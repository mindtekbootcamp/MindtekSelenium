package dropdowns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTest2 {


    WebDriver driver;

    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
    }


    @Test
    public void test1(){
        // Select Paris by using index
    }


    @Test
    public void test2(){
        // Select London by using visible text
    }


    @Test
    public void test3(){
        // Select Sydney by using value
    }



}
