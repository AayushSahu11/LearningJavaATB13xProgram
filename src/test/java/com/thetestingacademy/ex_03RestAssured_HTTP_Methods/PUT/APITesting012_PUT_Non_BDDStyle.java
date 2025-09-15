package com.thetestingacademy.ex_03RestAssured_HTTP_Methods.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class  APITesting012_PUT_Non_BDDStyle {

    // PUT
    // Auth Token Or Booking ID.
    // In Future We will write to get token and  Booking id both.

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_Put_NonBDD() {

        // I have Card Coded Booking Id and token Id
        String bookingid = "1170";
        String token = "889f17a102672c8";
        String payload = "{\n" +
                "    \"firstname\" : \"Ashi\",\n" +
                "    \"lastname\" : \"Sahu\",\n" +
                "    \"totalprice\" : 150,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
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

        response = r.when().log().all().put();
        vr = response.then().log().all();
        vr.statusCode(200);
    }


}
