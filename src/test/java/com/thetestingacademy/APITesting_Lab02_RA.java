package com.thetestingacademy;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab02_RA {
    public static void main(String[] args) {

        // Gherkins Syntax -
        // Gven()-> Belongs To -> Pre Req. - URL, HEaders, Auth, Body....
        // When() -> Belongs To -> HTTP Method? - GET/POST/PUT/PATCH,DELETE...
        // THEN() -> VAlidation -> 200 ok, Firstname == Aayush

        // Full URL -  https://zippopotam.us/in/482001
        // Base URL - https://zippopotam.us
        // Bath Path - /in/482001

        // Using Scanner Class to get input from the User.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the pincode!");
        String pincode = sc.next();

        RestAssured
                .given().baseUri("https://zippopotam.us")
                .basePath("/in/" + pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);

    }
}
