package testSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxTest3 {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");


        List<WebElement> allOptions= driver.findElements(By.xpath("//input[@class='cb1-element']"));
        WebElement secondOption=driver.findElement(By.xpath("(//input[@class='cb1-element'])[4]"));

        for (int i = 0; i < allOptions.size(); i++) {
            if (allOptions.get(i).equals(secondOption)){
                allOptions.get(i).click();
                break;
            }
        }

        if (secondOption.isSelected()){
            System.out.println("SELECTED");
        }else {
            System.out.println("NOT SELECTED");
        }



    }
}
