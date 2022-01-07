package com.nttdata.services;

import java.util.List;
import com.nttdata.repository.Customer;

public interface CustomerServiceI {

	public void insertCustomer(Customer customer);
	
	public Customer searchByID(Long ID);

	public List<Customer> searchAll();

	public List<Customer> searchByName(String name);

	public List<Customer> searchByFullName(String name, String lastname1, String lastname2);

	public void updateCustomer(Customer customer);

	public void deleteCustomer(Customer customer);
	
}
