package com.thetestingacademy.ex06_TestAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting_Lab026_TestNg_Assertions {

    // Most of the Time we Will use Hard Assertion.
    // This is the Example of Hard Assertion
    //    @Test
//    public void test_hardAssertExample(){
//        System.out.println("Start of the program");
//        Assert.assertEquals("Aayush", "ayush");
//        System.out.println("eng of the Program");
//    }


//    Example Of Soft Assertion
    @Test
    public void test_softAssertExample(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Aayush", "aayush");
        System.out.println("End of Program");
        softAssert.assertAll();
    }

}
