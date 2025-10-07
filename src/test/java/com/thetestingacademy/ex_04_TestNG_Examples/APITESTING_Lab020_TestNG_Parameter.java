package com.thetestingacademy.ex_04_TestNG_Examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITESTING_Lab020_TestNG_Parameter {

    // here we have passed a Annotation called @Parameter.
    // and in Parameter we put a Keyword which is browser, Which We have Mentioned in Chrome & Firefox xml file.
    // and  same thing in value , value also mentioned in chrome & firefox xml file, Which will track it and run the Test Accordingly.
    // To Run The Particular Browser Test, side panel right Click on Browser xml file and Run the Test


    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Hi i am demo");
        System.out.println("You are Running this parameter");

        if (value.equalsIgnoreCase("firefox")){
            System.out.println("start the firefox!");
        }

        if (value.equalsIgnoreCase("chrome")){
            System.out.println("Start the Chrome!");
        }


    }

}
