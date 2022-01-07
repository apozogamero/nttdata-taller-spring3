package com.nttdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{
	
	public Customer findByID(Long ID);
	
	public List<Customer> findByName(String name);
	
	public List<Customer> findByNameAndLastname1AndLastname2(String name, String lastname1, String lastname2);
}
