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
       // How to verify radio button is selected
       boolean radioButton1= maleButton.isSelected();
        System.out.println(radioButton1);

        //********************************

        WebElement femaleButton=driver.findElement(By.xpath("(//input[@value='Female'])[1]"));
        femaleButton.click();

        boolean radioButton2 = femaleButton.isSelected();
        System.out.println(radioButton2);







        // Verify Male option is not selected
        if (maleButton.isSelected()){
            System.out.println("FAIL");
        }else {
            System.out.println("PASS");
        }




    }
}
