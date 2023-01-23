package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Model.Customer;
import com.example.Repository.CustomerRepository;
import com.example.Service.CustomerService;

//to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects
@Repository
public class CustomerServiceImpl implements CustomerService{    //implement CustomerService interface
	
	@Autowired      //used to connect CustomerRepository
	CustomerRepository customerRepository;    //use all method of customerRepository for CRUD operation
	@Override
	public Customer createCustomer(Customer customer) {     //method used to save customer 
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> findAllCustomer() {        //method used to find customer 
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomer(int customerid) {     //method used delete customer
		// TODO Auto-generated method stub
		customerRepository.deleteById(customerid);	
	}

	@Override
	public Customer updateCustomer(Customer customer) {      //method used to update customer
		// TODO Auto-generated method stub
		Customer _customer=customerRepository.findById(customer.getCustomerid()).get();
		_customer.setCustomername(customer.getCustomername());
		_customer.setContactno(customer.getContactno());
		_customer.setEmail(customer.getEmail());
		_customer.setAddress(customer.getAddress());
		_customer.setGender(customer.getGender());
		_customer.setPurchesescar(customer.getPurchesescar());
		return customerRepository.save(_customer);
	}

	@Override
	public List<Customer> findBycustomerid(int customerid) {      //method for get customer by its id
		// TODO Auto-generated method stub
		return customerRepository.findBycustomerid(customerid);
	}

	@Override
	public List<Customer> findBycustomername(String customername) {    //method for get customer by its name
		// TODO Auto-generated method stub
		return customerRepository.findBycustomername(customername);
	}

	
}
