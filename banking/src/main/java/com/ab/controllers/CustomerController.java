package com.ab.controllers;

import com.ab.daos.CustomerDAO;
import com.ab.models.Customer;

public class CustomerController {
	
	private CustomerDAO customerDAO;

	public CustomerController(CustomerDAO customerDAO) {

		this.customerDAO = customerDAO;
	}
	
	public int registerCustomer(Customer c) {
		
		return this.customerDAO.register(c);
	}
			
			
	public Customer loginCustomer(String username,String password) {
		
		return this.customerDAO.login(username, password);
	}

}
