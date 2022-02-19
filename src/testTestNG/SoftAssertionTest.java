package testTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {

    SoftAssert softAssert = new SoftAssert();



    @Test
    public void test1(){

        softAssert.assertEquals("TEST", "TEST12313");
        softAssert.assertTrue(true);
        softAssert.assertFalse(false);

        System.out.println("ALL PASSED");

        softAssert.assertAll();
    }


    @Test
    public void test2(){

        softAssert.assertEquals(5, 5);

        System.out.println(" This is seconf method");
        softAssert.assertAll();
    }





}