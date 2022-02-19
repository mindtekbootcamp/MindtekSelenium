package testTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionTest {


    @Test
    public void test1(){


        Assert.assertTrue(true);
        Assert.assertFalse(false);

        int actualNumber=5;
        int expectedNumber=6;

        Assert.assertEquals(actualNumber, expectedNumber);

        System.out.println(" test PASSED ");

        Assert.assertEquals(12, 12);

        String actual="TEST";
        String expected="TEST";

        Assert.assertEquals(actual, expected);



    }



}
