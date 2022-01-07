package com.nttdata;

import com.nttdata.repository.Customer;
import com.nttdata.services.CustomerServiceI;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApp implements CommandLineRunner {

	@Autowired
	private CustomerServiceI customerService;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerApp.class, args);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		
		c1.setID(1L);
		c1.setName("Marco");
		c1.setLastname1("Palmero");
		c1.setLastname2("Monroy");
		c1.setIdn("01223333E");
		c1.setBirthdate(new Date(101, 3, 8));
		
		c2.setName("Jorge");
		c2.setLastname1("Dayoub");
		c2.setLastname2("Dayoub");
		c2.setIdn("21122012F");
		c2.setBirthdate(new Date(101, 6, 30));
		
		c3.setName("Bruno");
		c3.setLastname1("Cruz");
		c3.setLastname2("Luque");
		c3.setIdn("55555558L");
		c3.setBirthdate(new Date(101, 8, 20));
		
		
		
		customerService.insertCustomer(c1);
		customerService.insertCustomer(c2);
		customerService.insertCustomer(c3);
		
		
		
		System.out.println("-- BÚSQUEDA DE TODOS LOS CLIENTES --");

		customerService.searchAll().forEach(System.out::println);
		
		System.out.println("-- BÚSQUEDA DE CLIENTES POR NOMBRE --");

		customerService.searchByName("Jorge").forEach(System.out::println);

		System.out.println("-- BÚSQUEDA DE CLIENTES POR NOMBRE Y APELLIDOS --");

		customerService.searchByFullName("Bruno", "Cruz", "Luque").forEach(System.out::println);
		
	}

}
