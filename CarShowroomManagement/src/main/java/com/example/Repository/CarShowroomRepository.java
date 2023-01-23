package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.CarShowroom;

//interface extends JpaRepository.JpaRepository contains API for basic CRUD operations
public interface CarShowroomRepository extends JpaRepository<CarShowroom,Integer>{
	
	//Custom method
	List<CarShowroom> findByshowroomid(int showroomid);
	List<CarShowroom> findByshowroomname(String showroomname);

}
