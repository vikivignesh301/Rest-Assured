package com.mavenproject.REST_ASSURED;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rest {

	private void getMethod() {

		RestAssured.baseURI = "https://api.github.com/";

		String bearer = "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";

		Response response = RestAssured

				.given()
					.header("Authorization", "Bearer " + bearer)

				.when()
					.get("user/repos")

				.then()
					.log().all().extract()
					.response();

		int statusCode = response.getStatusCode();

		Assert.assertEquals(200, statusCode);

	}

}
