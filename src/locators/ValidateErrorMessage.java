package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateErrorMessage {

    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver", "/Users/parahatoraz/MindtekSelenium/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();  // login button click

        System.out.println("ERROR MESSAGE: "+ driver.findElement(By.id("ctl00_MainContent_status")).getText());

        String expected="Invalid Username or Password.";
        String actual=driver.findElement(By.id("ctl00_MainContent_status")).getText();

        if (expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


        driver.close();




    }
}
