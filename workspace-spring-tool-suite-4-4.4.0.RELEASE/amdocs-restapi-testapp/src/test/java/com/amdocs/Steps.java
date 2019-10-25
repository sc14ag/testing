package com.amdocs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	private RestTemplate restTemplate;
	private String restEndPointURL;
	//private String actualResponse;
	ResponseEntity<String> actualResponse;

	@Given("The REST API is up and live")
	public void ensureRESTAPIUpLive(){
		restTemplate= new RestTemplate();
	}

	@Given("the rest endpoint is: {string}")
	public void acceptRESTEndPointURL(String stringRESTEndPointURL) {
		restEndPointURL = stringRESTEndPointURL;
	}

	@When("I invoke the rest endpoint URL")
	public void invokeRESTAPI() {
//		actualResponse = restTemplate.getForObject(restEndPointURL, String.class);
		actualResponse = restTemplate.getForEntity(restEndPointURL,String.class);
	}

	@Then("I expect the result as {string}")
	public void verifyResult(String expectedResponse) {
		assertEquals (200, actualResponse.getStatusCodeValue());
		assertEquals(true, actualResponse.getBody().contains("25.0"));
	}



}
