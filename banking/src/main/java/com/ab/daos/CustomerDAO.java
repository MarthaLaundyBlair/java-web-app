package com.ab.daos;

import java.util.List;

import com.ab.models.Customer;

public interface CustomerDAO {

		public int register(Customer c);
		public Customer login(String username, String password);
		//public List<Customer> loadRegisteredCustomers();
		//public String loadRegisteredCustomersString();
}
