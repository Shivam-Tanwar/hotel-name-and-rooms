package com.ef.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ef.demo.model.User;

@Repository
public interface HotelServiceRepository extends JpaRepository<Hotelservice, Long> { {
	 Optional<HotelService> findByHotel_name(String Hotel_name);
	    Optional<HotelService> findByRoom_types(String Room_types);
	}


}
