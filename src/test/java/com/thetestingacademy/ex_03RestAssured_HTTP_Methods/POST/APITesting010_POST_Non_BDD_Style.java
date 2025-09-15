package com.thetestingacademy.ex_03RestAssured_HTTP_Methods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting010_POST_Non_BDD_Style {

    // these three lines we write its an Interface for Pre, Post, Response
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    // Function
    @Test
    public void test_POST_NonBDDStyle_Create_Token(){

        // Step 1 - what we need - we need -
        // URL - https://restful-booker.herokuapp.com/auth
        // PAYLOAD - {
        //    "username" : "admin",
        //    "password" : "password123"
        //}
        // HEADER - Content-Type : application/json
        // Cookie - Na
        // Validate - 200 Ok
        // Body Response - Token is Generated or not.

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        // Part 1 - Pre Condition - Pre Request - URL, Headers, Auth...
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        // Step 2 - Making of HTTP Request  - Response
        response = r.when().log().all().post();

        // Step 3 - Validation - Verification
        vr = response.then().log().all();
        vr.statusCode(200);





    }




}
