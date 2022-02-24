package testTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {

    SoftAssert softAssert = new SoftAssert();
   // SoftAssert softAssert2 = new SoftAssert();


    @Test
    public void login(){

        softAssert.assertEquals("TEST", "TEST1231");
        softAssert.assertTrue(true);
        softAssert.assertFalse(false);

        System.out.println("ALL PASSED");

        softAssert.assertAll();
    }

    @Test
    public void search(){

        softAssert.assertEquals(5, 6);

        System.out.println(" This is second method");

        softAssert.assertAll();
    }


    @Test
    public void signUp(){

        softAssert.assertEquals(5, 6);

        System.out.println(" This is second method");

        softAssert.assertAll();
    }






}
