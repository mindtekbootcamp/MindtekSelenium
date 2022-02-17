package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        driver.manage().window().maximize();

       WebElement maleButton= driver.findElement(By.xpath(" (//input[@value='Male'])[1]"));
       maleButton.click();


    }
}
