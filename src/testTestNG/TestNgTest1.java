package testTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgTest1 {

    SoftAssert softAssert= new SoftAssert();



    @BeforeMethod
    public void test1(){

        System.out.println("BeforeMethod");
    }


    @Test
    public void test2(){

        Assert.assertTrue(true);
        Assert.assertFalse(true);
        Assert.assertEquals(15,15);
        Assert.assertEquals("TEST","TEST");
        System.out.println("PASSED");
    }


    @Test
    public void test3(){

        System.out.println("started");
        softAssert.assertEquals("TEST", "test");

        System.out.println("completed");
        softAssert.assertAll();
    }


    @AfterMethod
    public void test4(){

        System.out.println("AfterMethod");
    }

}
