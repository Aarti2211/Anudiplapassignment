package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.Customer;


@Service   //used to mark the class as a service provider
public interface CustomerService {
	
	//define abstract methods
	Customer createCustomer(Customer customer);
	List<Customer> findAllCustomer();
	void deleteCustomer(int customerid);
	Customer updateCustomer(Customer customer);
	List<Customer> findBycustomerid(int customerid);
	List<Customer> findBycustomername(String customername);

}
