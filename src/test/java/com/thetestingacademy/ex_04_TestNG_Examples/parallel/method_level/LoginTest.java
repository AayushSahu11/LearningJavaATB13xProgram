package com.thetestingacademy.ex_05_TestNG_Examples.parallel.method_level;

import org.testng.annotations.Test;

public class LoginTest
{
    @Test
    public void validLogin(){
        System.out.println("validLogin - Thread" + Thread.currentThread());
    }

    @Test
    public void invalidLogin(){
        System.out.println("invalidLogin - Thread" + Thread.currentThread());
    }


}
