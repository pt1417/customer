package com.ibm.customer.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.ibm.customer.model.Customer;
import com.ibm.customer.repo.CustomerRepo;

class CustomerServiceImplTest {
	@Mock
	private CustomerRepo customerRepo;
	
	@InjectMocks
	CustomerServiceImpl customerService;
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@DisplayName("Test customerService getCustomer w/ valid customerNumber")
	@Test
	public void testGetCustomerExistingCustomerNumber() {
		//Given
		String customerNumber = "CUST456";
		Customer mockedCustomer = null;
		//public Customer(String customerNumber, String firstName, String lastName, String email)
		mockedCustomer = new Customer(customerNumber,"John","Smith","js@abc.com");
		
		//When
		when(customerRepo.findByCustomerNumber(customerNumber)).thenReturn(mockedCustomer);		
		Customer customer = customerService.getCustomer(customerNumber);
		
		//Then
		assertNotNull(customer, "Customer should not be null");
		assertEquals(customer, mockedCustomer, "customer should be the same as: " + mockedCustomer);

		verify(customerRepo).findByCustomerNumber(customerNumber);
	}

}
