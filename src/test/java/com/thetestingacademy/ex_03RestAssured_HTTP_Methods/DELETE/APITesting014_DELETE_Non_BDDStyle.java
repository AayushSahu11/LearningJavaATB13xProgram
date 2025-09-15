package com.thetestingacademy.ex_03RestAssured_HTTP_Methods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting014_DELETE_Non_BDDStyle {

    // DELETE
    // Auth Token Or Booking ID.
    // In Future We will write to get token and  Booking id both.

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_Delete_NonBDD() {

        // I have Card Coded Booking Id and token Id
        String bookingid = "1170";
        String token = "a4ddaf38ba01909";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        // r.header("Cookie", "token="""); not using it for now because we have a cookie method as well.
        r.cookie("token", token);

        // Step 2 - Response

        response = r.when().log().all().delete();
        vr = response.then().log().all();
        vr.statusCode(201);
    }



}
