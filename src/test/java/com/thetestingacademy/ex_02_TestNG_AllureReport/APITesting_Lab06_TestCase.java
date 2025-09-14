package com.thetestingacademy.ex_02_TestNG_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab06_TestCase {

    String pincode;

    // @ in Test -> means annotation - add a extra functionality to a functions
    @Test
    // Valid pincode - 482001
    public void test_tc1_pincode_valid() {
        pincode = "482001";

        RestAssured
                .given().baseUri("https://zippopotam.us")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);

        }

        @Test
        // Invalid pincode = @, #, $, %  - special input
    public void test_tc2_pincode_Invalid() {
            pincode = "@";

            RestAssured
                    .given().baseUri("https://zippopotam.us")
                    .basePath("/in/" + pincode)
                    .when()
                    .get()
                    .then().log().all().statusCode(200);

    }

    @Test
    // pincode =  " " blank
    public void test_tc3_pincode_Invalid() {
        pincode = " ";

        RestAssured
                .given().baseUri("https://zippopotam.us")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);

    }


    }

