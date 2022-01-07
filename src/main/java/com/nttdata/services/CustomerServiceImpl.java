package com.nttdata.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.repository.Customer;
import com.nttdata.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerServiceI {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public void insertCustomer(Customer customer) {
		customerRepo.save(customer);
	}
	
	@Override
	@Transactional
	public Customer searchByID(Long ID) {
		Customer result = customerRepo.findByID(ID);
		return result;
	}

	@Override
	public List<Customer> searchAll() {
		List<Customer> result = customerRepo.findAll();
		return result;
	}

	@Override
	public List<Customer> searchByName(String name) {
		List<Customer> result = customerRepo.findByName(name);
		return result;
	}

	@Override
	public List<Customer> searchByFullName(String name, String lastname1, String lastname2) {
		List<Customer> result = customerRepo.findByNameAndLastname1AndLastname2(name, lastname1, lastname2);
		return result;
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerRepo.save(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		customerRepo.delete(customer);
	}

}
