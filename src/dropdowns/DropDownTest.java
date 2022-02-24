package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTest {

    WebDriver driver;


    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    @Test
    public void test1(){

       WebElement dropDown = driver.findElement(By.id("dropdown"));

        Select select= new Select(dropDown);
        select.selectByIndex(0);
        String text = select.getFirstSelectedOption().getText();
        System.out.println(text);

    }

    @Test
    public void test2(){

        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select s= new Select(dropDown);

        s.selectByIndex(0);

        String text =  s.getFirstSelectedOption().getText();
        System.out.println(text);

    }



    @Test
    public void visibleText(){

        WebElement dropDown = driver.findElement(By.id("dropdown"));

        Select s= new Select(dropDown);

        s.selectByVisibleText("Option 1");

        System.out.println(s.getFirstSelectedOption().getText());

    }


    @Test
    public void byValue(){

      WebElement element =  driver.findElement(By.id("dropdown"));

      Select str = new Select(element);


      str.selectByValue("1");

        System.out.println(str.getFirstSelectedOption().getText());

    }








}
