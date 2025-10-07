package com.thetestingacademy.ex_04_TestNG_Examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITESTING_Lab016_TestNG_Priority {

    // In BEfore we run certain types of Function which we want to run before the Execution of Test Cases
    @BeforeTest
    public void getToken(){
        System.out.println("Before GET token");
    }

    @BeforeTest
    public void getBookingID(){
        System.out.println("Before GET BOOKING");
    }

    // This is Test Case
    @Test(priority = 2)
    public void test_01(){
        // token and BookingID
        System.out.println("Priority 1");
    }

    // This is Test Case
    @Test(priority = 1)
    public void test_02(){
        // token and BookingID
        System.out.println("Priority 2");
    }

    // This is Test Case
    @Test(priority = 4)
    public void test_03(){
        // token and BookingID
        System.out.println("Priority 3");
    }

    // This is Test Case
    @Test(priority = 3)
    public void test_04(){
        // token and BookingID
        System.out.println("Priority 4");
    }


    // After is used to run certain types of function
    @AfterTest
    public void closeALLThings(){
        System.out.println("close");
    }



}
