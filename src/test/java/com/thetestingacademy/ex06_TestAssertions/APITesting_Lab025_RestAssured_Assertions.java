package com.thetestingacademy.ex06_TestAssertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.hamcrest.Matchers;


public class APITesting_Lab025_RestAssured_Assertions {

    // Manually Import  org.hamcrest.Matchers
    // This is a Non BDD style which is mostly used.

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String token;
    Integer bookingID;


@Test
  public void  test_createBooking_POST(){

    // payload
    // given - setting up the body, url, base path, uri
    // when - making the request
    // then - extraction

    String  request_payload = "{\n" +
            "    \"firstname\" : \"Aayush\",\n" +
            "    \"lastname\" : \"Sahu\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2018-01-01\",\n" +
            "        \"checkout\" : \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";

    requestSpecification = RestAssured.given();
    requestSpecification.baseUri("https://restful-booker.herokuapp.com");
    requestSpecification.basePath("/booking");

    // header information
    requestSpecification.contentType(ContentType.JSON);
    requestSpecification.body(request_payload).log().all();

    response = requestSpecification.when().log().all().post();

    // GET Validate response to perform validation

    validatableResponse = response.then().log().all();

    // Rest Asuured.assertion
    validatableResponse.statusCode(200);

    // booking ID !=null, firstname == Aayush
    // Extract the response body and do it

    //System.out.println(response.asString());

    // If We need to get the Booking ID and First Name , humko Response me chahiye hai.
    // bookingID, booking.firstname we are Pasting response body in JSON Path Finder and waha se copy paste yaha kr rhe hai.
    validatableResponse.body("bookingid" ,Matchers.notNullValue());
    validatableResponse.body("booking.firstname" , Matchers.equalTo("Aayush"));
    validatableResponse.body("booking.lastname", Matchers.equalTo("Sahu"));
  }


}
