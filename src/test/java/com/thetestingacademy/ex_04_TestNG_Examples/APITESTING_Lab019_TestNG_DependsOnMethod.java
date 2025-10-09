package com.thetestingacademy.ex_05_TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITESTING_Lab019_TestNG_DependsOnMethod {

    // Before Running the Test1 & Test2 I want to Run the ServerstartedOk Method.
    // So For this We will Use DependsOnMethod
    // Jis Test Case ko Baad me run krna hai uske age, Write DependsonMethod and Write the name Of Test which You want to Run First

    @Test
    public void serverStartedOK(){
        System.out.println("I will run First");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOK" )
    public void test1(){
        System.out.println("Method 1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOK" )
    public void test2(){
        System.out.println("Method 2");
        Assert.assertTrue(true);
    }


}
