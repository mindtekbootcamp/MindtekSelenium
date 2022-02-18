package testSelenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        driver.navigate().to("https://www.google.com/");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();


        driver.navigate().refresh();


    }
}
