package com.thetestingacademy.ex_04_TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITESTING_Lab022_TestNG_AlwaysRun {

    // Where we put Always Run True only those test will Run, False will not not run.
    @Test(alwaysRun = false)
    public void test01(){
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test02(){
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test03(){
        Assert.assertTrue(true);
    }

}
