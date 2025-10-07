package com.thetestingacademy.ex_04_TestNG_Examples.parallel.class_level_BestFor_CrossBrowser_Testing;

import org.testng.annotations.Test;

public class ChromeTest {

    @Test
    public void test_chrome(){
        System.out.println("1");
        System.out.println(Thread.currentThread().getId());
    }


}
