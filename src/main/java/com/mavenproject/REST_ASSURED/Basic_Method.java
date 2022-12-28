package com.mavenproject.REST_ASSURED;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Basic_Method {

//	@Test(priority = -1)
	private void getMethod() {

		RestAssured.baseURI = "https://api.github.com/";

		String bearertoken = "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";

		Response response = RestAssured

				.given()
					.header("Authorization", "Bearer " + bearertoken)
//					.auth().basic("", "")

				.when()
					.get("user/repos")

				.then()
					.log().all().extract()
					.response();

		int statusCode = response.getStatusCode();
		Assert.assertEquals(200, statusCode);

	}

//	@Test(priority = 0)
	private void postMethod() throws FileNotFoundException {

		RestAssured.baseURI = "https://api.github.com/";

		String bearertoken = "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";
		
		File f = new File("C:\\Users\\VIGNESH S\\eclipse-workspace\\REST_ASSURED\\Post");

		Response response = RestAssured

				.given()
					.header("Authorization", "Bearer " + bearertoken)
//					.auth().basic("", "")
					.body(f)

				.when()
					.post("user/repos")

				.then()
					.log().all().extract().response();

		int statusCode = response.getStatusCode();
		Assert.assertEquals(201, statusCode);

	}
//	@Test(priority = 1)
	private void putMethod() {
		
		RestAssured.baseURI = "https://api.github.com/";

		String bearertoken = "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";

		File f = new File("C:\\Users\\VIGNESH S\\eclipse-workspace\\REST_ASSURED\\Put");

		
		Response response = RestAssured

				.given()
					.header("Authorization", "Bearer " + bearertoken)
//					.auth().basic("", "")
					.body(f)

				.when()
					.put("repos/vikivignesh301/Thaswin/topics")

				.then()
					.log().all().extract().response();

		int statusCode = response.getStatusCode();
		Assert.assertEquals(200, statusCode);
	}
	@Test(priority = 2)
	private void deleteMethod() {
		
		RestAssured.baseURI = "https://api.github.com/";

		String bearertoken = "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";

		File f = new File("C:\\Users\\VIGNESH S\\eclipse-workspace\\REST_ASSURED\\Put");

		
		Response response = RestAssured

				.given()
					.header("Authorization", "Bearer " + bearertoken)
//					.auth().basic("", "")
					.body(f)

				.when()
					.delete("repos/vikivignesh301/Thaswin")

				.then()
					.log().all().extract().response();

		int statusCode = response.getStatusCode();
		Assert.assertEquals(204, statusCode);
		
	}
}
