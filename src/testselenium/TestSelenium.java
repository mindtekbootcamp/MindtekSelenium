package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/mindtek/IdeaProjects/MindtekSelenium/chromedriver");

        // Polymorphic Object
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Carpet" + Keys.ENTER);

        String title=driver.getTitle();

        System.out.println(title);

        driver.quit();

    }

}
