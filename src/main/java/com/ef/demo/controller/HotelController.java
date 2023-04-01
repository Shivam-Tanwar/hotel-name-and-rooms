package com.ef.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ef.demo.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	private HotelService hsImpl;
	
	@RequestMapping(value = {"/registerhotel"}, method = RequestMethod.POST)
	public String registerhotel(String name){
		 //hsImpl.saveNewHotel(name);
		 return "ok";
	}
//	@RequestMapping(value = {"/updatehotel"}, method = RequestMethod.PUT)
//	public void updatehotel(Hotel hotel) {
//		hsImpl.updateHotel(hotel);
//	}
//    @RequestMapping(value = {"/deletehotel"}, method = RequestMethod.DELETE)
//    public void deletehotel(int hotelId) {
//    	hsImpl.deleteHotel(hotelId);
//    }
	
	@GetMapping("/service")
	public String service(){
		return "hotelservice";
	}

}
