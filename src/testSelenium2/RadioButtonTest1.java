package testSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        WebElement maleRadioButton = driver.findElement(By.xpath("//input[@name='optradio'] [@value='Male']"));
        maleRadioButton.click();

        WebElement button= driver.findElement(By.cssSelector("button#buttoncheck"));
        button.click();

        WebElement text=driver.findElement(By.cssSelector("p.radiobutton"));
        String message=text.getText();
        System.out.println(message);

















    }
}
