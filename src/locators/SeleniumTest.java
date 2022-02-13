package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/parahatoraz/repo/MindtekSelenium/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

//        String actualTitle=driver.getTitle();
//
//        String expectedTitle="Web Orders";
//
//        if (actualTitle.equals(expectedTitle)){
//            System.out.println("TEST PASSED");
//        }else{
//            System.out.println("TEST FAILED");
//        }


        System.out.println(driver.getCurrentUrl());
        System.out.println("URL "+driver.getCurrentUrl());

        if (driver.getCurrentUrl().equals("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.close();



    }
}
