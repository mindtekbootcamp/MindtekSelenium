package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTest2 {


    WebDriver driver;

    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
    }


    @Test
    public void test1(){
        // Select Paris by using index

        WebElement list = driver.findElement(By.name("fromPort"));

        Select st = new Select(list);

        st.selectByIndex(4);

        String text = st.getFirstSelectedOption().getText();

        System.out.println(text);
    }


    @Test
    public void test2(){
        // Select London by using visible text
        WebElement list = driver.findElement(By.name("fromPort"));

        Select st = new Select(list);

        st.selectByVisibleText("London");

        String str =st.getFirstSelectedOption().getText();

        System.out.println(str);

    }


    @Test
    public void test3(){
        // Select Sydney by using value
        WebElement list = driver.findElement(By.name("fromPort"));

        Select st = new Select(list);

        st.selectByValue("Sydney");

        String text= st.getFirstSelectedOption().getText();


        System.out.println(text);


    }



}
