package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownTest2 {


    WebDriver driver;

    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

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

        // assert that Paris is selected

        WebElement paris =  driver.findElement(By.xpath("//select[@name='fromPort']/option[5]"));
        boolean b = paris.isSelected();
        Assert.assertTrue(b);

        System.out.println("Assertion Passed");

    }

    @Test
    public void test2(){
        // Select London by using visible text
        WebElement list = driver.findElement(By.name("fromPort"));
        Select st = new Select(list);
        st.selectByVisibleText("London");
        String str =st.getFirstSelectedOption().getText();
        System.out.println(str);


        // assert that London is selected

        WebElement londonText= driver.findElement(By.xpath("//select[@name='fromPort']/option[3]"));
         boolean  london = londonText.isSelected();
         Assert.assertTrue(london);
        System.out.println("Assertion Passed");



    }

    @Test
    public void test3(){
        // Select Sydney by using value
        WebElement list = driver.findElement(By.name("fromPort"));
        Select st = new Select(list);
        st.selectByValue("Sydney");
        String text= st.getFirstSelectedOption().getText();
        System.out.println(text);

        // assert that Sydney is selected


        WebElement londonText= driver.findElement(By.xpath("//select[@name='fromPort']/option[9]"));
        boolean  sydney = londonText.isSelected();
        Assert.assertTrue(sydney);
        System.out.println("Assertion Passed");
    }


    @Test
    public void getSize(){

        WebElement list = driver.findElement(By.name("fromPort"));
        Select st = new Select(list);
        List<WebElement> dropDownList = st.getOptions();

        System.out.println("There are " + dropDownList.size() + "cities");


    }

    @Test
    public void print(){

        WebElement list = driver.findElement(By.name("fromPort"));
        Select st = new Select(list);

        List<WebElement> dropDownList = st.getOptions();

        for (WebElement elements: dropDownList  ) {
            System.out.println(elements.getText());
        }



    }





}
