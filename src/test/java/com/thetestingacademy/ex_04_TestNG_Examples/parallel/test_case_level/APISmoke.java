package com.thetestingacademy.ex_05_TestNG_Examples.parallel.test_case_level;

import org.testng.annotations.Test;

public class APISmoke {

    @Test
    public void test_API_Smoke(){
        System.out.println(Thread.currentThread().getId());
    }


}
