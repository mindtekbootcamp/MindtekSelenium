package tesJS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestJavaScriptExecuter {


    WebDriver driver;


    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yatra.com/");
    }

    //document.body.scrollHeight

    @Test
    public void test() throws InterruptedException {

        JavascriptExecutor js= (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0, 2693)");
       // js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        //js.executeScript("window.scrollBy(0, -2693)");


        js.executeScript("scroll(0, 2000)");
        Thread.sleep(2000);
        js.executeScript("scroll(2000, 0)");

    }


    @Test
    public void moveToElement() throws InterruptedException {

      WebElement elems = driver.findElement(By.xpath("//a[@title='Facebook']"));

      JavascriptExecutor js= (JavascriptExecutor) driver;
      js.executeScript("arguments[0].scrollIntoView()", elems);
      Thread.sleep(3000);

      elems.click();

    }
}
