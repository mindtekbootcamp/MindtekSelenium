package testSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");


        WebElement checkBox1= driver.findElement(By.id("isAgeSelected"));
        checkBox1.click();
        System.out.println(checkBox1.isSelected());


        WebElement option1= driver.findElement(By.xpath("(//input[@class='cb1-element'])[1]"));
        option1.click();
        System.out.println("Option 1 is selected "+ option1.isSelected());






    }
}


