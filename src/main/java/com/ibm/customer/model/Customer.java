package com.ibm.customer.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "Customer")
public class Customer {
	
	@JsonIgnore
	@Id
	
	private ObjectId _id;
	private String customerNumber;
	private String firstName;
	private String lastName;
	private String email;
	
	public Customer() {
		super();
	
	}
	public Customer(String customerNumber, String firstName, String lastName, String email) {
		super();
		this.customerNumber = customerNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerNumber == null) ? 0 : customerNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerNumber == null) {
			if (other.customerNumber != null)
				return false;
		} else if (!customerNumber.equals(other.customerNumber))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + "]";
	}
	
	
}
