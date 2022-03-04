package testTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableTest1 {



    WebDriver driver;

    @BeforeMethod
    public void launchApp(){
        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/drivers/chromedriver");

        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/table-search-filter-demo.html");

    }

    @Test
    public void getRowSize(){

       List<WebElement> rows =  driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
       int rowSize = rows.size();

        System.out.println("There are "+rowSize+ " rows");
    }

    @Test
    public void getColumnSize(){
        // Expected Result is 4
     List<WebElement> headers =driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
     int headerSize= headers.size();

     System.out.println(headerSize);
    }



}
