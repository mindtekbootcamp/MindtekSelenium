package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CSSTest {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");

        WebDriver driver=new ChromeDriver();


        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        WebElement loginButton= driver.findElement(By.id("ctl00_MainContent_login_button"));
        //loginButton.click();

        String errorMessage= driver.findElement(By.cssSelector("form span")).getText();
        System.out.println(errorMessage);

        WebElement userName= driver.findElement(By.cssSelector("input[id*='user']"));
        userName.sendKeys("Tester");

        WebElement password=driver.findElement(By.cssSelector("input[id*='pass']"));
        password.sendKeys("test");



        loginButton.click();

        driver.quit();


        System.out.println("PASSED");


    }

}
