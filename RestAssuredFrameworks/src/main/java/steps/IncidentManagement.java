package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class IncidentManagement {
	public Response response;

	@Given("setup the endpoint")
	public void setEndpoint() {
		RestAssured.baseURI = "https://dev124530.service-now.com/api/now/table/incident";

	}

	@Given("setup the authorization")
	public void setAuth() {
		RestAssured.authentication = RestAssured.basic("admin", "3tiK$+Ef0aBI");

	}

	@When("send get request")
	public void getIncident() {
		response = RestAssured.given().log().all()
				.queryParam("sysparm_fields", "category,sys_id,number,priority,description").get();
	}

	@Then("verify the status code")
	public void verifyStatusCode() {
		response.then().assertThat().statusCode(200);
	}

	@And("print the response")
	public void printResponse() {
		response.prettyPrint();
	}

}
