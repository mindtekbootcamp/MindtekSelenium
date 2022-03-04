package waittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class TestDownloads {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/parahatoraz/drivers/chromedriver");

        WebDriver driver=new ChromeDriver(new ChromeOptions());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/download");
        //driver.get("https://file-examples.com/index.php/sample-documents-download/");



        String location= System.getProperty("user.dir")+"\\Downloads\\";  // appending

        HashMap preferences=new HashMap<>();            /// we  need to create hash map preferences
        preferences.put("download.default_directory", location);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", preferences);


        driver.findElement(By.xpath("//div[@class='example']/a[1]")).click();

    }
}
