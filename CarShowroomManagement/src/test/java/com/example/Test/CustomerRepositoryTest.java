package com.example.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.Model.Customer;
import com.example.Repository.CustomerRepository;
import com.example.Service.CustomerService;

//used to test the application
@SpringBootTest
public class CustomerRepositoryTest {
	
	@MockBean							//used to add mocks to spring applicationContext
	CustomerRepository customerRepository;	
	
	@Autowired							//used to connect customerservice
	CustomerService customerService;
	
	@Test
	void testSaveCustomer() 	//test the savecustomer method
	{
		Customer c = new Customer(1,"762835048625","Aarti","a@gmail.com","9921164436","Pune","female",24,"Swipt");
		Mockito.when(customerRepository.save(c)).thenReturn(c);
		assertEquals(c, customerService.createCustomer(c));
	}
	@Test
	void testGetAllCustomer() 		//test the retrieve all customer method
	{
		List<Customer> customer = Stream
				.of(new Customer(1,"762835048625","Aarti","a@gmail.com","9921164436","Pune","female",24,"Swipt"),
						new Customer(2,"962235018643","Shiv","s@gmail.com","9761461420","Solapur","male",30,"Tesla"))
				.collect(Collectors.toList());
		Mockito.when(customerRepository.findAll()).thenReturn(customer);
		assertEquals(2,customerService.findAllCustomer().size());
		
	}
	
	@Test
	void testDeleteCustomer() 			//test the delete method
	{
		customerService.deleteCustomer(1);
		Mockito.verify(customerRepository).deleteById(1);
	}


}
