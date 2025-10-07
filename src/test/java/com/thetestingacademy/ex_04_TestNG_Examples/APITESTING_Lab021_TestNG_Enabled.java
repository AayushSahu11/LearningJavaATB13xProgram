package com.thetestingacademy.ex_04_TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITESTING_Lab021_TestNG_Enabled {

    // Where we put Enabled True only those test will Run, False will not not run.
    @Test(enabled = false)
    public void test01(){
        Assert.assertTrue(true);
    }

    @Test(enabled = true)
    public void test02(){
        Assert.assertTrue(true);
    }

    @Test(enabled = true)
    public void test03(){
        Assert.assertTrue(true);
    }
}
