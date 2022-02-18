package testSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxTest2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");


         List<WebElement> allOptions= driver.findElements(By.xpath("//input[@class='cb1-element']"));
         System.out.println(allOptions.size());

        for (int i = 0; i <allOptions.size() ; i++) {
            allOptions.get(i).click();

            if (allOptions.get(i).isSelected()){
                System.out.println("PASS");
            }else {
                System.out.println("FAIL");
            }


        }



    }
}
