package com.thetestingacademy.ex_05_TestNG_Examples;

import org.testng.annotations.Test;

public class APITESTING_Lab023_TestNG_InvocationCount {

    // Invocationcount means How many time we want to run particular test case.

    @Test(invocationCount = 2)
    public void test_01() {
        System.out.println("Hi");
    }

    // This is Test Case
    @Test(invocationCount = 3)
    public void test_02() {
        System.out.println("bye");

    }
}