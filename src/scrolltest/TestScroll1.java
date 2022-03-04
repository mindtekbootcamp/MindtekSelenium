package scrolltest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScroll1 {

    WebDriver driver;



    @BeforeMethod
    public void launchApp(){


        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yatra.com/");
    }


    @Test
    public void test() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 2693)");

        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0, -2693)");



       // js.executeScript("window.scrollBy(2693, 0)");
    }



}
