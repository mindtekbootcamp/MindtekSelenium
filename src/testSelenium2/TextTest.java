package testSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextTest {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");


        // print Text ==>  Click on button to get the selected value

       WebElement text= driver.findElement(By.xpath("//p[text()='Click on button to get the selected value']"));
       String  message=text.getText();
       System.out.println(message);

        //print Male text
        System.out.println(driver.findElement(By.xpath("//input[@name='optradio'] [@value='Male']")).getAttribute("value"));





    }
}
