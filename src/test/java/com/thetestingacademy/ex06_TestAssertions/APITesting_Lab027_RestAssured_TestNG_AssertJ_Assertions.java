package com.thetestingacademy.ex06_TestAssertions;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class APITesting_Lab027_RestAssured_TestNG_AssertJ_Assertions {

    // Assert J will be having all type of Assertions.

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String token;
    Integer bookingid;

    @Test
    public void test_createBooking_POST() {

        // payload
        // given - setting up the body, url, base path, uri
        // when - making the request
        // then - extraction

        String request_payload = "{\n" +
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

        // Rest Assured -> org.hamcrest.Matchers;  this is used %4 %5
        // Matchers.equalto()

        validatableResponse.body("bookingid", Matchers.notNullValue());
        validatableResponse.body("booking.firstname", Matchers.equalTo("Aayush"));
        validatableResponse.body("booking.lastname", Matchers.equalTo("Sahu"));

        // TestNg - Extraction the details of the firstname, bookingid, lastname

    bookingid = response.then().extract().path("bookingid");
    // To extract first name
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        // TestNG Assertions  - are going to be used by 75% of the time during Test Automation. because its a compelte type of assertion.
        // softAssert vs HardAssert (90% of the time people use HardAssert)
        // this means if any assertion fail then
        // The Remaining statement in the Teest method wil not be executed

        Assert.assertEquals(firstname, "Aayush");
        Assert.assertEquals(lastname, "Sahu");
        Assert.assertNotNull(bookingid); // booking id will not be null.

        // Now Using Assertj -> Example of How to use Assertj
        // AssertJ (3rd Lib to Assertions) - 20% will be used

        assertThat(bookingid).isNotZero().isNotNull().isPositive();
        assertThat(firstname).isNotBlank().isNotEmpty().isEqualTo("Aayush");
        assertThat(lastname).isNotBlank().isNotEmpty().isEqualTo("Sahu");

        if (!firstname.contains("Aayush")) {
            Assert.fail("Failed kar diya Test");
        }


    }
}