package com.ef.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ef.demo.model.Hotel;
import com.ef.demo.repository.HotelRepository;
@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepo;
	
	@Override
	public List<Hotel> getHotels() {
		List<Hotel> hotels = hotelRepo.findAll();
		return hotels;
	}
	@Override
	public Optional<Hotel> findByHotelName(String Hotel_name) {
		Optional<Hotel> hotel = hotelRepo.findByHotelName(Hotel_name);
		return hotel;
	}

	@Override
	public List<Hotel> findByRoomTypes(String Room_types) {
		return hotelRepo.findByRoomTypes(Room_types);
	}
	@Override
	public List<Hotel> findByRoomTypes() {
		return hotelRepo.findByRoomTypes();
	}
	@Override
	public void saveNewHotel(String hotelName) {
		hotelRepo.createNewHotel(hotelName);
		
	}
	@Override
	public void updateHotel(Hotel hotel) {
		hotelRepo.updateHotel(hotel);
		
	}
	@Override
	public void deleteHotel(int hotelId) {
		hotelRepo.deleteHotel(hotelId);
		
	}
	

}
