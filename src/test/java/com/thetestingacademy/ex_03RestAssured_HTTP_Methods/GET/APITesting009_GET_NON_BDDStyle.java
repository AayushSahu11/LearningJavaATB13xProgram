package com.thetestingacademy.ex_03RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting009_GET_NON_BDDStyle {

    RequestSpecification r; // pre request - Given Part
     Response response; // Making the Request Part - When
    ValidatableResponse vr; // Post Request - Then

    @Test
    public void test_GET_NonBDD(){
       String pincode ="482001";

       // Part 1 - Request Specification functions

       // r also provide funtion
        r = RestAssured.given();
        r.baseUri("https://zippopotam.us");
        r.basePath("/in/" + pincode);

        // Part 2 - Response Specification Functions
        response = r.when().log().all().get();

        // Part 3 - Validation Of Response
        vr = response.then().log().all();
        vr.statusCode(200);

    // we will use NOn BDD Style because its scalable



    }

}
