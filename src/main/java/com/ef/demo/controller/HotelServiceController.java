package com.ef.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelServiceController {
	@GetMapping("/service")
	public String service(){
		return "hotelservice";
		
	}

}
