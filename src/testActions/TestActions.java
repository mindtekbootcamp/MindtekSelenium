package testActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestActions {


    WebDriver driver;


    @BeforeMethod
    public void launchApp(){

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/repo/MindtekSelenium/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");


    }

   // @Test
    public void test1(){

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        WebElement admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
        WebElement userManagement = driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
        WebElement users = driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));

        Actions act = new Actions(driver);

        act.moveToElement(admin).build().perform();
        act.moveToElement(userManagement).build().perform();
        act.moveToElement(users).click().build().perform();

    }

    @Test
    public void test2(){

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();


        // PIM --> CONFIGURATION --> CUSTOM FIELDS
        WebElement pim = driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
        WebElement configuration = driver.findElement(By.xpath("//*[@id='menu_pim_Configuration']"));
        WebElement customFields = driver.findElement(By.xpath("//*[@id='menu_pim_listCustomFields']"));

        Actions ac = new Actions(driver);

//        ac.moveToElement(pim).build().perform();
//        ac.moveToElement(configuration).build().perform();
//        ac.moveToElement(customFields).click().build().perform();

        ac.moveToElement(pim).moveToElement(configuration).moveToElement(customFields).click().build().perform();

    }





}
