package com.ibm.customer.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.customer.model.Customer;
import com.ibm.customer.model.CustomerInput;
import com.ibm.customer.repo.CustomerRepo;
import com.ibm.customer.util.GenerateUniqueID;

@Service
public class CustomerServiceImpl implements CustomerService {
	private final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public Customer getCustomer(String customerNumber) {
	
		logger.info("Entered Customer getCustomer().  customerNumber=" + customerNumber);
		
		Customer customer = null;
		customer = this.customerRepo.findByCustomerNumber(customerNumber);		
		logger.info("Leaving Customer getCustomer().  customerNumber=" + customerNumber);
		
		return customer;
	}
	
	@Override
	public List<Customer> getCustomers() {
			
		List<Customer> customers = null;
		
		customers = this.customerRepo.findAll();
		
		return customers;
	}
	
	@Override
	public Customer addCustomer(CustomerInput customerInput) {
		
		Customer customer = new Customer();
		
		customer.setFirstName(customerInput.getFirstName());
		customer.setLastName(customerInput.getLastName());
		customer.setEmail(customerInput.getEmail());
		
		String customerNumber = GenerateUniqueID.GenerateID("CUST");
		customer.setCustomerNumber(customerNumber);
		customer = this.customerRepo.insert(customer);
		return customer;
	}
}
