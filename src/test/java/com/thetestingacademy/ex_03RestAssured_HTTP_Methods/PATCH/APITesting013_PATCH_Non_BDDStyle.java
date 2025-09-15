package com.thetestingacademy.ex_03RestAssured_HTTP_Methods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting013_PATCH_Non_BDDStyle {

    // PATCH
    // Auth Token Or Booking ID.
    // In Future We will write to get token and  Booking id both.

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_PATCH_NonBDD() {

        // I have Card Coded Booking Id and token Id
        String bookingid = "1170";
        String token = "5a2bd19c164c04c";
        String payload = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        // r.header("Cookie", "token="""); not using it for now because we have a cookie method as well.
        r.cookie("token", token);
        r.cookie("token", token);
        r.body(payload).log().all();

        // Step 2 - Response

        response = r.when().log().all().patch();
        vr = response.then().log().all();
        vr.statusCode(200);
    }


}


