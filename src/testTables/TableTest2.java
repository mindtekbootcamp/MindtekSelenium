package testTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableTest2 {

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
    public void test(){

        // FROM SECOND TABLE

        // Print size of  rows
        List<WebElement>  rowSize = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
        int size = rowSize.size();
        System.out.println(size);

        // Print size of  headers
        List<WebElement>  headerSize = driver.findElements(By.xpath("//table[@class='table']/thead/tr/th"));
        int headSize= headerSize.size();
        System.out.println(headSize);

        // Print Dimarison
        WebElement name = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[5]/td[4]"));
        String Dimarison = name.getText();

        System.out.println(Dimarison);

    }

}
