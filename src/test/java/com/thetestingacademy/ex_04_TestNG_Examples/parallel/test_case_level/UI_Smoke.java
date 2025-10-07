package com.thetestingacademy.ex_04_TestNG_Examples.parallel.test_case_level;

import org.testng.annotations.Test;

public class UI_Smoke {

    @Test
    public void test_UI_Smoke(){
        System.out.println(Thread.currentThread().getId());
    }

}
