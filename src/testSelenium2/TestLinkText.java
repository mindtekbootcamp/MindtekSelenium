package testSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLinkText {

    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        driver.findElement(By.linkText("All Examples")).click();
        //driver.findElement(By.partialLinkText("All")).click();
        driver.findElement(By.linkText("Input Forms")).click();



    }
}
