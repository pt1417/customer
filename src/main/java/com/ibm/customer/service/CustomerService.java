package com.ibm.customer.service;

import java.util.List;

import com.ibm.customer.model.Customer;
import com.ibm.customer.model.CustomerInput;

public interface CustomerService {
	public Customer getCustomer(String customerNumber);
	public List<Customer> getCustomers();
	public Customer addCustomer(CustomerInput customerInput);
}
