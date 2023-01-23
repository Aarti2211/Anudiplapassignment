package com.example.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.CarShowroom;
import com.example.Service.CarShowroomService;

@RestController     //create RESTful web services using Spring MVC.
public class CarShowroomController {
	
	@Autowired       //used to connect CarShowroomService
	CarShowroomService carshowroomService;
	
	
	@PostMapping("/showroom")																		//mapping HTTP POST requests onto specific handler methods.
	public ResponseEntity<CarShowroom> createShowroomDetail(@Valid @RequestBody CarShowroom carshowroom) //method to post the value
	
	 //ResponseEntity is used to manipulate the HTTP Response
	
	{
		return new ResponseEntity<CarShowroom>(carshowroomService.createShowroomDetail(carshowroom),HttpStatus.CREATED);
	}
	
	
	@GetMapping(value="/showroom")						//mapping HTTP GET requests onto specific handler methods.
	public List<CarShowroom> findAllShowroomDetail()    //method for retrieve details
	{
		return carshowroomService.findAllShowroomDetail();
	}
	
	
	@DeleteMapping(value="/showroom/{showroomid}")					//mapping HTTP DELETE requests onto specific handler methods.	
	public String deleteShowroomDetail(@PathVariable int showroomid)      //method for deleting the details
	{
		carshowroomService.deleteShowroomDetail(showroomid);
		return " Showroomdetail Deleted ";
	}
	
	
	@PutMapping(value="/showroom")										//mapping HTTP PUT requests onto specific handler methods
	public CarShowroom updateShowroomDetail(@RequestBody CarShowroom carshowroom)  //method for update details
	{
		return carshowroomService.updateShowroomDetail(carshowroom);
	}
	
	
	@GetMapping("/showroom/showmroomid/{showroomid}")    								 //mapping HTTP GET requests onto specific handler methods. 
	public List<CarShowroom> findByshowroomid(@RequestBody @PathVariable int showroomid)		//method for retrieve value by id
	{
		return carshowroomService.findByshowroomid(showroomid);
	}
	@GetMapping("/showroom/showroomname/{showroomname}")      
	public List<CarShowroom> findByshowroomname(@RequestBody @PathVariable String showroomname)     //method for retrieve value by name
	{
		return carshowroomService.findByshowroomname(showroomname);
	}
}
