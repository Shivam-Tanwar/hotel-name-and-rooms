package com.ef.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name ="hotelservice")
public class HotelService implements hotelservice {
	@SequenceGenerator(
            name = "hotel_sequence",
            sequenceName = "hotel_sequence",
            allocationSize = 1
    )
	@Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_sequence"
    )
    private Long id;
	
	@NotNull(message = "hotel name cannot be empty")
    @Column(name = "hotel_name")
    private String hotelName;

	@NotNull(message = "room number should be selected")
	@Length(min = 7, message = "Rooms should be atleast 7 characters long")
	@Column(name = "room_no")
	private String roomNo;
	
    @NotNull(message = "Room types cannot be empty")
    @Column(name = "room_types")
    private String roomTypes;

    public HotelService() {
    	
    }

	public HotelService(@NotNull(message = "hotel name cannot be empty") String hotelName,
			@NotNull(message = "room number should be selected") @Length(min = 7, message = "Rooms should be atleast 7 characters long") String roomNo,
			@NotNull(message = "Room types cannot be empty") String roomTypes) {
		super();
		this.hotelName = hotelName;
		this.roomNo = roomNo;
		this.roomTypes = roomTypes;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomTypes() {
		return roomTypes;
	}

	public void setRoomTypes(String roomTypes) {
		this.roomTypes = roomTypes;
	}
    

}
