package com.ibm.customer.cucumber;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.springframework.web.client.RestTemplate;

import com.ibm.customer.model.Customer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberStepDefinitions {
	
			Customer customer;
			private RestTemplate restTemplate = new RestTemplate();


		   @Given("^Customer service and database are running  and Customer DB has customerNumber, (.*?)$")
		   public void customerServiceRunningCustomerNumberinCustomerDB(String customerNumber) throws Exception {
		   }

		   @When("^Customer mS receives request for customerNumber, (.*?)$")
		   public void customerServiceReceivesGetCustomerRequest(String customerNumber) throws IOException {
			   String customerServiceRESTRequest = "http://localhost:8085/customer/customer/" + customerNumber;
			   this.customer = this.restTemplate.getForObject(customerServiceRESTRequest, Customer.class);
		   }

		   @Then("^Customer information should be displayed for customerNumber, (.*?)$")
		   public void customerServiceReturnCustomerInformation(String customerNumber) {
			   assertNotNull("customer info should not be null", this.customer);
		   }
		

}
