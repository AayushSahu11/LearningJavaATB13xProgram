package com.thetestingacademy;

public class APITesting_Lab03_NonBuilder_Pattern01 {
    // No Design Pattern.

    // Step 1 - This is a No Return Type No Argument Type Function\
    public void step1(){
        System.out.println("Step 1");
    }

    // This is also Step 1
    public void step2(){
        System.out.println("Step 2");
    }

    // This is Step 2
    // No Return type But With Argument
    public void step3(String param1){
        System.out.println("Step 3");
    }

    // Now Created a Main Function
    public static void main(String[] args) {
        // Creating Instance.
        // Its a Step By step Process
        APITesting_Lab03_NonBuilder_Pattern01 nbp = new APITesting_Lab03_NonBuilder_Pattern01();
        // dot  we use means - when step 1 is done then go on step 2.
        nbp.step1();
        nbp.step2();
        nbp.step3("Aayush");

    }

}
