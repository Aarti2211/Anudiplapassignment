package com.example.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.Model.CarShowroom;


@Service     //used to mark the class as a service provider
public interface CarShowroomService {
	
	//define abstract methods
	
	CarShowroom createShowroomDetail(CarShowroom carshowroom);
	List<CarShowroom> findAllShowroomDetail();
	void deleteShowroomDetail(int showroomid);
	CarShowroom updateShowroomDetail(CarShowroom carshowroom);
	List<CarShowroom> findByshowroomid(int showroomid);
	List<CarShowroom> findByshowroomname(String showroomname);
}
