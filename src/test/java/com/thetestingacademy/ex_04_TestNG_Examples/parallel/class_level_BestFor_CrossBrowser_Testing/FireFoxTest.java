package com.thetestingacademy.ex_04_TestNG_Examples.parallel.class_level_BestFor_CrossBrowser_Testing;

import org.testng.annotations.Test;

public class FireFoxTest {


        @Test
        public void test_firefox(){
        System.out.println("2");
        System.out.println(Thread.currentThread().getId());
    }
}
