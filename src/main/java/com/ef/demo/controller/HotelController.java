package com.ef.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ef.demo.service.HotelServiceImpl;

@RestController
public class HotelController {
	@Autowired
	private HotelServiceImpl hsImpl;
	
	@RequestMapping(value = {"/registerhotel"}, method = RequestMethod.POST)
	public void registerhotel(String name){
		 hsImpl.saveNewHotel(name);
	}
	@RequestMapping(value = {"/registerhotel"}, method = RequestMethod.PUT)
	public void registerhotel(String name) {
		hsImpl.saveNewHotel(name);
	}
    @RequestMapping(value = {"/registerhotel"}, method = RequestMethod.DELETE)
    public void registerhotel(int hotelId) {
    	hsImpl.saveNewHotelId(hotelId);
    }
	
	@GetMapping("/service")
	public String service(){
		return "hotelservice";
	}

}
