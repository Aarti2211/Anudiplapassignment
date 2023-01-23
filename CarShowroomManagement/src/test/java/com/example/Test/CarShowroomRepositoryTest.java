package com.example.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.Model.CarShowroom;
import com.example.Model.Customer;
import com.example.Repository.CarShowroomRepository;
import com.example.Repository.CustomerRepository;
import com.example.Service.CarShowroomService;

//used to test the application
@SpringBootTest
public class CarShowroomRepositoryTest {
	
	@MockBean										//used to add mocks to spring applicationContext
	CarShowroomRepository carshowroomRepository;
	
	@Autowired										//used to connect carshowroomservice
	CarShowroomService carshowroomService;
	@Test
	void testAddShowroomdetail()					//test the savecarshowroom method
	{
		List<Customer> customerlist=Stream
		.of(new Customer(1,"123456778234","Aarti","a@gmail.com","9766769434","pune","female",24,"swipt"),new Customer(2,"998045673524","Shiv","s@gmail.com","3452788963","Sonke","male",30,"Mecidize"))
				.collect(Collectors.toList());
		CarShowroom c=new CarShowroom(1,"Tatacar","9921164436","T@gmail.com","pune",customerlist);
		Mockito.when(carshowroomRepository.save(c)).thenReturn(c);
		assertEquals(c,carshowroomService.createShowroomDetail(c));
	}

	@Test
	void testGetAllCarShowroom() 					//test the retrieve all showroomdetails method
	{
		List<Customer> customerlist=Stream
				.of(new Customer(1,"123456778234","Aarti","a@gmail.com","9766769434","pune","female",24,"swipt"),new Customer(2,"998045673524","Shiv","s@gmail.com","3452788963","Sonke","male",30,"Mecidize"))
						.collect(Collectors.toList());
		List<Customer> customerlist1=Stream
				.of(new Customer(3,"823456738262","Pranu","p@gmail.com","8366769426","Latur","female",22,"BMW"),
						new Customer(4,"698045673525","Mahesh","m@gmail.com","9452738967","Nashik","male",28,"Ford"))
						.collect(Collectors.toList());
		
		
		List<CarShowroom> carshowroom = Stream
				.of(new CarShowroom(1,"Tatacar","9921164436","T@gmail.com","pune",customerlist),
				new CarShowroom(2,"Tatacar","9921164436","T@gmail.com","pune",customerlist1))
				.collect(Collectors.toList());
		Mockito.when(carshowroomRepository.findAll()).thenReturn(carshowroom);
		assertEquals(2,carshowroomService.findAllShowroomDetail().size());
		
	}
	@Test
	void testDeleteShowroomDetail() 			//test the delete showroomdetails method
	{
		carshowroomService.deleteShowroomDetail(1);
		Mockito.verify(carshowroomRepository).deleteById(1);
	}

}
