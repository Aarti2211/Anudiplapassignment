package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Model.CarShowroom;
import com.example.Repository.CarShowroomRepository;
import com.example.Service.CarShowroomService;

//to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.
@Repository      
public class CarShowroomServiceImpl implements CarShowroomService{     //implement the CarShowroomService
	
	@Autowired      //used to connection with CarShowroomRepository interface
	CarShowroomRepository carshowroomRepository;       //use all method of carshowroomRepository for CRUD operation

	@Override
	
	public CarShowroom createShowroomDetail(CarShowroom carshowroom) {     //method used to save the Showroomdetails
		// TODO Auto-generated method stub
		return carshowroomRepository.save(carshowroom);
	}

	@Override
	
	public List<CarShowroom> findAllShowroomDetail() {     //method used to find the all details of showroom
		// TODO Auto-generated method stub
		return carshowroomRepository.findAll();
	}

	@Override
	
	public void deleteShowroomDetail(int showroomid) {     //method used to delete showroomdetails
		// TODO Auto-generated method stub
		carshowroomRepository.deleteById(showroomid);
	}

	@Override
	public CarShowroom updateShowroomDetail(CarShowroom carshowroom) {      //methos used to update details of showroom
		// TODO Auto-generated method stub
		CarShowroom _carshowroom=carshowroomRepository.findById(carshowroom.getShowroomid()).get(); 
		_carshowroom.setShowroomname(carshowroom.getShowroomname());
		_carshowroom.setContactno(carshowroom.getContactno());
		_carshowroom.setEmail(carshowroom.getEmail());
		_carshowroom.setAddress(carshowroom.getAddress());
		_carshowroom.setCustomerlist(carshowroom.getCustomerlist());
		return carshowroomRepository.save(_carshowroom);
	}

	@Override
	public List<CarShowroom> findByshowroomid(int showroomid) {      //method to get showroom by its id
		// TODO Auto-generated method stub
		return carshowroomRepository.findByshowroomid(showroomid);
	}

	@Override
	public List<CarShowroom> findByshowroomname(String showroomname) {    //method to get showroom by its name
		// TODO Auto-generated method stub
		return carshowroomRepository.findByshowroomname(showroomname);
	}
	

}