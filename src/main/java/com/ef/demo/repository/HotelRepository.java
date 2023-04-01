package com.ef.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ef.demo.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
	
//	Optional<Hotel> findByHotelName(String Hotel_name);
//	List<Hotel> findByRoomTypes(String Room_types);
//	List<Hotel> findByRoomTypes();

	void createNewHotel(String hotelName);
//	void updateHotel(Hotel hotel);
//	void deleteHotel(int hotelId);
}