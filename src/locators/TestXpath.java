package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestXpath {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();



       WebElement userName= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
       userName.sendKeys("Tester");

       WebElement pasword=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
       pasword.sendKeys("test");







    }
}
