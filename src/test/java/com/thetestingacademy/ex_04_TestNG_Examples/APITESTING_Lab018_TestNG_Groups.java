package com.thetestingacademy.ex_04_TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITESTING_Lab018_TestNG_Groups {

    @Test(groups ={"Regression","Sanity"} )
    public  void test_sanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(false);
    }

    @Test(groups = {"Regression"})
    public  void test_regressionRun(){
        System.out.println("Regression");
        System.out.println("QA");
        Assert.assertTrue(false);
    }

    @Test(groups = {"Smoke","Regression"})
    public  void test_smokeRun(){
        System.out.println("Smoke");
        System.out.println("QA");
        Assert.assertTrue(false);
    }

}
