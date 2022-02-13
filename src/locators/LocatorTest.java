package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

//        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
//        driver.findElement(By.className("button")).click();

//        driver.findElement(By.cssSelector("input[name='ctl00$MainContent$username']")).sendKeys("Tester");
//        //driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
//        driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");



        driver.findElement(By.cssSelector("input.button")).click();                   // Clicking login button
        String text=driver.findElement(By.id("ctl00_MainContent_status")).getText();  // Getting the error message

        System.out.println();



//        String expectedErrorMessage="Invalid Login or Password.";
//        String actualErrorMessage=driver.findElement(By).getText();
//
//
//        // TASK
//
//        //  open website
//        // click on login button
//        // Verify Error message is displayed
//
//        if (expectedErrorMessage.equals(actualErrorMessage)){
//
//        }else{
//
//        }
//







    }
}
