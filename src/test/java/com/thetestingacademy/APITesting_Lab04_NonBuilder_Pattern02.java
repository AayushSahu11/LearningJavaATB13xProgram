package com.thetestingacademy;

public class APITesting_Lab04_NonBuilder_Pattern02 {

    // No Design Pattern.

    // Step 1 - This is a No Return Type No Argument Type Function\
    // Instead of Returning void, We will Return Class Name means khud ko hi return kr do
    // Advantage- isme One by one hoga orignally.

    public APITesting_Lab04_NonBuilder_Pattern02 step1(){
        System.out.println("Step 1");
        return this;
    }

    // This is also Step 1
    public APITesting_Lab04_NonBuilder_Pattern02 step2(){
        System.out.println("Step 2");
        return this;
    }

    // This is Step 2
    // No Return type But With Argument
    public APITesting_Lab04_NonBuilder_Pattern02 step3(String param1){
        System.out.println("Step 3");
        return this;
    }

    // Now Created a Main Function
    public static void main(String[] args) {
        // Creating Instance.
        // Its a Step By step Process
        APITesting_Lab04_NonBuilder_Pattern02 nbp = new APITesting_Lab04_NonBuilder_Pattern02();
        // dot  we use means - when step 1 is done then go on step 2.
        nbp.step1();
        nbp.step2();
        nbp.step3("Aayush");
    }
    }
