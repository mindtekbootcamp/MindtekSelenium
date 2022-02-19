package testTestNG;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotations {


    @BeforeMethod
    public void start(){
        System.out.println(" This is  Before method");
    }

    @AfterMethod
   public void close(){
        System.out.println("This is After method");
    }


   @Test
    public void test1(){

       System.out.println("Hello TestNG");
   }

   @Test
   public void test2(){
       System.out.println(" This is Test 2");
   }







}
