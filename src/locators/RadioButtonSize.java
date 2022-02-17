package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonSize {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        driver.manage().window().maximize();

        List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@type='radio']"));
         int counts=radioButtons.size();

        System.out.println("There are total "+counts+ " radio buttons");










    }
}
