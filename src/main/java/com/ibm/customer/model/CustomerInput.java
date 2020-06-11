package com.ibm.customer.model;

public class CustomerInput {

	private String CustomerNumber;
	private String firstName;
	private String lastName;
	private String email;
	
	public CustomerInput(String customerNumber, String firstName, String lastName, String email) {
		super();
		CustomerNumber = customerNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public String getCustomerNumber() {
		return CustomerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		CustomerNumber = customerNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "CustomerInput [CustomerNumber=" + CustomerNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + "]";
	}
	
	
}
