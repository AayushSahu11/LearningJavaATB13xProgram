package com.thetestingacademy;

import io.restassured.RestAssured;

// This is a Direct BDD Style, which is rarely Used.
public class APITesting_Lab05_Multiple_TestCase {
    public static void main(String[] args) {

        String pincode = "480221";

        RestAssured
                .given().baseUri("https://zippopotam.us")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);

        // Verifying 200 Will come or not with Wrong Pincode
        pincode = "@";
        RestAssured
                .given().baseUri("https://zippopotam.us")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);

        pincode = " ";
        RestAssured
                .given().baseUri("https://zippopotam.us")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);

    }

}
